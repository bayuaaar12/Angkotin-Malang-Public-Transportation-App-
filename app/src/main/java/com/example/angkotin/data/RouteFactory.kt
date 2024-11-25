package com.example.angkotin.data

import com.example.angkotin.R

object RouteFactory {

    fun getRoute(routeId: String): RouteEntity? {
        return when (routeId) {
            "1" -> RouteEntity( //ABB
                id = routeId,
                routeName = "Arjosari - Bunul", // Add route name
                streetNames = listOf( // Add street names in order
                    "Jalan Cakalang 2b",
                    "Jalan Cakalang 197",
                    "Jalan Cakalang 282",
                    "Jalan Ikan Tombro 20",
                    "Jalan Ikan Piranha 191",
                    "Jalan Ikan Nus 1",
                    "Jalan Simpang Borobudur 60",
                    "Jalan Borobudur 7",
                    "Jalan Laksda Adi Sucipto 85",
                    "Jalan Laksda Adi Sucipto 308",
                    "Jalan Simpang L.A. Sucipto 159",
                    "Jalan Simpang L.A. Sucipto",
                    "Jalan Simpang Sulfat Selatan 16",
                    "Jalan Hamid Rusdi 10 B"
                ),
                logo = R.drawable.abb,
                origin = CoordinatesEntity(-7.930664315480486, 112.64754633649632),
                destination = CoordinatesEntity(-7.972865105892197, 112.64599027381796),
                waypoints = listOf(
                    CoordinatesEntity(-7.92373476889161, 112.63536330438154),
                    CoordinatesEntity(-7.928604089997171, 112.6322462795314),
                    CoordinatesEntity(-7.934135232768009, 112.63688329499233),
                    CoordinatesEntity(-7.935715102070162, 112.63687036140915),
                    CoordinatesEntity(-7.939378667582447, 112.63673240321903),
                    CoordinatesEntity(-7.949145748988573, 112.66015994058922),
                    CoordinatesEntity(-7.970116586670741, 112.647758401572)
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
                origin = CoordinatesEntity(-8.026071863222331, 112.64294853820383),
                destination = CoordinatesEntity(-7.933421225623797, 112.65900122439122),
                waypoints = listOf(
                    CoordinatesEntity(-8.022929863314255, 112.62816976432246),
                    CoordinatesEntity(-8.010955872521269, 112.62932848619286),
                    CoordinatesEntity(-8.001404188931414, 112.63129333549291),
                    CoordinatesEntity(-7.988388959303903, 112.6352296186811),
                    CoordinatesEntity(-7.978291555529673, 112.63690010938139),
                    CoordinatesEntity(-7.969295448254195, 112.63740491040342),
                    CoordinatesEntity(-7.965108598921088, 112.63603503085918),
                    CoordinatesEntity(-7.96101900837081, 112.63136203574587),
                    CoordinatesEntity(-7.954511378459686, 112.63173336403504),
                    CoordinatesEntity(-7.953818255576915, 112.63168361119745),
                    CoordinatesEntity(-7.948530905433237, 112.62642905162295),
                    CoordinatesEntity(-7.941545699692252, 112.62243620859826),
                    CoordinatesEntity(-7.941125237235141, 112.62241609054333),
                    CoordinatesEntity(-7.939854327588338, 112.6205465489095),
                    CoordinatesEntity(-7.938921920457166, 112.63423018553218),
                    CoordinatesEntity(-7.933421225623797, 112.65900122439122),

                    )
            )
            "3" -> RouteEntity( //ADL
                id = routeId,
                routeName = "Arjosari - Landungsari", // Add route name
                streetNames = listOf( // Add street names in order
                    "Jalan Simpang Panji Suroso 708",
                    "Jalan Simpang Panji Suroso 144",
                    "Jalan A. Yani 172",
                    "Jalan Letjend S. Parman 76",
                    "Jalan Letjen Sutoyo 122",
                    "Jalan Panglima Sudirman 85",
                    "Jalan Jalan Semeru 57",
                    "Jalan Besar Ijen 84",
                    "Jalan Bandung 32",
                    "Jalan Mayjend. Panjaitan 89",
                    "Jalan Mayjend. Panjaitan 143",
                    "Jalan M.T. Haryono 4",
                    "Jalan M.T. Haryono 213",
                    "Jalan Tlogomas 106",
                    "Jalan Tlogomas A1",
                    "Terminal Landungsari"
                ),
                logo = R.drawable.adl,
                origin = CoordinatesEntity(-7.934589978502221, 112.65871280931385),
                destination = CoordinatesEntity(-7.924670054710193, 112.59785174786673),
                waypoints = listOf(
                    CoordinatesEntity(-7.933828823589864, 112.65316636748916),
                    CoordinatesEntity(-7.934460966452599, 112.64601775827306),
                    CoordinatesEntity(-7.948936637060553, 112.63981204174212),
                    CoordinatesEntity(-7.957517005814187, 112.63796098371436),
                    CoordinatesEntity(-7.971799467490066, 112.63849192840411),
                    CoordinatesEntity(-7.972752511055742, 112.62258266766557),
                    CoordinatesEntity(-7.973588705043991, 112.62109267873966),
                    CoordinatesEntity(-7.966051333281632, 112.62465458787483),
                    CoordinatesEntity(-7.960882699032539, 112.62257442590479),
                    CoordinatesEntity(-7.95633756268756, 112.62199647742557),
                    CoordinatesEntity(-7.927859103243513, 112.60289307990418),
                    CoordinatesEntity(-7.924498523058594, 112.5981912516619)
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
                    "Jalan Apida Satsui Tubun 9",
                    "Jalan Terminal Bayangan Gadang Bumiayu",
                    "Terminal Hamid Rusdi 1"
                ),
                logo = R.drawable.ajg,
                origin = CoordinatesEntity(-7.958011875791379, 112.63819558578038),
                destination = CoordinatesEntity(-8.026050615735757, 112.64292708053223),
                waypoints = listOf(
                    CoordinatesEntity(-7.96217965402049, 112.64036190747468),
                    CoordinatesEntity(-7.966704407270214, 112.63876755744086),
                    CoordinatesEntity(-7.972468561614395, 112.64533668303504),
                    CoordinatesEntity(-7.976125316690102, 112.64196882341716),
                    CoordinatesEntity(-7.977472325522053, 112.63682390470865),
                    CoordinatesEntity(-7.987347084058045, 112.63925206434455),
                    CoordinatesEntity(-7.9909883685686305, 112.63144392503104),
                    CoordinatesEntity(-7.996393772223116, 112.62887112473102),
                    CoordinatesEntity(-8.001146854033244, 112.62713787054251),
                    CoordinatesEntity(-8.001422561443928, 112.62149324858042),
                    CoordinatesEntity(-8.002797159342, 112.61774606805234),
                    CoordinatesEntity(-8.020740439777711, 112.62053045908024),
                    CoordinatesEntity(-8.021765498603273, 112.62340986726409)
                )
            )
            "5" -> RouteEntity( //AL
                id = routeId,
                routeName = "Arjosari - Landungsari", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Arjosari",
                    "Jalan Simpang Panji Suroso 144",
                    "Jalan Raya Panji Suroso 16",
                    "Jalan Tenaga Utara 32",
                    "Jalan Karya Timur 16",
                    "Jalan Indragiri",
                    "Jalan Panglima Sudirman 85",
                    "SMA Taman Harapan Malang",
                    "Jalan Semeru 60",
                    "Jalan Semeru 57",
                    "Jalan Ijen 17",
                    "Jalan Bondowoso 2",
                    "Jalan Jombang 11-17",
                    "Jalan Jakarta 46",
                    "Jalan Bogor 22",
                    "Jalan Veteran Malang 2",
                    "Jalan Sumbersari Gang 4",
                    "Jalan Gajayana 33",
                    "Jalan Gajayana 683",
                    "Jalan M.T. Haryono 213",
                    "Jalan Tlogomas 106",
                    "Terminal Landungsari"
                ),
                logo = R.drawable.al,
                origin = CoordinatesEntity(-7.933435458993134, 112.65899350317089),
                destination = CoordinatesEntity(-7.924082277310615, 112.59893995005163),
                waypoints = listOf(
                    CoordinatesEntity(-7.934197807362339, 112.65430559230794),
                    CoordinatesEntity(-7.935640983439188, 112.64971710821912),
                    CoordinatesEntity(-7.9438117378602975, 112.6454712037565),
                    CoordinatesEntity(-7.947045167688661, 112.64240787212927),
                    CoordinatesEntity(-7.95876302953273, 112.64019829142677),
                    CoordinatesEntity(-7.971757922475728, 112.63847446906355),
                    CoordinatesEntity(-7.9785548526148755, 112.63279098011746),
                    CoordinatesEntity(-7.973673895970263, 112.62433428670951),
                    CoordinatesEntity(-7.972725151197042, 112.62256639666474),
                    CoordinatesEntity(-7.973641830594166, 112.62129384441097),
                    CoordinatesEntity(-7.968671192260357, 112.61751338858403),
                    CoordinatesEntity(-7.966156729749028, 112.61573467403649),
                    CoordinatesEntity(-7.964162980762083, 112.6209068549263),
                    CoordinatesEntity(-7.960607588692946, 112.62131247583187),
                    CoordinatesEntity(-7.9575307621943, 112.61803454235321),
                    CoordinatesEntity(-7.954980124952327, 112.60994754637073),
                    CoordinatesEntity(-7.949814321268837, 112.60889587707098),
                    CoordinatesEntity(-7.9444637545265016, 112.60977092612941),
                    CoordinatesEntity(-7.944244495276041, 112.61113918529284),
                    CoordinatesEntity(-7.927859710235974, 112.60290837554855)
                )
            )
            "6" -> RouteEntity( //AG
                id = routeId,
                routeName = "Arjosari - Hamid Rusdi", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Arjosari",
                    "Jalan Simpang Panji Suroso 144",
                    "Jalan A. Yani 172",
                    "Jalan Letjend S. Parman 76",
                    "Jalan Letjen Sutoyo 122",
                    "Jalan Merdeka Timur 2f",
                    "Jalan Jalan Pasar Besar 45",
                    "Jalan Professor Moch Yamin 101",
                    "Jalan Kolonel Sugiono 31",
                    "Jalan Kolonel Sugiono 195",
                    "Jalan Kolonel Sugiono 489",
                    "Terminal Bayangan Gadang Bumiayu",
                    "Terminal Hamid Rusdi 1"
                ),
                logo = R.drawable.ag,
                origin = CoordinatesEntity(-7.933010528109448, 112.6586949893062),
                destination = CoordinatesEntity(-8.026014108978398, 112.64288187018346),
                waypoints = listOf(
                    CoordinatesEntity(-7.933634916411893, 112.65649726875644),
                    CoordinatesEntity(-7.935306032972739, 112.6568295071349),
                    CoordinatesEntity(-7.935089957142244, 112.65599478968251),
                    CoordinatesEntity(-7.932299750310454, 112.64705951838734),
                    CoordinatesEntity(-7.94403005644334, 112.64125959836846),
                    CoordinatesEntity(-7.9548050197453355, 112.63851219573951),
                    CoordinatesEntity(-7.983043639786814, 112.62677376088448),
                    CoordinatesEntity(-7.989174568908617, 112.63203275720986),
                    CoordinatesEntity(-7.993964979916607, 112.63343071829547),
                    CoordinatesEntity(-8.001282334087987, 112.63123392230455),
                    CoordinatesEntity(-8.013205223821382, 112.62884410260355),
                    CoordinatesEntity(-8.019024319387732, 112.628145630258),
                    CoordinatesEntity(-8.023778360545197, 112.63147491062675)
                )
            )
            "7" -> RouteEntity( //AMG/AMH
                id = routeId,
                routeName = "Arjosari - Hamid Rusdi", // Add route name
                streetNames = listOf( // Add street names in order
                    "Terminal Arjosari",
                    "Jalan Simpang Panji Suroso 144",
                    "Jalan Letnan Jendral Sunandar Priyo Sudarmo 12",
                    "Jalan Letnan Jendral Sunandar Priyo Sudarmo 74",
                    "Jalan Raden Tumenggung Suryo 4",
                    "Jalan Hamid Rusdi 10 B",
                    "Jalan Tersusan Kesatrian 40",
                    "Jalan Kebalen Wetan 53 A",
                    "Jalan Kolonel Sugiono 31",
                    "Jalan Kolonel Sugiono 195",
                    "Jalan Kolonel Sugiono 377-387",
                    "Jalan Kolonel Sugiono 489",
                    "Jalan Terminal Bayangan Gadang Bumiayu",
                    "Terminal Hamid Rusdi 2"
                ),
                logo = R.drawable.amg,
                origin = CoordinatesEntity(-7.933426299002292, 112.6589872674082),
                destination = CoordinatesEntity(-8.026060694819119, 112.64290633701229),
                waypoints = listOf(
                    CoordinatesEntity(-7.934203894284377, 112.6543089258076),
                    CoordinatesEntity(-7.952400742315637, 112.64612624159604),
                    CoordinatesEntity(-7.956830874424859, 112.64422717144126),
                    CoordinatesEntity(-7.966695610978981, 112.63875551565977),
                    CoordinatesEntity(-7.972490292423721, 112.64533265073771),
                    CoordinatesEntity(-7.9799246096207375, 112.64174738170945),
                    CoordinatesEntity(-7.990658524986992, 112.63794026830466),
                    CoordinatesEntity(-7.994887967385678, 112.63326143641129),
                    CoordinatesEntity(-8.001422317315033, 112.63127124065355),
                    CoordinatesEntity(-8.010990992912323, 112.6293011535054),
                    CoordinatesEntity(-8.016220284614455, 112.628501831091),
                    CoordinatesEntity(-8.022940146248489, 112.62815372740127)
                )
            )
            "8" -> RouteEntity( //ASD
                id = routeId,
                routeName = "Arjosari - Dieng", // Add route name
                streetNames = listOf( // Add street names in order
                    "Halte Dieng",
                    "Jalan Terusan Dieng 50",
                    "Jalan Dieng 27 H",
                    "Jalan Kawi Atas 1a",
                    "Jalan Pulo Sari 25",
                    "Jalan Gresik 2",
                    "Jalan Jakarta 46",
                    "Jalan Bogor 22",
                    "Jalan Veteran Malang 2",
                    "Jalan Mayjend. Panjaitan 89",
                    "Jalan Mayjend. Panjaitan 143",
                    "Jalan Soekarno Hatta 9",
                    "Jalan Kalpataru 131",
                    "Jalan Melati 1",
                    "Jalan Bungur",
                    "Jalan Sarangan 32",
                    "Jalan Letjen Sutoyo 91",
                    "Jalan Letjen Sutoyo 122",
                    "Jalan Indragiri",
                    "Jalan Indragiri 23",
                    "Jalan Letnan Jenderal Sunandar Priyo Sudarmo 94",
                    "Jalan Raya Sulfat 51",
                    "Jalan Emas 44-58",
                    "Jalan Terusan Batubara",
                    "Jalan Terusan Batubara 88",
                    "Jalan Laksda Adi Sucipto 308",
                    "Jalan Plaosan Timur 130",
                    "Jalan Raya Panjisuroso 16"
                ),
                logo = R.drawable.asd,
                origin = CoordinatesEntity(-7.933442940095821, 112.65904153390399),
                destination = CoordinatesEntity(-7.972509579360462, 112.60755196897098),
                waypoints = listOf(
                    CoordinatesEntity(-7.9342043005605705, 112.65431868570346),
                    CoordinatesEntity(-7.9428975644820525, 112.64861697126564),
                    CoordinatesEntity(-7.941207799643473, 112.65158796632709),
                    CoordinatesEntity(-7.944688730759691, 112.65517456921923),
                    CoordinatesEntity(-7.947981706921046, 112.65599556514867),
                    CoordinatesEntity(-7.950166007777827, 112.65233439101372),
                    CoordinatesEntity(-7.957515276725556, 112.64897601518147),
                    CoordinatesEntity(-7.960276967277031, 112.64947062300091),
                    CoordinatesEntity(-7.959687596423031, 112.64279271425782),
                    CoordinatesEntity(-7.960813536602903, 112.64151909411522),
                    CoordinatesEntity(-7.960144831351204, 112.63320983185183),
                    CoordinatesEntity(-7.9545162971388015, 112.63173305301501),
                    CoordinatesEntity(-7.957552900023392, 112.63148864043916),
                    CoordinatesEntity(-7.947981706921046, 112.65599556514867),
                    CoordinatesEntity(-7.948557672787193, 112.62642800178487),
                    CoordinatesEntity(-7.941689331999797, 112.62252326197257),
                    CoordinatesEntity(-7.95660843160057, 112.62160934608583),
                    CoordinatesEntity(-7.962022852762223, 112.62487421454131),
                    CoordinatesEntity(-7.962276635054731, 112.62342358634787),
                    CoordinatesEntity(-7.964135368526815, 112.62093407394828),
                    CoordinatesEntity(-7.966330118501163, 112.61752530657996),
                    CoordinatesEntity(-7.968256795546239, 112.61832251568468),
                    CoordinatesEntity(-7.972759513415932, 112.61670399017537),
                    CoordinatesEntity(-7.978480936921445, 112.61312182148872),
                    CoordinatesEntity(-7.977904587011525, 112.6126010015812)
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
                origin = CoordinatesEntity(-7.924130048068026, 112.59893594516659),
                destination = CoordinatesEntity(-7.983678307752278, 112.69249470860335),
                waypoints = listOf(
                    CoordinatesEntity(-7.924415744028129, 112.59811214182591),
                    CoordinatesEntity(-7.9255836171406004, 112.60075484093514),
                    CoordinatesEntity(-7.936334962013199, 112.60562667870424),
                    CoordinatesEntity(-7.938322349052462, 112.61186719728863),
                    CoordinatesEntity(-7.938140052740327, 112.62180922968214),
                    CoordinatesEntity(-7.939932873376054, 112.62066410843343),
                    CoordinatesEntity(-7.948566864558264, 112.62641099959419),
                    CoordinatesEntity(-7.952684992208858, 112.63718518704427),
                    CoordinatesEntity(-7.956822341647645, 112.64426295413766),
                    CoordinatesEntity(-7.9666931428042105, 112.63877875028847),
                    CoordinatesEntity(-7.97247153579058, 112.64531510465775),
                    CoordinatesEntity(-7.978586473977054, 112.64582628179845),
                    CoordinatesEntity(-7.9768013410517025, 112.65468398129644),
                    CoordinatesEntity(-7.968610669765518, 112.65975881792599),
                    CoordinatesEntity(-7.974229122061106, 112.6642155542802),
                    CoordinatesEntity(-7.974741036459697, 112.67240356654992),
                    CoordinatesEntity(-7.9782897996007245, 112.68129085564885)
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
                    CoordinatesEntity(-7.9829349164037415, 112.62679871439899),
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
                    "Jalan Sudanco Supriadi 76",
                    "Jalan Sudanco Supriadi 73",
                    "Jalan Apida Satsui Tubun 9",
                    "Terminal Bayangan Gadang Bumiayu",
                    "Terminal Hamid Rusidi 1"
                ),
                logo = R.drawable.gl,
                origin = CoordinatesEntity(-7.9241465956742525, 112.59893667024257),
                destination = CoordinatesEntity(-8.02609299072131, 112.64293084675018),
                waypoints = listOf(
                    CoordinatesEntity(-7.924387583131811, 112.5981180812068),
                    CoordinatesEntity(-7.925572070767915, 112.60077043487333),
                    CoordinatesEntity(-7.936374213311408, 112.60567087373106),
                    CoordinatesEntity(-7.944494892013364, 112.60973267110113),
                    CoordinatesEntity(-7.949844044013338, 112.60886810252728),
                    CoordinatesEntity(-7.952765706653648, 112.60964292109273),
                    CoordinatesEntity(-7.957318930755722, 112.61808921180132),
                    CoordinatesEntity(-7.966082828836689, 112.62466922880576),
                    CoordinatesEntity(-7.972755896770716, 112.62254447153595),
                    CoordinatesEntity(-7.977533726917035, 112.62309317132313),
                    CoordinatesEntity(-7.978958403147699, 112.6245789760893),
                    CoordinatesEntity(-7.9798336725151975, 112.62597154672247),
                    CoordinatesEntity(-7.983739583017493, 112.63178056140994),
                    CoordinatesEntity(-7.9829357976101285, 112.62679443310813),
                    CoordinatesEntity(-7.985871849653958, 112.62546841707855),
                    CoordinatesEntity(-7.988700639280078, 112.62927229190828),
                    CoordinatesEntity(-7.993334805292033, 112.62783895520842),
                    CoordinatesEntity(-8.001183148128794, 112.6271849842493),
                    CoordinatesEntity(-8.001742551034296, 112.62140204347114),
                    CoordinatesEntity(-8.00282781882423, 112.61745438236898),
                    CoordinatesEntity(-7.993336115808496, 112.62070017770462),
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
                    "Jalan Tanimbar 17",
                    "Jalan Syarif Al-Qodri 3",
                    "Jalan Ikhwan Ridwan Rais 352",
                    "Jalan Raya Bandulan 35",
                    "Jalan Raya Tebo Utara 185",
                    "Sdn Mulyorejo 3",
                    "Terminal Mulyorejo"
                ),
                logo = R.drawable.gm,
                origin = CoordinatesEntity(-7.989994430957743, 112.59932633912945),
                destination = CoordinatesEntity(-7.990029009448435, 112.59934561157803),
                waypoints = listOf(
                    CoordinatesEntity(-7.9863671619922, 112.60043549929661),
                    CoordinatesEntity(-7.983054299566269, 112.60287197149025),
                    CoordinatesEntity(-7.983731130031133, 112.60917855500196),
                    CoordinatesEntity(-7.983471833632056, 112.61671072294514),
                    CoordinatesEntity(-7.987704195234384, 112.63089259784451),
                    CoordinatesEntity(-7.991056213389573, 112.63162586795352),
                    CoordinatesEntity(-7.989824067962961, 112.6263160459356),
                    CoordinatesEntity(-7.9850687470554025, 112.6276211488775),
                    CoordinatesEntity(-7.9834857511673, 112.6167120854502),
                    CoordinatesEntity(-7.9837308325991065, 112.60918338524067),
                    CoordinatesEntity(-7.9830764617184125, 112.60288073843581),
                    CoordinatesEntity(-7.986516970271653, 112.6004266102788)
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
                    CoordinatesEntity(-7.936199453706035, 112.60591202534533),
                    CoordinatesEntity(-7.94050263876562, 112.6039858988803),
                    CoordinatesEntity(-7.9493609302294255, 112.60604652543329),
                    CoordinatesEntity(-7.9584545176077, 112.60662683185855),
                    CoordinatesEntity(-7.964195537212159, 112.6075039353186),
                    CoordinatesEntity(-7.969202432627508, 112.61242699776004),
                    CoordinatesEntity(-7.973734801820361, 112.61324208180073),
                    CoordinatesEntity(-7.978293101878579, 112.61334179620535),
                    CoordinatesEntity(-7.979193324638836, 112.61162772195667),
                    CoordinatesEntity(-7.991563827149689, 112.61820761983232),
                    CoordinatesEntity(-7.990777228817544, 112.6203142230061),
                    CoordinatesEntity(-7.985859110449468, 112.62548652889676),
                    CoordinatesEntity(-7.989813961281455, 112.62632193219449),
                    CoordinatesEntity(-7.9932595636179755, 112.62771351379196),
                    CoordinatesEntity(-8.001069672099511, 112.62733426965453),
                    CoordinatesEntity(-8.001739971478003, 112.62141063486627),
                    CoordinatesEntity(-8.002812724559476, 112.61745191838568),
                    CoordinatesEntity(-7.9933391753157705, 112.62071235907976),
                    CoordinatesEntity(-8.020831816249578, 112.62063604709317),
                    CoordinatesEntity(-8.02302766650019, 112.6275262829988)
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
                    "Jalan Joyo Raharjo 201",
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
                origin = CoordinatesEntity(-7.945032105457919, 112.58354652504526),
                destination = CoordinatesEntity(-7.98192555207426, 112.61436717909392),
                waypoints = listOf(
                    CoordinatesEntity(-7.943093339251684, 112.58125302183244),
                    CoordinatesEntity(-7.938256907093535, 112.58319847683619),
                    CoordinatesEntity(-7.9377006790599935, 112.58538787238834),
                    CoordinatesEntity(-7.940326604801524, 112.59772224151828),
                    CoordinatesEntity(-7.9361675447921725, 112.60590898635682),
                    CoordinatesEntity(-7.944029471629179, 112.61204390104733),
                    CoordinatesEntity(-7.942053330887291, 112.60544015840038),
                    CoordinatesEntity(-7.944767024178867, 112.60721942204663),
                    CoordinatesEntity(-7.946475261847352, 112.60916065684778),
                    CoordinatesEntity(-7.955111584786155, 112.61124903575586),
                    CoordinatesEntity(-7.9600215285593166, 112.61375368676478),
                    CoordinatesEntity(-7.9650014042189, 112.61370343310857),
                    CoordinatesEntity(-7.970973886271312, 112.61353028203804),
                    CoordinatesEntity(-7.973723663014703, 112.61325504870187),
                    CoordinatesEntity(-7.978297480064842, 112.61332218643983),
                    CoordinatesEntity(-7.979201716851717, 112.61162469538843)
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
                    CoordinatesEntity(-7.942987321727883, 112.60959835331941),
                    CoordinatesEntity(-7.941081192757824, 112.62253748769415),
                    CoordinatesEntity(-7.938287423329625, 112.61199627917973),
                    CoordinatesEntity(-7.92986094330856, 112.61407972433761),
                    CoordinatesEntity(-7.9311306670420265, 112.614215913557),
                    CoordinatesEntity(-7.925636307789616, 112.62297450069208),
                    CoordinatesEntity(-7.928770799017509, 112.62910785585721),
                    CoordinatesEntity(-7.931564302020451, 112.63736211935377),
                    CoordinatesEntity(-7.934102306866444, 112.64170889515854),
                    CoordinatesEntity(-7.935860541941422, 112.64514779642869),
                    CoordinatesEntity(-7.933541029232501, 112.64399968133962),
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
                origin = CoordinatesEntity(-7.92425476786636, 112.59891928500502),
                destination = CoordinatesEntity(-8.026052030223918, 112.64296579527914),
                waypoints = listOf(
                    CoordinatesEntity(-7.924383726418937, 112.59812316203273),
                    CoordinatesEntity(-7.925621426926443, 112.60072352409601),
                    CoordinatesEntity(-7.936198572956666, 112.60589833593819),
                    CoordinatesEntity(-7.942960538055251, 112.60961698435545),
                    CoordinatesEntity(-7.956521477730163, 112.62178865916772),
                    CoordinatesEntity(-7.965869607034778, 112.62828056654956),
                    CoordinatesEntity(-7.985629014873692, 112.63244342872795),
                    CoordinatesEntity(-7.9910347021759085, 112.63163184976567),
                    CoordinatesEntity(-7.995000976376217, 112.63331356479446),
                    CoordinatesEntity(-8.001494308149226, 112.63154156315962),
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
                origin = CoordinatesEntity(-7.92425476786636, 112.59891928500502),
                destination = CoordinatesEntity(-8.026031173865011, 112.64297191605718),
                waypoints = listOf(
                    CoordinatesEntity(-7.924383726418937, 112.59812316203273),
                    CoordinatesEntity(-7.925621426926443, 112.60072352409601),
                    CoordinatesEntity(-7.936219219843287, 112.60590779051714),
                    CoordinatesEntity(-7.944447223926778, 112.6096947252565),
                    CoordinatesEntity(-7.953675870571266, 112.61032977991408),
                    CoordinatesEntity(-7.963985482156703, 112.61415190149745),
                    CoordinatesEntity(-7.966212308044071, 112.61583423326823),
                    CoordinatesEntity(-7.968565118623851, 112.61761587962393),
                    CoordinatesEntity(-7.973599558604135, 112.61733619317447),
                    CoordinatesEntity(-7.978833424727281, 112.62442141866948),
                    CoordinatesEntity(-7.983599805612625, 112.63178275653158),
                    CoordinatesEntity(-7.987701387013194, 112.63088927557418),
                    CoordinatesEntity(-7.991047213411775, 112.63161571857331),
                    CoordinatesEntity(-7.9963546903752665, 112.62889861699212),
                    CoordinatesEntity(-8.00106197724701, 112.62732904499559),
                    CoordinatesEntity(-8.001731320637338, 112.62139915177097),
                    CoordinatesEntity(-8.002805300397176, 112.617450963032),
                    CoordinatesEntity(-7.993347318095277, 112.62073453067775),
                    CoordinatesEntity(-8.020864698301114, 112.62061420203415),
                    CoordinatesEntity(-8.02301499674624, 112.62756483029939)
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
                    CoordinatesEntity(-7.97884962351859, 112.62441615146243),
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
                    CoordinatesEntity(-8.045269193544236, 112.67709938131524),
                    CoordinatesEntity(-8.04064188398805, 112.66680655523892),
                    CoordinatesEntity(-8.03452899589401, 112.65414776433654),
                    CoordinatesEntity(-8.032527550874693, 112.65221949614994),
                    CoordinatesEntity(-8.023502312003943, 112.64744040115059),
                    CoordinatesEntity(-8.012924586130065, 112.64444135638018),
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
                    "Jalan Kyai Parseh Jaya 16",
                    "Jalan Mayor Jendral Sungkono 21",
                    "Jalan Muharto Timur 47",
                    "Jalan Puntodewo 5",
                    "Jalan Terusan Kesatrian 40",
                    "Jalan Panglima Sudirman 85",
                    "Jalan Raden Tumenggung Suryo 4"
                ),
                logo = R.drawable.tst,
                origin = CoordinatesEntity(-8.02607950938143, 112.64297695638614),
                destination = CoordinatesEntity(-7.966726864919944, 112.63886403396471),
                waypoints = listOf(
                    CoordinatesEntity(-8.034363415026583, 112.64227585729),
                    CoordinatesEntity(-8.032762156147362, 112.63268793253853),
                    CoordinatesEntity(-8.02922449501164, 112.63181800894722),
                    CoordinatesEntity(-8.03070587043189, 112.63107047018092),
                    CoordinatesEntity(-8.040172247042042, 112.64227711728131),
                    CoordinatesEntity(-7.99289406343543, 112.64505049092271),
                    CoordinatesEntity(-7.9841448636391155, 112.64635522283567),
                    CoordinatesEntity(-7.979959498357694, 112.64181237128848),
                    CoordinatesEntity(-7.9717784440860235, 112.63832392051216)
                )
            )
            else -> null
        }
    }
}