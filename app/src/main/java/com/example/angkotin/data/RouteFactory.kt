package com.example.angkotin.data

import com.example.angkotin.R

object RouteFactory {

    fun getRoute(routeId: String): RouteEntity? {
        return when (routeId) {
            "1" -> RouteEntity( //ABB
                id = routeId,
                routeName = "Arjosari - Bunul", // Add route name
                streetNames = listOf( // Add street names in order
                    "Jalan Hamid Rusdi Timur, 317",
                    "Jalan Warinoi, 103",
                    "Jalan Simpang Sulfat Selatan 16",
                    "Jalan Simpang L.A. Sucipto",
                    "Jalan Simpang L.A. Sucipto 159",
                    "Jalan Laksda Adi Sucipto 308",
                    "Jalan Laksda Adi Sucipto 85",
                    "Jalan Borobudur, 5g",
                    "Jalan Simpang Borobudur 60",
                    "Jalan Ikan Nus I 2",
                    "Jalan Ikan Piranha 191",
                    "Jalan Ikan Tombro 20",
                    "Jalan Cakalang 282",
                    "Jalan Cakalang 197",
                    "Jalan Cakalang 2b"
                ),
                logo = R.drawable.abb,
                origin = CoordinatesEntity(-7.973185814963524, 112.64642245425703),
                destination = CoordinatesEntity(-7.930506413872954, 112.64732948521055),
                waypoints = listOf(
                    CoordinatesEntity(-7.970529906501243, 112.65189179465077),
                    CoordinatesEntity(-7.963669836226442, 112.65449870835417),
                    CoordinatesEntity(-7.953191379704451, 112.65834558334514),
                    CoordinatesEntity(-7.950699781376683, 112.65948046502811),
                    CoordinatesEntity(-7.947836946647683, 112.65607483712937),
                    CoordinatesEntity(-7.947572725821211, 112.65550459830962),
                    CoordinatesEntity(-7.940355204007259, 112.63858378674665),
                    CoordinatesEntity(-7.937215851884315, 112.63772230695412),
                    CoordinatesEntity(-7.933925797183704, 112.63699673471915),
                    CoordinatesEntity(-7.931452003238448, 112.63742352938816),
                    CoordinatesEntity(-7.925895960030882, 112.63331156459579),
                    CoordinatesEntity(-7.926099326665393, 112.63886980700596),
                    CoordinatesEntity(-7.929697454764448, 112.64304689676942)
                )
            )
            "2" -> RouteEntity( //ABG
                id = routeId,
                routeName = "Arjosari - Hamid Rusdi via Soekarno Hatta", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Hamid Rusdi",
                    "Terminal Bayangan Gadang Bumiayu",
                    "Jalan Kolonel Sugiono 377-387",
                    "Jalan Kolonel Sugiono 195",
                    "Jalan Laksamana Martadinata 38",
                    "Jalan Trunojoyo 10",
                    "Jalan Dokter Cipto 28",
                    "Jalan Wage Rudolf Supratman 7",
                    "Jalan Tawangmangu 19",
                    "Jalan Bungur",
                    "Jalan Melati 43-49",
                    "Jalan Melati 1",
                    "Jalan Kalpataru 131",
                    "Jalan Soekarno Hatta 24",
                    "Jalan Soekarno Hatta 9",
                    "Jalan Soekarno Hatta 66b",
                    "Jalan Borobudur 7",
                    "Jalan Raya Malang - Surabaya",
                    "Terminal Arjosari"
                ),
                logo = R.drawable.abg,
                origin = CoordinatesEntity(-8.026039664444026, 112.6429187627923),
                destination = CoordinatesEntity(-7.933421584595167, 112.65899109294608),
                waypoints = listOf(
                    CoordinatesEntity(-8.02288103044627, 112.62762907179074),
                    CoordinatesEntity(-8.010942423046018, 112.62929524677101),
                    CoordinatesEntity(-8.0014198405733, 112.63124332026683),
                    CoordinatesEntity(-7.988377054898887, 112.63518982936628),
                    CoordinatesEntity(-7.978289267511737, 112.63689727172904),
                    CoordinatesEntity(-7.969292811993498, 112.63739928786306),
                    CoordinatesEntity(-7.96510862353199, 112.63602478453673),
                    CoordinatesEntity(-7.9610201576445, 112.63135513205383),
                    CoordinatesEntity(-7.954513294771312, 112.63173517682998),
                    CoordinatesEntity(-7.953825148508417, 112.6316910550626),
                    CoordinatesEntity(-7.951462148289679, 112.63163018704671),
                    CoordinatesEntity(-7.948553561817471, 112.62642193023247),
                    CoordinatesEntity(-7.941649984396745, 112.62233171165722),
                    CoordinatesEntity(-7.941204013841131, 112.62248198372939),
                    CoordinatesEntity(-7.9398565559432805, 112.6205503662356),
                    CoordinatesEntity(-7.9388244995567305, 112.63425900596751),
                    CoordinatesEntity(-7.938821843053774, 112.6342429127138)

                    )
            )
            "3" -> RouteEntity( //ADL
                id = routeId,
                routeName = "Arjosari - Landungsari", // Add route name
                streetNames = listOf( // Add street names in order
                    "Jalan Simpang Panji Suroso 708",
                    "Jalan Raya Malang - Surabaya 143-145",
                    "Jalan Letjend S. Parman 131",
                    "Jalan Letjen Sutoyo 91",
                    "Jalan Dokter Cipto 28",
                    "Jalan Tugu",
                    "Jalan Semeru 57",
                    "Jalan Besar Ijen 84",
                    "Jalan Mayjend. Panjaitan 89",
                    "Jalan Mayjend. Panjaitan 143",
                    "Jalan M.T. Haryono 4",
                    "Jalan M.T. Haryono 213",
                    "Jalan Tlogomas 106",
                    "Jalan Tlogomas A1",
                    "Terminal Landungsari"
                ),
                logo = R.drawable.adl,
                origin = CoordinatesEntity(-7.935735461485809, 112.65773015608703),
                destination = CoordinatesEntity(-7.924435252452147, 112.59809838174111),
                waypoints = listOf(
                    CoordinatesEntity(-7.934958467045997, 112.64573389500093),
                    CoordinatesEntity(-7.946505939121477, 112.64030110695276),
                    CoordinatesEntity(-7.9571784417853175, 112.63789000815771),
                    CoordinatesEntity(-7.969306424018259, 112.63636193662008),
                    CoordinatesEntity(-7.977374030682211, 112.63464432141451),
                    CoordinatesEntity(-7.972743215759499, 112.62254627367544),
                    CoordinatesEntity(-7.96607816240135, 112.62467421683556),
                    CoordinatesEntity(-7.956329334744082, 112.62196877313599),
                    CoordinatesEntity(-7.953990955793312, 112.61993087602512),
                    CoordinatesEntity(-7.946210981114051, 112.61248161692089),
                    CoordinatesEntity(-7.9400790076537096, 112.60816327288647),
                    CoordinatesEntity(-7.927853306258549, 112.60293424996733),
                    CoordinatesEntity(-7.925127849029349, 112.59767179221475)
                )
            )
            "4" -> RouteEntity( //AJG/H
                id = routeId,
                routeName = "Arjosari - Hamid Rusdi", // Add route name
                streetNames = listOf( // Add street names in order
                    "Jalan Indragiri",
                    "Jalan Taman Serayu 5",
                    "Jalan Raden Tumenggung Suryo 4",
                    "Jalan Hamid Rusdi 10 B",
                    "Jalan Urip Sumoharjo 38",
                    "Jalan Trunojoyo 10",
                    "Jalan Ir.Haji Juanda 6a",
                    "Jalan Professor Moch Yamin 101",
                    "Jalan Susanto 14",
                    "Jalan Sonokeling 41",
                    "Jalan Janti Barat 58",
                    "Jalan Sudanco Supriadi 76",
                    "Jalan Sudanco Supriadi 73",
                    "Jalan Apida Satsui Tubun 9",//1
                    "Jalan Apida Satsui Tubun 9 part 2",//2
                    "Jalan Terminal Bayangan Gadang Bumiayu",
                    "Terminal Hamid Rusdi 1"
                ),
                logo = R.drawable.ajg,
                origin = CoordinatesEntity(-7.958749020244285, 112.64019785476991),
                destination = CoordinatesEntity(-8.026024666025872, 112.64291882856833),
                waypoints = listOf(
                    CoordinatesEntity(-7.962176386516594, 112.64034395109806),
                    CoordinatesEntity(-7.9667084414714076, 112.63875597193432),
                    CoordinatesEntity(-7.971276013367243, 112.6438622290098),
                    CoordinatesEntity(-7.975439813642266, 112.64118616202549),
                    CoordinatesEntity(-7.978289267511737, 112.63689727172904),
                    CoordinatesEntity(-7.987352541535933, 112.63924409097908),
                    CoordinatesEntity(-7.992872128941118, 112.63138486150554),
                    CoordinatesEntity(-7.996378626720109, 112.62888065533531),
                    CoordinatesEntity(-8.001141210461203, 112.62716772123383),
                    CoordinatesEntity(-8.001414401748665, 112.62144541761512),
                    CoordinatesEntity(-8.0004282979551, 112.61813008204497),
                    CoordinatesEntity(-8.000459648744629, 112.6181361001527),
                    CoordinatesEntity(-8.020786806031587, 112.6206821081419 ),
                    CoordinatesEntity(-8.021650248266447, 112.62307130894372),
                    CoordinatesEntity(-8.020791697566855, 112.62064415878169)
                )
            )
            "5" -> RouteEntity( //AL
                id = routeId,
                routeName = "Arjosari - Landungsari", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Landungsari",
                    "Jalan Tlogomas A1",
                    "Jalan M.T. Haryono 213",
                    "Jalan Gajayana 683",
                    "Jalan Veteran Malang 2",
                    "Tpu Untung Suropati 1",
                    "Simpang Ijen 2",
                    "Jalan Jombang 11-17",
                    "Jalan Bondowoso 2",
                    "Jalan Semeru 57",
                    "Stadion Gajayana 2",
                    "Rajabali Kahuripan 2",
                    "Jalan Tugu",
                    "Stasiun Malang Pintu Barat 1",
                    "Pasar Klojen Patimura",
                    "Jalan Dokter Cipto 28",
                    "Panglima Sudirman 2",
                    "Rs Lavalette 2",
                    "Jalan Mahakam, 20",
                    "Jalan Tenaga Utara 32",
                    "Jalan Laksda Adi Sucipto 85",
                    "Smp Kartika IV 8-1",
                    "Jalan Raya Malang - Surabaya 143-145",
                    "Sdn Purwodadi 1",
                    "Asabri",
                    "Terminal Arjosari"
                ),
                logo = R.drawable.al,
                origin = CoordinatesEntity(-7.9251133562208445, 112.59767696780783),
                destination = CoordinatesEntity(-7.9333396847892494, 112.65898336609523),
                waypoints = listOf(
                    CoordinatesEntity(-7.924450194527168, 112.59810786405784),
                    CoordinatesEntity(-7.936341983778895, 112.60562952045784),
                    CoordinatesEntity(-7.9444448091125945, 112.60977476395468),
                    CoordinatesEntity(-7.957308456840454, 112.61808564972662),
                    CoordinatesEntity(-7.959100331455888, 112.62070989063841),
                    CoordinatesEntity(-7.96344454738456, 112.62269491726511),
                    CoordinatesEntity(-7.966157903419187, 112.61571936127469),
                    CoordinatesEntity(-7.9686657670623635, 112.61752254774575),
                    CoordinatesEntity(-7.972740968851224, 112.6225641381079),
                    CoordinatesEntity(-7.975494760113607, 112.62348222343913),
                    CoordinatesEntity(-7.976863012660007, 112.63296372133071),
                    CoordinatesEntity(-7.9765283201649, 112.63389586857241),
                    CoordinatesEntity(-7.977533414487015, 112.63682069324595),
                    CoordinatesEntity(-7.973439692502067, 112.63661807467169),
                    CoordinatesEntity(-7.9692804902134515, 112.6374010012189),
                    CoordinatesEntity(-7.969233190459244, 112.63835887254439),
                    CoordinatesEntity(-7.966032131627177, 112.63756798849725),
                    CoordinatesEntity(-7.963877718180952, 112.63679725198865),
                    CoordinatesEntity(-7.943822183595446, 112.6454832983156),
                    CoordinatesEntity(-7.94279938726182, 112.64638865263304),
                    CoordinatesEntity(-7.937160506131329, 112.64434709649291),
                    CoordinatesEntity(-7.93490826642108, 112.64564484778981),
                    CoordinatesEntity(-7.93277605327938, 112.64680664967888),
                    CoordinatesEntity(-7.932493025177043, 112.65621789445576)
                )
            )
            "6" -> RouteEntity( //AG
                id = routeId,
                routeName = "Arjosari - Hamid Rusdi", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Hamid Rusidi 1",
                    "Terminal Bayangan Gadang Bumiayu",
                    "Jalan Kolonel Sugiono 489",
                    "Jalan Kolonel Sugiono 195",
                    "Jalan Tanimbar 17",
                    "Jalan Syarif Al-Qodri 3",
                    "Jalan Kyai Haji Hasyim Ashari 6a",
                    "Jalan Jaksa Agung Suprapto 55",
                    "Jalan Letjen Sutoyo 91",
                    "Jalan Letjend S. Parman 131",
                    "Jalan Raya Malang - Surabaya 143-145",
                    "Jalan Raden Intan, 103",
                    "Terminal Arjosari"
                ),
                logo = R.drawable.ag,
                origin = CoordinatesEntity(-8.026046460090463, 112.64292649670011),
                destination = CoordinatesEntity(-7.933398126494149, 112.65898613742424),
                waypoints = listOf(
                    CoordinatesEntity(-8.02287732279597, 112.62762630234403),
                    CoordinatesEntity(-8.016247330092359, 112.62847981704513),
                    CoordinatesEntity(-8.001396775132228, 112.63127239701116),
                    CoordinatesEntity(-7.989671545836472, 112.6264797602327),
                    CoordinatesEntity(-7.985070229034296, 112.62775269204158),
                    CoordinatesEntity(-7.981805409928258, 112.62715632353317),
                    CoordinatesEntity(-7.967690552587117, 112.63305123604334),
                    CoordinatesEntity(-7.957173584528859, 112.63787778630552),
                    CoordinatesEntity(-7.946491899281691, 112.6402938319127),
                    CoordinatesEntity(-7.930692572429734, 112.64798090852176),
                    CoordinatesEntity(-7.9305972025027325, 112.65173981874928)
                )
            )
            "7" -> RouteEntity( //AMG/AMH
                id = routeId,
                routeName = "Arjosari - Hamid Rusdi", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Hamid Rusidi 2",
                    "Terminal Bayangan Gadang Bumiayu",
                    "Jalan Kolonel Sugiono 489",
                    "Jalan Kolonel Sugiono 377-387",
                    "Jalan Kolonel Sugiono 195",
                    "Jalan Kopral Usman 16",
                    "Jalan Pasar Besar 142",
                    "Jalan Trunojoyo 10",
                    "Jalan Dokter Cipto 28",
                    "Jalan Raden Tumenggung Suryo 4",
                    "Jalan Letnan Jenderal Sunandar Priyo Sudarmo 74",
                    "Jalan Letnan Jenderal Sunandar Priyo Sudarmo 12",
                    "Jalan Raya Malang - Surabaya 143-145",
                    "Terminal Arjosari"
                ),
                logo = R.drawable.amg,
                origin = CoordinatesEntity(-8.026044477767163, 112.64290891854569),
                destination = CoordinatesEntity(-7.9334201056038065, 112.6589782361244),
                waypoints = listOf(
                    CoordinatesEntity(-8.022884675234279, 112.62762245173155),
                    CoordinatesEntity(-8.016232248629668, 112.62847866822139),
                    CoordinatesEntity(-8.010940767869638, 112.62927139652321),
                    CoordinatesEntity(-8.00139709744221, 112.63125427485372),
                    CoordinatesEntity(-7.987519079655795, 112.63338987272418),
                    CoordinatesEntity(-7.986945059046813, 112.6354128676569),
                    CoordinatesEntity(-7.9782914131756915, 112.63686980676087),
                    CoordinatesEntity(-7.969292535427094, 112.63741159812963),
                    CoordinatesEntity(-7.9666836383007755, 112.63870690609248),
                    CoordinatesEntity(-7.9567672913660505, 112.64419408810295),
                    CoordinatesEntity(-7.955356108793477, 112.6448095913667),
                    CoordinatesEntity(-7.929229373693096, 112.64878798693886)
                )
            )
            "8" -> RouteEntity( //ASD
                id = routeId,
                routeName = "Arjosari - Dieng", // Add route name
                streetNames = listOf( // Add street names in order
                    "Jalan Terusan Dieng",
                    "Jl. Raya Langsep",
                    "Jl. Mundu",
                    "Jl. Kawi Atas",
                    "Jl. Taman Wilis",
                    "Jl. Klampok Kasri",
                    "Jl. Bondowoso",
                    "Jl. Gresik",
                    "Jl. Surabaya",
                    "Jl. Jakarta",
                    "JL. BOGOR 1",
                    "Jl. Veteran", //10
                    "Jl. Bogor",
                    "Jl. Jl. M. Panjaitan",
                    "Jl. Soekarno-Hatta",
                    "Jl. Cengkeh",
                    "Jl. Kalpataru",
                    "Jl. Melati",
                    "Jl. Mawar",
                    "Jl. Letjend Sutoyo",
                    "Jl. Sanan",
                    "Jl. Sulfat",
                    "Jl. Batu Bara",
                    "Jl. LA. Sucipto",
                    "Term. Arjosari"
                ),
                logo = R.drawable.asd,
                origin = CoordinatesEntity(-7.972511326086668, 112.607572722656),
                destination = CoordinatesEntity(-7.933424386042768, 112.65900215236287),
                waypoints = listOf(
                    CoordinatesEntity(-7.97363573911125, 112.61307085674808),
                    CoordinatesEntity(-7.97432412672794, 112.61436051900911),
                    CoordinatesEntity(-7.974340599474686, 112.61689490601168),
                    CoordinatesEntity(-7.972699854396919, 112.61680064540492),
                    CoordinatesEntity(-7.9700311150259395, 112.61701154039598),
                    CoordinatesEntity(-7.968048064648939, 112.61680638281432),//ff
                    CoordinatesEntity(-7.967342775779524, 112.61798868050631),
                    CoordinatesEntity(-7.9664796276348175, 112.61752277442935),
                    CoordinatesEntity(-7.966352865303541, 112.61863670892743),
                    CoordinatesEntity(-7.957290250801034, 112.61765282510511),
                    CoordinatesEntity(-7.9607447375809395, 112.62124160957437),
                    CoordinatesEntity(-7.95923099024379, 112.62063940361409),//10
                    CoordinatesEntity(-7.958905854832921, 112.62258072482572),
                    CoordinatesEntity(-7.939933466374865, 112.62066075178993),
                    CoordinatesEntity(-7.946606114264472, 112.62279772767242),
                    CoordinatesEntity(-7.9497269416495095, 112.62875696285373),
                    CoordinatesEntity(-7.954262037329175, 112.63177142845089),
                    CoordinatesEntity(-7.956688872067341, 112.63162741372385),
                    CoordinatesEntity(-7.960364950935103, 112.63688579652933),//5
                    CoordinatesEntity(-7.960557714305589, 112.6430096876094),
                    CoordinatesEntity(-7.959702811850672, 112.6484717255129),
                    CoordinatesEntity(-7.952652042980965, 112.6487130187799),
                    CoordinatesEntity(-7.945853735460654, 112.65242975698133)
                )
            )
            "9" -> RouteEntity( //CKL
                id = routeId,
                routeName = "Cemorokandang - Landungsari", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Landungsari",
                    "Jalan Tlogomas A1",
                    "Jalan Tlogomas 106",
                    "Jalan M.T. Haryono 213",
                    "Jalan Bunga Vinolia 401",
                    "Jalan Candi Panggung 21",
                    "Jalan Soekarno Hatta",
                    "Jalan Kalpataru 131",
                    "Jalan Kedawung 25",
                    "Jalan Letnan Jenderal Sunandar Priyo Sudarmo 74",
                    "Jalan Raden Tumenggung Suryo 4",
                    "Jalan Hamid Rusdi 10 B",
                    "Jalan Mayor Jenderal M. Wiyono 1h",
                    "Jalan Raya Sawojajar 100",
                    "Jalan Danau Limboto Barat",
                    "Jalan Danau Tigi",
                    "Jalan Ki Ageng Gribig 15",
                    "Jalan Raya Cemorokandang 51",
                    "Jalan Raya Kedungrejo 1209"
                ),
                logo = R.drawable.ckl,
                origin = CoordinatesEntity(-7.925109736556455, 112.59768009193175),
                destination = CoordinatesEntity(-7.983678307752278, 112.69249470860335),
                waypoints = listOf(
                    CoordinatesEntity(-7.924078788910734, 112.59889658626118),
                    CoordinatesEntity(-7.927860244174035, 112.602928919974),
                    CoordinatesEntity(-7.943581407991531, 112.61067712443284),
                    CoordinatesEntity(-7.938301283952456, 112.61184699540618),
                    CoordinatesEntity(-7.938131220197336, 112.62180664731397),
                    CoordinatesEntity(-7.940541232412982, 112.62170281290122),
                    CoordinatesEntity(-7.948530096491519, 112.6264349172123),
                    CoordinatesEntity(-7.952632686528162, 112.63718176153117),
                    CoordinatesEntity(-7.956706177118606, 112.64426399757299),
                    CoordinatesEntity(-7.966717252352202, 112.6387579000472),
                    CoordinatesEntity(-7.9724511062139465, 112.64532291714094),
                    CoordinatesEntity(-7.978533837803509, 112.64583126662798),
                    CoordinatesEntity(-7.978715929154035, 112.65432400777203),//5
                    CoordinatesEntity(-7.968628646406235, 112.65975979800443),
                    CoordinatesEntity(-7.972382648823542, 112.66337262356154),
                    CoordinatesEntity(-7.974135887388065, 112.67263064884764),
                    CoordinatesEntity(-7.9784311450201555, 112.68119895905504)
                )
            )
            "10" -> RouteEntity( //GA
                id = routeId,
                routeName = "Hamid Rusdi - Arjosari", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Hamid Rusidi 2",
                    "Terminal Bayangan Gadang Bumiayu",
                    "Jalan Apida Satsui Tubun 9",
                    "Jalan Sudanco Supriadi 73",
                    "Jalan Sudanco Supriadi 76",
                    "Jalan Kyai Haji Hasyim Ashari 17",
                    "Jalan Kyai Haji Wahid Hasyim 18",
                    "Jalan Kyai Haji Hasyim Ashari 6a",
                    "Jalan Tugu",
                    "Jalan Dokter Cipto 28",
                    "Jalan Letjen Sutoyo 91",
                    "Jalan Letjend S. Parman 131",
                    "Jalan Raya Malang - Surabaya 143-145",
                    "Terminal Arjosari"
                ),
                logo = R.drawable.ga,
                origin = CoordinatesEntity(-8.026034007646514, 112.64296006783054),
                destination = CoordinatesEntity(-7.933416021476172, 112.65900141426282),
                waypoints = listOf(
                    CoordinatesEntity(-8.023027540796704, 112.62757125546051),
                    CoordinatesEntity(-8.020795050863823, 112.62063041270424),
                    CoordinatesEntity(-7.993295923478454, 112.62064234475292),
                    CoordinatesEntity(-7.9987891057921, 112.6186695544954),
                    CoordinatesEntity(-7.984102567960451, 112.626187860744),
                    CoordinatesEntity(-7.9838239836123375, 112.62898374952528),
                    CoordinatesEntity(-7.981792641420121, 112.62716008882859),
                    CoordinatesEntity(-7.9769851121154165, 112.63345398463193),
                    CoordinatesEntity(-7.969298216451197, 112.63740131459282),
                    CoordinatesEntity(-7.957193603073925, 112.63785156979519),
                    CoordinatesEntity(-7.946502443256985, 112.64025698483843),
                    CoordinatesEntity(-7.931945544180079, 112.64737943789837)
                )
            )
            "11" -> RouteEntity( //GL
                id = routeId,
                routeName = "Hamid Rusdi - Landungsari", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Landungsari",
                    "Jalan Tlogomas A1",
                    "Jalan Tlogomas 106",
                    "Jalan M.T. Haryono 213",
                    "Jalan Gajayana 683",
                    "Jalan Gajayana 33",
                    "Jalan Sumbersari Gang 4 277",
                    "Jalan Veteran Malang 2",
                    "Jalan Besar Ijen 84",
                    "Jalan Semeru 57",
                    "Mall Olympic Garden",
                    "Radar Malang Jawa Pos",
                    "Cabang Biro Perencanaan Dan Pengembangan Perusahaan",
                    "Jalan Merdeka Timur 2f",
                    "Jalan Kyai Haji Hasyim Ashari 17",
                    "Jalan Yulius Usman 43",
                    "Jalan Nusakambangan 3",
                    "Jalan Halmahera 62",
                    "Jalan Sonokeling 41",
                    "Jalan Janti Barat 58",
                    "Jalan Sudanco Supriadi 73",
                    "Jalan Apida Satsui Tubun 9",
                    "Terminal Bayangan Gadang Bumiayu",
                    "Terminal Hamid Rusidi 1"
                ),
                logo = R.drawable.gl,
                origin = CoordinatesEntity(-7.925109736556455, 112.59768009193175),
                destination = CoordinatesEntity(-8.02609299072131, 112.64293084675018),
                waypoints = listOf(
                    CoordinatesEntity(-7.924078788910734, 112.59889658626118),
                    CoordinatesEntity(-7.925572070767915, 112.60077043487333),
                    CoordinatesEntity(-7.936374213311408, 112.60567087373106),
                    CoordinatesEntity(-7.944494892013364, 112.60973267110113),
                    CoordinatesEntity(-7.949844044013338, 112.60886810252728),
                    CoordinatesEntity(-7.952765706653648, 112.60964292109273),
                    CoordinatesEntity(-7.957318930755722, 112.61808921180132),
                    CoordinatesEntity(-7.966082828836689, 112.62466922880576),
                    CoordinatesEntity(-7.972709681467936, 112.6215631425946),
                    CoordinatesEntity(-7.977533726917035, 112.62309317132313),//10
                    CoordinatesEntity(-7.978854194181601, 112.62469283820148),
                    CoordinatesEntity(-7.9798336725151975, 112.62597154672247),
                    CoordinatesEntity(-7.983232328435812, 112.63141877400591),
                    CoordinatesEntity(-7.9829357976101285, 112.62679443310813),//10
                    CoordinatesEntity(-7.985871849653958, 112.62546841707855),
                    CoordinatesEntity(-7.988700639280078, 112.62927229190828),
                    CoordinatesEntity(-7.993334805292033, 112.62783895520842),
                    CoordinatesEntity(-8.001183148128794, 112.6271849842493),
                    CoordinatesEntity(-8.001742551034296, 112.62140204347114),
                    CoordinatesEntity(-8.001313357719923, 112.61787091023805),
                    CoordinatesEntity(-8.020856396925028, 112.62062413834362),
                    CoordinatesEntity(-8.023023348485442, 112.62754507436134)
                )
            )
            "12" -> RouteEntity( //GM
                id = routeId,
                routeName = "Hamid Rusdi - Mulyorejo", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Mulyorejo",
                    "Sdn Mulyorejo B",
                    "Jalan Raya Tebo Utara 185",
                    "Jalan Raya Bandulan 35",
                    "Jalan Ikhwan Ridwan Rais 352",
                    "Jalan Kyai Tamin 20",
                    "Jalan Professor Moch Yamin 101",
                    "Jalan Tanimbar 17"
                ),
                logo = R.drawable.gm,
                origin = CoordinatesEntity(-7.989793649480189, 112.59944308645095),
                destination = CoordinatesEntity(-7.989573375619478, 112.62635772093249),
                waypoints = listOf(
                    CoordinatesEntity(-7.9863671755150145, 112.60043035260445),
                    CoordinatesEntity(-7.982996888706342, 112.6026945142389),
                    CoordinatesEntity(-7.983622477278369, 112.60921724548751),
                    CoordinatesEntity(-7.983385833319805, 112.61672246051447),
                    CoordinatesEntity(-7.9876155346730435, 112.63091840834164),
                    CoordinatesEntity(-7.991016504394481, 112.63143062007771)
                )
            )
            "13" -> RouteEntity( //GML/HML
                id = routeId,
                routeName = "Hamid Rusdi - Landungsari", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Landungsari",
                    "Jalan Tlogomas A1",
                    "Jalan Tlogomas 106",
                    "Jalan M.T. Haryono 213",
                    "Jalan Mertojoyo 55",
                    "Jalan Sunan Kalijaga 26",
                    "Jalan Terusan Sigura-Gura 1b",
                    "Jalan Candi 3f 211",
                    "Jalan Lokon",
                    "Jalan Dieng 27 H",
                    "Jalan Raya Langsep 25",
                    "Jalan Simpang Raya Langsep 63",
                    "Jalan Mergan",
                    "Jalan Rajawali 22",
                    "Jalan Yulius Usman 43",
                    "Jalan Tanimbar 17",
                    "Jalan Halmahera 62",
                    "Jalan Sonokeling 41",
                    "Jalan Janti Barat 58",
                    "Jalan Sudanco Supriadi 76",
                    "Jalan Sudanco Supriadi 73",
                    "Jalan Apida Satsui Tubun 9",
                    "Terminal Bayangan Gadang Bumiayu",
                    "Terminal Hamid Rusidi 1"
                ),
                logo = R.drawable.gml,
                origin = CoordinatesEntity(-7.925173199759928, 112.59787118275375),
                destination = CoordinatesEntity(-8.026040058284694, 112.64296188859956),
                waypoints = listOf(
                    CoordinatesEntity(-7.924372992357692, 112.59812757192252),
                    CoordinatesEntity(-7.925630922168982, 112.6007334720216),
                    CoordinatesEntity(-7.933219027197225, 112.60345854675406),
                    CoordinatesEntity(-7.94050263876562, 112.6039858988803),
                    CoordinatesEntity(-7.9493609302294255, 112.60604652543329),//5
                    CoordinatesEntity(-7.959421288850204, 112.60665476022274),
                    CoordinatesEntity(-7.964195537212159, 112.6075039353186),
                    CoordinatesEntity(-7.969202432627508, 112.61242699776004),
                    CoordinatesEntity(-7.973734801820361, 112.61324208180073),
                    CoordinatesEntity(-7.978293101878579, 112.61334179620535),
                    CoordinatesEntity(-7.979193324638836, 112.61162772195667),
                    CoordinatesEntity(-7.9907115294226125, 112.61768878134889),
                    CoordinatesEntity(-7.990777228817544, 112.6203142230061),//10
                    CoordinatesEntity(-7.985859110449468, 112.62548652889676),
                    CoordinatesEntity(-7.9896590995108925, 112.62646000796478),
                    CoordinatesEntity(-7.9932595636179755, 112.62771351379196),
                    CoordinatesEntity(-8.001069672099511, 112.62733426965453),
                    CoordinatesEntity(-8.001739971478003, 112.62141063486627),
                    CoordinatesEntity(-8.00043324367805, 112.61812369882782),
                    CoordinatesEntity(-8.001376562938429, 112.61782708485892),
                    CoordinatesEntity(-8.020831816249578, 112.62063604709317),
                    CoordinatesEntity(-8.02273065413195, 112.62762763305149)
                )
            )
            "14" -> RouteEntity( //JDM
                id = routeId,
                routeName = "Perum. Joyogrand - Mergan", // Add route name
                streetNames = listOf( // Add street names in order
                    "Jalan Ruko Villa Bukit Tidar 503",
                    "Jalan Ruko Villa Bukit Tidar",
                    "Jalan Joyo Agung 4",
                    "Jalan Joyo Agung 184",
                    "Jalan Kanjuruhan 1",
                    "Jalan M.T. Haryono 213",
                    "Jalan Mayjen Haryono Gg",
                    "Jalan Simpang Gajayana 610",
                    "Jalan Gajayana 33",
                    "Jalan Sumbersari Gang 4 277",
                    "Jalan Bendungan Sutami 16 A",
                    "Jalan Galunggung 100-106",
                    "Jalan Galunggung 24-26",
                    "Jalan Dieng 27 H",
                    "Jalan Raya Langsep 25",
                    "Jalan Simpang Raya Langsep 63",
                    "Jalan Raya Langsep 70"
                ),
                logo = R.drawable.jdm,
                origin = CoordinatesEntity(-7.944757590007189, 112.5835622150234),
                destination = CoordinatesEntity(-7.981966349079236, 112.61455191146067),
                waypoints = listOf(
                    CoordinatesEntity(-7.94309552988868, 112.58124877310226),
                    CoordinatesEntity(-7.93763998163275, 112.58313890853493),
                    CoordinatesEntity(-7.938030313725422, 112.58536833346132),
                    CoordinatesEntity(-7.940335170611547, 112.5978713772651),
                    CoordinatesEntity(-7.940188782915616, 112.60825898845066),
                    CoordinatesEntity(-7.943141277807182, 112.6103223373599	),
                    CoordinatesEntity(-7.947075031634802, 112.60885688563592),
                    CoordinatesEntity(-7.949794816230266, 112.60887071845316),
                    CoordinatesEntity(-7.955113738281628, 112.61127874998044),
                    CoordinatesEntity(-7.960008644369648, 112.6136722533744),
                    CoordinatesEntity(-7.964992756711483, 112.61359101635705),
                    CoordinatesEntity(-7.970950239044794, 112.61340097262668),
                    CoordinatesEntity(-7.973729244133131, 112.61308235763416),
                    CoordinatesEntity(-7.978464992536204, 112.61310902829128),
                    CoordinatesEntity(-7.981832994480919, 112.61481553999175)
                )
            )
            "15" -> RouteEntity( //JPK
                id = routeId,
                routeName = "Permh. Joyogrand - Karanglo", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Joyogrand",
                    "Jalan Joyo Agung 28",
                    "Jalan Joyo Utomo 506",
                    "Jalan Simpang Gajayana 610",
                    "Jalan Gajayana 683",
                    "Jalan M.T. Haryono 4",
                    "Jalan Soekarno Hatta 9",
                    "Jalan Bunga Vinolia 401",
                    "Jalan Akordion 186",
                    "Jalan Akordion 7",
                    "Jalan Ikan Gurami 8",
                    "Jalan Ikan Kakap 1",
                    "Jalan Ikan Piranha 191",
                    "Jalan Ikan Piranha 47",
                    "Jalan Raya Malang - Surabaya 143-145",
                    "Jalan Jendral Ahmad Yani Utara 45",
                    "Jalan Satria Barat 439",
                    "Karanglo Indah"
                ),
                logo = R.drawable.jpk,
                origin = CoordinatesEntity(-7.943494655921913, 112.59229192417078),
                destination = CoordinatesEntity(-7.916752923851174, 112.64516610933255),
                waypoints = listOf(
                    CoordinatesEntity(-7.94071906503052, 112.5967996254861),
                    CoordinatesEntity(-7.942508343256093, 112.6020518479363),
                    CoordinatesEntity(-7.9447768769030285, 112.60723461279703),
                    CoordinatesEntity(-7.944449655233817, 112.60975858886808),
                    CoordinatesEntity(-7.9433620302420636, 112.61049938183459),//5
                    CoordinatesEntity(-7.941081192757824, 112.62253748769415),
                    CoordinatesEntity(-7.934931028754947, 112.61313721679079),
                    CoordinatesEntity(-7.92986094330856, 112.61407972433761),
                    CoordinatesEntity(-7.9311306670420265, 112.614215913557),
                    CoordinatesEntity(-7.925636307789616, 112.62297450069208),
                    CoordinatesEntity(-7.928770799017509, 112.62910785585721),
                    CoordinatesEntity(-7.931564302020451, 112.63736211935377),
                    CoordinatesEntity(-7.934102306866444, 112.64170889515854),
                    CoordinatesEntity(-7.935860541941422, 112.64514779642869),
                    CoordinatesEntity(-7.934612639334729, 112.64578853746096),
                    CoordinatesEntity(-7.9220041901583045, 112.64834657834918)
                )
            )
            "16" -> RouteEntity( //LDG/LDH
                id = routeId,
                routeName = "Landungsari - Hamid Rusdi", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Landungsari",
                    "Jalan Tlogomas A1",
                    "Jalan Tlogomas 106",
                    "Jalan M.T. Haryono 213",
                    "Jalan M.T. Haryono 4",
                    "Jalan Mayjend. Panjaitan 89",
                    "Jalan Brigjend Slamet Riadi 133-135",
                    "Jalan Pasar Besar 45",
                    "Jalan Professor Moch Yamin 101",
                    "Jalan Kolonel Sugiono 31",
                    "Jalan Kolonel Sugiono 195",
                    "Jalan Kolonel Sugiono 377-387",
                    "Jalan Kolonel Sugiono 489",
                    "Terminal Bayangan Gadang Bumiayu",
                    "Terminal Hamid Rusidi 1"
                ),
                logo = R.drawable.ldg,
                origin = CoordinatesEntity(-7.925119022756656, 112.59767028284067),
                destination = CoordinatesEntity(-8.026052030223918, 112.64296579527914),
                waypoints = listOf(
                    CoordinatesEntity(-7.924072009503203, 112.5989034685858),
                    CoordinatesEntity(-7.925621426926443, 112.60072352409601),
                    CoordinatesEntity(-7.936343465755563, 112.60563478039313),
                    CoordinatesEntity(-7.94267622991264, 112.60999238875999),
                    CoordinatesEntity(-7.958310486146281, 112.62386140460313),//5
                    CoordinatesEntity(-7.965869607034778, 112.62828056654956),
                    CoordinatesEntity(-7.985629014873692, 112.63244342872795),
                    CoordinatesEntity(-7.9910347021759085, 112.63163184976567),
                    CoordinatesEntity(-7.995000976376217, 112.63331356479446),
                    CoordinatesEntity(-8.001330295060798, 112.63130519680576),
                    CoordinatesEntity(-8.011014525417075, 112.62946274306582),
                    CoordinatesEntity(-8.016290845141121, 112.62885318303502),
                    CoordinatesEntity(-8.023028972052952, 112.62758467776919)
                )
            )
            "17" -> RouteEntity( //LG/LH
                id = routeId,
                routeName = "Landungsari - Hamid Rusdi", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Landungsari",
                    "Jalan Tlogomas A1",
                    "Jalan Tlogomas 106",
                    "Jalan M.T. Haryono 213",
                    "Jalan Gajayana 683",
                    "Jalan Sumbersari Gang 4 277",
                    "Jalan Terusan Surabaya 55c",
                    "Jalan Jombang 11-17",
                    "Jalan Bondowoso 2",
                    "Jalan Pulo Sari 25",
                    "Jalan Kawi 15 B",
                    "Jalan Merdeka Timur 2f",
                    "Jalan Kyai Tamin 20",
                    "Jalan Professor Moch Yamin 101",
                    "Jalan Susanto 14",
                    "Jalan Sonokeling 41",
                    "Jalan Janti Barat 58",
                    "Jalan Sudanco Supriadi 76",
                    "Jalan Sudanco Supriadi 73",
                    "Jalan Apida Satsui Tubun 9",
                    "Terminal Bayangan Gadang Bumiayu",
                    "Terminal Hamid Rusidi 1"
                ),
                logo = R.drawable.lg,
                origin = CoordinatesEntity(-7.925119022756656, 112.59767028284067),
                destination = CoordinatesEntity(-8.026031173865011, 112.64297191605718),
                waypoints = listOf(
                    CoordinatesEntity(-7.924072009503203, 112.5989034685858),
                    CoordinatesEntity(-7.925621426926443, 112.60072352409601),
                    CoordinatesEntity(-7.936343465755563, 112.60563478039313),
                    CoordinatesEntity(-7.944447223926778, 112.6096947252565),
                    CoordinatesEntity(-7.953675870571266, 112.61032977991408),
                    CoordinatesEntity(-7.963985482156703, 112.61415190149745),
                    CoordinatesEntity(-7.966212308044071, 112.61583423326823),
                    CoordinatesEntity(-7.968565118623851, 112.61761587962393),
                    CoordinatesEntity(-7.973599558604135, 112.61733619317447),
                    CoordinatesEntity(-7.978542251765558, 112.6243883107733),//10
                    CoordinatesEntity(-7.9833831210198944, 112.63139329986255),
                    CoordinatesEntity(-7.987701387013194, 112.63088927557418),
                    CoordinatesEntity(-7.991047213411775, 112.63161571857331),
                    CoordinatesEntity(-7.9963546903752665, 112.62889861699212),
                    CoordinatesEntity(-8.00106197724701, 112.62732904499559),
                    CoordinatesEntity(-8.001731320637338, 112.62139915177097),
                    CoordinatesEntity(-8.000431074441847, 112.61814023484),
                    CoordinatesEntity(-8.000930141906121, 112.61796799092603),
                    CoordinatesEntity(-8.020864698301114, 112.62061420203415),
                    CoordinatesEntity(-8.023028972052952, 112.62758467776919)
                )
            )
            "18" -> RouteEntity( //MK
                id = routeId,
                routeName = "Madyopuro - Karangbesuki", // Add route name
                streetNames = listOf( // Add street names in order
                    "Jalan Danau Jonge 1",
                    "Jalan Ki Ageng Gribig 7",
                    "Jalan Ki Ageng Gribig 21-45",
                    "Jalan Ki Ageng Gribig 316",
                    "Jalan Muharto 50",
                    "Jalan Pasar Besar 142",
                    "Jalan Merdeka Timur 2f"
                ),
                logo = R.drawable.mk,
                origin = CoordinatesEntity(-7.973329047954809, 112.67059925585414),
                destination = CoordinatesEntity(-7.983606257584494, 112.63179933252084),
                waypoints = listOf(
                    CoordinatesEntity(-7.976880326774721, 112.67136907651602),
                    CoordinatesEntity(-7.985005363896121, 112.65803420273394),
                    CoordinatesEntity(-7.991228122854733, 112.64998342162117),
                    CoordinatesEntity(-7.991256787363338, 112.64173008989474),
                    CoordinatesEntity(-7.987063428080144, 112.63536343444268)
                )
            )
            "19" -> RouteEntity( //MM
                id = routeId,
                routeName = "Madyopuro - Mulyorejo", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Mulyorejo",
                    "Jalan Raya Tebo Utara 185",
                    "Jalan Raya Bandulan 35",
                    "Jalan Raya Langsep 26",
                    "Jalan Kawi 15 B",
                    "Jalan Tugu",
                    "Jalan Urip Sumoharjo 38",
                    "Jalan Mayor Jenderal M. Wiyono 1h",
                    "Jalan Danau Toba",
                    "Jalan Ki Ageng Gribig 15"
                ),
                logo = R.drawable.mm,
                origin = CoordinatesEntity(-7.990142829304203, 112.59959593828145),
                destination = CoordinatesEntity(-7.974718247392594, 112.67239722663138),
                waypoints = listOf(
                    CoordinatesEntity(-7.983062181988892, 112.6028700545808),
                    CoordinatesEntity(-7.983721673469814, 112.60917008707878),
                    CoordinatesEntity(-7.97795585820788, 112.61251622449022),
                    CoordinatesEntity(-7.975657967582266, 112.62029908759791),
                    CoordinatesEntity(-7.976980242560631, 112.6334726457319),
                    CoordinatesEntity(-7.976087045354428, 112.64198428970984),
                    CoordinatesEntity(-7.978686208710742, 112.64579516615558),
                    CoordinatesEntity(-7.979867165875197, 112.65821244579993)
                )
            )
            "20" -> RouteEntity( //MT
                id = routeId,
                routeName = "Mulyorejo - Tlogowaru", // Add route name
                streetNames = listOf( // Add street names in order
                    "Jalan Raya Sumbersuko",
                    "Jalan Raya Tlogowaru 14",
                    "Jalan Raya Tlogowaru 19",
                    "Jalan Sekar Putih 1",
                    "Jalan Sekar Putih 27",
                    "Jalan Kalisari 1",
                    "Jalan Kalianyar Buring 79",
                    "Jalan Mayor Jendral Sungkono 21",
                    "Jalan Muharto Timur 47",
                    "Jalan Muharto 50",
                    "Jalan Laksamana Martadinata 38"
                ),
                logo = R.drawable.mt,
                origin = CoordinatesEntity(-8.050323746120942, 112.6622761719909),
                destination = CoordinatesEntity(-7.988364135376067, 112.63508041418598),
                waypoints = listOf(
                    CoordinatesEntity(-8.040739496446118, 112.66537333158895),
                    CoordinatesEntity(-8.040430657004016, 112.66449013953337),
                    CoordinatesEntity(-8.03452899589401, 112.65414776433654),
                    CoordinatesEntity(-8.032527550874693, 112.65221949614994),
                    CoordinatesEntity(-8.023502312003943, 112.64744040115059),
                    CoordinatesEntity(-8.01287429024447, 112.64350414349136),
                    CoordinatesEntity(-8.00349665825904, 112.64400280787343),
                    CoordinatesEntity(-7.992909538923147, 112.64505162020464),
                    CoordinatesEntity(-7.9912519276055125, 112.64172632536243)
                )
            )
            "21" -> RouteEntity( //TST
                id = routeId,
                routeName = "Tlogowaru - Tasikmadu", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Hamid Rusidi 1",
                    "Jalan Mayor Jendral Sungkono 52",
                    "Jalan Wonorejo 55",
                    "Jalan Kyai Parseh Jaya 66",
                    "Jalan Mayor Jendral Sungkono 21",
                    "Jalan Muharto Timur 47",
                    "Jalan Puntodewo 5",
                    "Jalan Terusan Kesatrian 40",
                    "Jalan Panglima Sudirman 85",
                    "Jalan Raden Tumenggung Suryo 4"
                ),
                logo = R.drawable.tst,
                origin = CoordinatesEntity(-8.027395334149318, 112.64285667237137),
                destination = CoordinatesEntity(-7.966726864919944, 112.63886403396471),
                waypoints = listOf(
                    CoordinatesEntity(-8.034347312215802, 112.64257104798179),
                    CoordinatesEntity(-8.033868183279882, 112.63225853914825),
                    CoordinatesEntity(-8.029175808210805, 112.63168641070595),
                    CoordinatesEntity(-8.025740793350241, 112.64290373112945),
                    CoordinatesEntity(-7.992850666760615, 112.64483388326293),
                    CoordinatesEntity(-7.9841448636391155, 112.64635522283567),
                    CoordinatesEntity(-7.979959498357694, 112.64181237128848),
                    CoordinatesEntity(-7.9717784440860235, 112.63832392051216)
                )
            )
            else -> null
        }
    }
}