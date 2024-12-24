@file:Suppress("DEPRECATION")

package com.example.angkotin.data

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.toObject

object FirestoreRepository {
    fun getJalurData(callback: (List<Jalur>) -> Unit) {
        val db = FirebaseFirestore.getInstance()
        val jalurCollection = db.collection("Jalur")

        jalurCollection.get()
            .addOnSuccessListener { documents ->
                val routes = documents.mapNotNull { document ->
                    val jalur = document.toObject<Jalur>()
                    // Convert List_ID_Jalan to a proper list
                    val listIdJalanString = jalur.List_ID_Jalan
                    val listIdJalan = listIdJalanString.split(",").map { it.trim() }

                    // Return the Jalur object with processed List_ID_Jalan
                    jalur.copy(List_ID_Jalan = listIdJalan.joinToString(",")) // Or update your Jalur model if necessary
                }
                callback(routes)
            }
            .addOnFailureListener { exception ->
                println("Error getting documents: $exception")
                callback(emptyList()) // Return empty list on failure
            }
    }



    fun getHalteData(onSuccess: (List<Halte>) -> Unit, onError: (Exception) -> Unit) {
        val db = FirebaseFirestore.getInstance()
        val halteCollection = db.collection("Halte")

        halteCollection.get()
            .addOnSuccessListener { documents ->
                val halteList = documents.map { document ->
                    document.toObject<Halte>()
                }
                onSuccess(halteList)
            }
            .addOnFailureListener { exception ->
                onError(exception)
            }
    }
}
