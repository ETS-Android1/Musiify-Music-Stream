package tp.edu.musicstream;

import androidx.lifecycle.ViewModelProvider;

public class SongCollection {

    public Song[] songs = new Song[97];

    public SongCollection()
    {
        prepareSongs();
    }

    private void prepareSongs()
    {
        Song naked = new Song("S1001",
                "Naked",
                "James Arthur",
                "90cacba244f9b5c31f3195b4be53121441280f42?cid=2afe87a64b0042dabf51f37318616965",
                3.9,
                "naked");

        Song july = new Song ("S1002",
                "July",
                "Noah Cyrus",
                "ab4354e7df7fcf4ddb61654fe406629f9353c655?cid=2afe87a64b0042dabf51f37318616965",
                2.6,
                "july");
        Song deathBed = new Song("S1003",
                "death bed",
                "Powfu",
                "d951d03a53af76165e0f8550ce0319d526c6910d?cid=2afe87a64b0042dabf51f37318616965",
                2.89,
                "deathbed");
        Song itsYou= new Song ("S1004",
                "It's You",
                "Ali Gatie",
                "1219afc55c445aa7c2776f6389a361a4fb55b570?cid=2afe87a64b0042dabf51f37318616965",
                3.54,
                "aligatie");
        Song ifTheWorldwasEnding = new Song("S1005",
                "If the World Was Ending - feat. Julia Michaels",
                "Julia Michaels",
                "018d975f965ed16e92e601c53afa1c7e7ce9ab27?cid=2afe87a64b0042dabf51f37318616965",
                3.48,
                "iftheworldwasending");
        Song Location = new Song ("S1006",
                "Location",
                "Khalid",
                "d50dfb78af7cb29f6363ba1a0d2cbdd707ee137c?cid=2afe87a64b0042dabf51f37318616965",
                3.65,
                "location");
        Song Better = new Song("S1007",
                "Better",
                "Khalid",
                "231f232ae1b45f7b1cc360f4b308912e51a66a86?cid=2afe87a64b0042dabf51f37318616965",
                3.82,
                "better");
        Song DDUDDUDDU = new Song ("S1008",
                "DDU-DU-DDU-DU",
                "BLACKPINK",
                "fc5be05256f35695b96f7a1dc83404f5a606b0f9?cid=2afe87a64b0042dabf51f37318616965",
                3.49,
                "blackpink");
        Song areyouboredyet = new Song ("S1009",
                "Are You Bored Yet?(feat. Clairo)",
                "Wallows",
                "d09dcc3195e04df650274c22ef7fff041b5d22f5?cid=2afe87a64b0042dabf51f37318616965",
                2.97,
                "areyouboredyet");
        Song youbrokemefirst = new Song("S1010",
                "you broke me first",
                "Tate McRae",
                "47afb10323067e827310e5898e4d52c8bdbe72ee?cid=2afe87a64b0042dabf51f37318616965",
                2.82,
                "youbrokemefirst");
        Song happiestyear = new Song("S1011",
                "Happiest Year",
                "Jaymes Young",
                "7fb991b746b4002213e5929b81c89502144ea7de?cid=2afe87a64b0042dabf51f37318616965",
                3.81,
                "happiestyear");
        Song selfish = new Song ("S1012",
                "Selfish",
                "Madison Beer",
                "2356813b2e82e2de17047790e62f4fe91ff3023e?cid=2afe87a64b0042dabf51f37318616965",
                3.72,
                "selfish");
        Song iwannabeyourgirlfriend = new Song ("S1013",
                "i wanna be your girlfriend",
                "girl in red",
                "18ad7cff208417f8ae2333df61f9b6eef29a321c?cid=2afe87a64b0042dabf51f37318616965",
                3.42,
                "iwannabeyourgf");
        Song playdate= new Song ("S1014",
                "Play Date",
                "Melanie Martinez",
                "72adc548b3c77bd00ef8d0ac56846121b63da6e8?cid=2afe87a64b0042dabf51f37318616965",
                3,
                "playdate");
        Song getyouthemoon = new Song ("S1015",
                "Get You The Moon(feat. Snøw)",
                "Kina",
                "d5c74a622751ac0537d769bf795cb728b33ff285?cid=2afe87a64b0042dabf51f37318616965",
                2.98,
                "getyouthemoon");
        Song sayso  = new Song ("S1016",
                "Say So",
                "Doja Cat",
                "28b022f75ffbe8a39cd288f5c5b9b062a4e6e6c2?cid=2afe87a64b0042dabf51f37318616965",
                3.96,
                "sayso");
        Song boywithluv = new Song ("S1017",
                "Boy With Luv (feat. Halsey)",
                "BTS",
                "d16797fb391fb909f3c46454d7cf89a2718f8171?cid=2afe87a64b0042dabf51f37318616965",
                3.83,
                "boywithluv");
        Song jocelynflores = new Song ("S1018",
                "Jocelyn Flores",
                "XXXTENTACION",
                "9fd5ccc86f318c303d582800e9f7d6f07f40440b?cid=2afe87a64b0042dabf51f37318616965",
                1.99,
                "jocelynflores");
        Song dusktilldawn = new Song ("S1019",
                "Dusk Till Dawn - Radio Edit",
                "ZAYN",
                "e2e03acfd38d7cfa2baa924e0e9c7a80f9b49137?cid=2afe87a64b0042dabf51f37318616965",
                3.98,
                "dusktilldawn");
        Song letsfallinlove=new Song ("S1020",
                "Let's Fall in Love for the Night",
                "FINNEAS",
                "6c4c568b6c1e8c86ea51333fcf8a1b30d02b4810?cid=2afe87a64b0042dabf51f37318616965",
                3.17,
                "letsfallinlove");
        Song whatmakesyoubeautiful = new Song("S1021",
                "What Makes You Beautiful",
                "One Direction",
                "170a9a5c3c9d418b8a3027ef538dd34b3291dfeb?cid=2afe87a64b0042dabf51f37318616965",
                3.33,
                "whatmakesyoubeautiful");
        Song watermelonsugar = new Song("S1022",
                "Watermelon Sugar",
                "Harry Styles",
                "0c51b5f7ed852504844feebfb4f4b7f099452662?cid=2afe87a64b0042dabf51f37318616965",
                2.9,
                "watermelonsugar");
        Song breakmyheart = new Song("S1023",
                "Break My Heart",
                "Dua Lipa",
                "db7293c1d12874c0b4e604999ef04f05b185e5d9?cid=2afe87a64b0042dabf51f37318616965",
                3.7,
                "breakmyheart");
        Song savage = new Song("S1024",
                "Savage Remix (feat. Beyoncé)",
                "Megan Thee Stallion",
                "82b86052d5cfa3802d47b4ee63036d2bfeb86525?cid=2afe87a64b0042dabf51f37318616965",
                4.03,
                "savage");
        Song losesomebody = new Song("S1025",
                "Lose Somebody",
                "Kygo",
                "c424249e27d2bc82982e8b0ce3fc1d0d63cdaf83?cid=2afe87a64b0042dabf51f37318616965",
                3.33,
                "losesomebody");
        Song falling = new Song("S1026",
                "Falling",
                "Trevor Daniel",
                "dac6a7bd1f1333d17afe8c12b71ee11e3c233efd?cid=2afe87a64b0042dabf51f37318616965",
                2.66,
                "falling");
        Song roxanne = new Song ("S1027",
                "ROXANNE",
                "Arizona Zervas",
                "17c8499c72603f1a2726dd121eb245c445d1dd84?cid=2afe87a64b0042dabf51f37318616965",
                2.73,
                "roxanne");
        Song ifly=new Song("S1028",
                "I.F.L.Y.",
                "Bazzi",
                "3040c0b95911403ee50f4633c90af4c4e586d087?cid=2afe87a64b0042dabf51f37318616965",
                2.76,
                "ifly");
        Song sugar = new Song("S1029",
                "SUGAR",
                "BROCKHAMPTON",
                "5ede99e4306c75ac7b99f277807fb91c2ce5c785?cid=2afe87a64b0042dabf51f37318616965",
                3.41,
                "sugar");
        Song eleven = new Song("S1030",
                "Eleven",
                "Khalid",
                "7abee43bcccb391f353ffdc0ebdfa954f1b9c698?cid=2afe87a64b0042dabf51f37318616965",
                3.44,
                "eleven");
        Song whohurtyou = new Song("S1031",
                "Who Hurt You?",
                "Daniel Caesar",
                "22f80d93d6568c0c46b2f9b646bf708cbdee0bdc?cid=2afe87a64b0042dabf51f37318616965",
                3.87,
                "whohurtyou");
        Song fomo = new Song("S1032",
                "FOMO",
                "Sylo Nozra",
                "78be0aff39071a90f51f9fa0b9f00733fecc2cea?cid=2afe87a64b0042dabf51f37318616965",
                2.12,
                "fomo");
        Song icry = new Song("S1033",
                "I Cry",
                "Usher",
                "75daa1bd616364ee747fb91d157bbfa10bb06019?cid=2afe87a64b0042dabf51f37318616965",
                3.64,
                "icry");
        Song whatspoppin = new Song("S1034",
                "WHATS POPPIN",
                "Jack Harlow",
                "682ac5ca2ac4f619d5cbcd7617c586fbbb0b8309?cid=2afe87a64b0042dabf51f37318616965",
                2.33,
                "whatspoppin");
        //country music
        Song goodtime = new Song ("S1035",
                "Good Time",
                "Alan Jackson",
                "19784353976379a15fdcb3a69a27bb03caceb05a?cid=2afe87a64b0042dabf51f37318616965",
                5.11,
                "goodtime");
        Song tequila = new Song("S1036",
                "Tequila",
                "Dan + Shay",
                "fb12ad0f0757edb94b3cbf4911039e526ab1e54c?cid=2afe87a64b0042dabf51f37318616965",
                3.28,
                "tequila");
        Song bootscootinboogie = new Song ("S1037",
                "Boot Scootin' Boogie",
                "Brooks & Dunn",
                "45be19d05b83514c432670c16b4c147f8c008b9f?cid=2afe87a64b0042dabf51f37318616965",
                3.3,
                "boogie");
        Song honeybee = new Song("S1038",
                "Honey Bee",
                "Blake Shelton",
                "77ff81b6f17cef9426c464a64e2e51226a92d61e?cid=2afe87a64b0042dabf51f37318616965",
                3.51,
                "honeybee");
        Song takeabackroad=new Song("S1039",
                "Take A Back Road",
                "Rodney Atkins",
                "6d48015b2c2c65a8cdbbc359c12a29574a6efda8?cid=2afe87a64b0042dabf51f37318616965",
                3.49,
                "takeabackroad");
        Song mygirl = new Song("S1040",
                "My Girl",
                "Dylan Scott",
                "184f41254eaefdec1222536acc257f1603bb2f20?cid=2afe87a64b0042dabf51f37318616965",
                3.29,
                "mygirl");
        Song beforehecheats = new Song("S1041",
                "Before He Cheats",
                "Carrie Underwood",
                "b61f1fd8811b6c9bd9d5d0b47c35175aba787201?cid=2afe87a64b0042dabf51f37318616965",
                3.33,
                "beforehecheats");
        Song goodvibes = new Song("S1042",
                "Good Vibes",
                "Chris Janson",
                "47cdf2ffb8a08b323e40d690edf2dfad5d125c6d?cid=2afe87a64b0042dabf51f37318616965",
                2.76,
                "goodvibes");
        Song beercan = new Song("S1043",
                "Beer Can",
                "Luke Combs",
                "d17381d1f66d19cd20a32a2adc5131bf8fe81760?cid=2afe87a64b0042dabf51f37318616965",
                3.52,
                "beercan");
        Song summertime = new Song("S1044",
                "Summertime",
                "Kenny Chesney",
                "821a56bbf9010ab683b1e69e8faf6795c8ee56bd?cid=2afe87a64b0042dabf51f37318616965",
                3.43,
                "summertime");

        //lofi music
        Song ithoughtihadyou = new Song("S1045",
                "I Thought I Had You",
                "Kayou",
                "5d74e3058a4f489376018de11af95154fd856a40?cid=2afe87a64b0042dabf51f37318616965",
                2.89,
                "ithoughtihadyou");
        Song socialdistancing = new Song("S1046",
                "Social Distancing",
                "Slow Dreamers",
                "4772381b7a311b450e7b32450640873d835926b4?cid=2afe87a64b0042dabf51f37318616965",
                3.03,
                "socialdistancing");
        Song bewildered = new Song("S1047",
                "Bewildered",
                "Hanz",
                "b1040095a2345ae4b9acd6e5a7e6c9b3817ac5f9?cid=2afe87a64b0042dabf51f37318616965",
                2.6,
                "bewildered");
        Song careless = new Song("S1048",
                "Careless",
                "Coastal",
                "99bdbad78d00cc302505b65c73d4deb398725165?cid=2afe87a64b0042dabf51f37318616965",
                2.67,
                "careless");
        Song coralreef = new Song("S1049",
                "Coral Reef",
                "Slowheal",
                "dc0e515c6ea8c7ef6ace3a92d7e8b776ce4000d7?cid=2afe87a64b0042dabf51f37318616965",
                2.7,
                "coralreef");
        Song aprilshowers = new Song("S1050",
                "april showers",
                "aqualina",
                "72414251ab936ca65a6aebb2349aa15c6bb6889c?cid=2afe87a64b0042dabf51f37318616965",
                2.11,
                "aprilshowers");
        Song distance = new Song("S1051",
                "distance",
                "Rook1e",
                "6a323118fdad83eb3d04dcc24176c1b4c96bca7e?cid=2afe87a64b0042dabf51f37318616965",
                1.36,
                "distance");
        Song roses = new Song("S1052",
                "roses",
                "Cantsleep",
                "71bb73548419494d619f667b9ce69b369717a6f4?cid=2afe87a64b0042dabf51f37318616965",
                1.59,
                "roses");
        Song ibroughtherflowers = new Song("S1053",
                "i brought her flowers.",
                "frumhere",
                "382d4e0c9b248b90934d05960d8cd9e220f80e24?cid=2afe87a64b0042dabf51f37318616965",
                2.2,
                "ibroughtherflowers");
        Song feelingtoogood = new Song("S1054",
                "this feeling's too good",
                "j'san",
                "8dadfad985f75fdc28ae65805948ec820022ce49?cid=2afe87a64b0042dabf51f37318616965",
                1.84,
                "feelingtoogood");

        //edm music
        Song illwait = new Song("S1055",
                "I'll Wait",
                "Kygo",
                "740a0d231e29a169f5c1394283b4f06845ebabcd?cid=2afe87a64b0042dabf51f37318616965",
                3.59,
                "illwait");
        Song liftyourenergy =new Song("S1056",
                "Lift Your Energy",
                "Eden Prince",
                "e0fcc9d517770262d7e24bfb88a26559ece4ad24?cid=2afe87a64b0042dabf51f37318616965",
                2.57,
                "liftyourenergy");
        Song lucky = new Song("S1057",
                "Lucky",
                "Vlossom",
                "b4ca9fd36aa1c65564c1cc583ca02404730be625?cid=2afe87a64b0042dabf51f37318616965",
                3.43,
                "lucky");
        Song follow = new Song("S1058",
                "Follow",
                "Kygo",
                "235a143f0e1f890a875485e4dfe8c40ba3fef2f7?cid=2afe87a64b0042dabf51f37318616965",
                2.92,
                "follow");
        Song loseitall = new Song("S1059",
                "Lose It All",
                "Matt Nash",
                "a44dd2507c7294e1a3b23d9ffc1428986307d7b2?cid=2afe87a64b0042dabf51f37318616965",
                2.95,
                "loseitall");
        Song stupidthings = new Song("S1060",
                "Stupid Things",
                "Discrete",
                "e0b07e12ebc61a66d505145cf1b2768bda83e2df?cid=2afe87a64b0042dabf51f37318616965",
                3.24,
                "stupidthings");
        Song fadeaway = new Song("S1061",
                "Fade Away",
                "Backs",
                "c0fb3628cf924cb358f6370e12d47115b62f633d?cid=2afe87a64b0042dabf51f37318616965",
                2.63,
                "fadeaway");
        Song monsters = new Song("S1062",
                "Monsters",
                "Midnight Kids",
                "d308abff3b4263553fd61c19162fdad4e737ad81?cid=2afe87a64b0042dabf51f37318616965",
                3.97,
                "monsters");
        Song drifting = new Song("S1063",
                "Drifting",
                "WOXX",
                "1ef1fe8c7928afac823c3eb95565d4ccb1e1d97d?cid=2afe87a64b0042dabf51f37318616965",
                2.65,
                "drifting");
        Song takemeaway = new Song("S1064",
                "Take Me Away",
                "Third Party",
                "17f25f5bd8027d8426390762a16253431d80d8dc?cid=2afe87a64b0042dabf51f37318616965",
                3.9,
                "takemeaway");

        //rap songs + savage (S1024) + whatspoppin (S1034)
        Song thebox = new Song("S1065",
                "The Box",
                "Roddy Rich",
                "52c74a85b9b187b8f51bfe1c7b19a25f7624161a?cid=2afe87a64b0042dabf51f37318616965",
                3.28,
                "thebox");
        Song arizona = new Song("S1066",
                "24",
                "Arizona Zervas",
                "f4b42e9069f54d04b16f958d1d96f995a8c07b51?cid=2afe87a64b0042dabf51f37318616965",
                2.07,
                "twentyfour");
        Song dnd = new Song("S1067",
                "DND",
                "Polo G",
                "e6808ddc1f335effff6371b327c9ebf48f0ebd5b?cid=2afe87a64b0042dabf51f37318616965",
                3,
                "dnd");
        Song omg = new Song("S1068",
                "OMG",
                "YONAS",
                "bcb7fb5179da007a105986340fcba9430f9fe5b9?cid=2afe87a64b0042dabf51f37318616965",
                2.43,
                "omg");
        Song suicidal = new Song("S1069",
                "Suicidal",
                "YNW Melly",
                "b7b850b2189ee14f3bec0c5e9313688d4b3d157e?cid=2afe87a64b0042dabf51f37318616965",
                3.72,
                "suicidal");
        Song cardigan = new Song ("S1070",
                "Cardigan",
                "Don Toliver",
                "c3251140d22b335979a624039c6dba40e809a41c?cid=2afe87a64b0042dabf51f37318616965",
                2.65,
                "cardigan");
        Song freak = new Song ("S1071",
                "FREAK",
                "Tyga",
                "37345e1238f27f2a1c20ad32181c5ff6610b4c4b?cid=2afe87a64b0042dabf51f37318616965",
                2.9,
                "freak");
        Song immortal = new Song("S1072",
                "Immortal",
                "21 Savage",
                "6d350a77831705b2d3c35ce5c8e18c48678b6081?cid=2afe87a64b0042dabf51f37318616965",
                4.25,
                "immortal");

        //chill music + selfish + if the world was ending + you broke me first + happiest year + sugar + july
        Song thiscity = new Song("S1073",
                "This City",
                "Sam Fischer",
                "3c60b1d62c274d479c3fe5b4931062150fbcbe5d?cid=2afe87a64b0042dabf51f37318616965",
                3.25,
                "thiscity");
        Song painkiller = new Song("S1074",
                "Painkiller",
                "Ruel",
                "b37aa09750a26c4f0d2a43829b1d5437ca8aa365?cid=2afe87a64b0042dabf51f37318616965",
                3.56,
                "painkiller");
        Song feelings = new Song("S1075",
                "Feelings",
                "Lauv",
                "bd9ec99e64daabf3d208fd67a33f5e3c2c5b242c?cid=2afe87a64b0042dabf51f37318616965",
                3.17,
                "feelings");
        Song  idmy = new Song("S1076",
                "i don't miss u",
                "Caro",
                "4bf2009402e37fda38409697a804c93965746c62?cid=2afe87a64b0042dabf51f37318616965",
                2.98,
                "idmy");

        //rock + areyouboredyet + happiestyear + letsfallinlove
        Song sleep = new Song ("S1077",
                "Sleep",
                "Savatage",
                "f57c86a5d068145e528cddb25bde451447524ecc?cid=2afe87a64b0042dabf51f37318616965",
                3.88,
                "sleep");
        Song lovedontlie = new Song ("S1078",
                "Love Don't Lie",
                "Bonfire",
                "61cafe09b1f79b43efbcb71d0bac00240085135e?cid=2afe87a64b0042dabf51f37318616965",
                5.66,
                "lovedontlie");
        Song  everglow = new Song("S1079",
                "Everglow",
                "Coldplay",
                "0b52f57189a7bb1229df5d092289c5a3a0811a06?cid=2afe87a64b0042dabf51f37318616965",
                4.71,
                "everglow");
        Song alliwant = new Song ("S1080",
                "All I Want",
                "Kodaline",
                "ee5e210cdea9f22e545ea435c0467dcecdeb41ca?cid=2afe87a64b0042dabf51f37318616965",
                5.1,
                "alliwant");
        Song ifound = new Song("S1081",
                "I Found",
                "Amber Run",
                "c68f12ac9af0ee40834129bd23e6c7cf3cd4897e?cid=2afe87a64b0042dabf51f37318616965",
                4.55,
                "ifound");
        Song youuu = new Song("S1082",
                "Youuu",
                "COIN",
                "2a6416a35d7b2fee12c12c09000bdd073cf22ed5?cid=2afe87a64b0042dabf51f37318616965",
                3.92,
                "youuu");
        Song bang = new Song("S1083",
                "Bang!",
                "AJR",
                "d7b9e7373a8bb67695c1f2c68e78f812a0df56c6?cid=2afe87a64b0042dabf51f37318616965",
                2.85,
                "bang");
        Song realthing = new Song ("S1084",
                "Real Thing",
                "Ruel",
                "4ce810db1d49e34c6cc312dd6451644b2d0ec2e5?cid=2afe87a64b0042dabf51f37318616965",
                3.21,
                "realthing");
        Song unsaid = new Song("S1085",
                "Down for You",
                "Ruel",
                "c2bcae7e6aa049b0da1091c3f68a36c32666ff9c?cid=2afe87a64b0042dabf51f37318616965",
                3.23,
                "downforyou");
        Song gototown = new Song("S1086",
                "Go To Town",
                "Doja Cat",
                "9b385a668e0f5266a10f6056d2cc536c15d43d1c?cid=2afe87a64b0042dabf51f37318616965",
                3.63,
                "gototown");
        Song freakk = new Song("S1087",
                "Freak",
                "Doja Cat",
                "f285f3ab917331d4f566bd00a47d749958d5fac3?cid=2afe87a64b0042dabf51f37318616965",
                4.74,
                "freak");
        Song teen=new Song("S1088",
                "American Teen",
                "Khalid",
                "3b4aa1b644a30474a3383594acf8b6ba6eba7fda?cid=2afe87a64b0042dabf51f37318616965",
                4.18,
                "americanteen");
        Song foreveryoung=new Song("S1089",
                "Forever Young",
                "BLACKPINK",
                "3254b8904dac8a1d1725392f32835bbb6f07e0d3?cid=2afe87a64b0042dabf51f37318616965",
                3.95,
                "foreveryoung");
        Song boombayah = new Song("S1090",
                "BOOMBAYAH",
                "BLACKPINK",
                "c869cbcb6c35e33e63474eb05c6ae631b03e64eb?cid=2afe87a64b0042dabf51f37318616965",
                4.03,
                "boombayah");
        Song running = new Song("S1091",
                "Running On My Mind",
                "Ali Gatie",
                "d7f6deec8eb245f25e421b038e1b57c1927425a4?cid=2afe87a64b0042dabf51f37318616965",
                2.61,
                "running");
        Song moonlight=new Song("S1092",
                "Moonlight",
                "Ali Gatie",
                "47612d33d2a550b522cb4ead556243e263c4cb43?cid=2afe87a64b0042dabf51f37318616965",
                3.81,
                "moonlight");
        Song dontcry=new Song("S1093",
                "Don't Cry",
                "Ruel",
                "c5c6e85c6069c5b9615c65ec212c00d7e2714857?cid=2afe87a64b0042dabf51f37318616965",
                3.12,
                "dontcry");
        Song stupid = new Song("S1094",
                "stupid",
                "Tate McRae",
                "ef1cf2c3cdcf03b8d79799f01784ddd28ac7a692?cid=2afe87a64b0042dabf51f37318616965",
                2.88,
                "stupid");
        Song slip = new Song("S1095",
                "Slip",
                "Tate McRae",
                "3cb83d95d8a37d4ec5262884e76c38dac86ca7f3?cid=2afe87a64b0042dabf51f37318616965",
                2.86,
                "slip");
        Song detention = new Song("S1096",
                "Detention",
                "Melanie Martinez",
                "39974277226429a0020a3a6b5da62cc4476c2bdb?cid=2afe87a64b0042dabf51f37318616965",
                3.95,
                "detention");
        Song firedrill=new Song("S1097",
                "Fire Drill",
                "Melanie Martinez",
                "fcc9e7e6dc2a1628e7b101bc2c65e59c347175d4?cid=2afe87a64b0042dabf51f37318616965",
                4.25,
                "firedrill");


        songs[0]= naked;
        songs[1]= july;
        songs[2]= deathBed;
        songs[3]= itsYou;
        songs[4]=ifTheWorldwasEnding;
        songs[5]=Location;
        songs[6]=Better;
        songs[7]=DDUDDUDDU;
        songs[8]=areyouboredyet;
        songs[9]=youbrokemefirst;
        songs[10]=happiestyear;
        songs[11]=selfish;
        songs[12]=iwannabeyourgirlfriend;
        songs[13]=playdate;
        songs[14]=getyouthemoon;
        songs[15]=sayso;
        songs[16]=boywithluv;
        songs[17]=jocelynflores;
        songs[18]=dusktilldawn;
        songs[19]=letsfallinlove;
        songs[20]=whatmakesyoubeautiful;
        songs[21]=watermelonsugar;
        songs[22]=breakmyheart;
        songs[23]=savage;
        songs[24]=losesomebody;
        songs[25]=falling;
        songs[26]=roxanne;
        songs[27]=ifly;
        songs[28]=sugar;
        songs [29]=eleven;
        songs[30]=whohurtyou;
        songs[31]=fomo;
        songs[32]= icry;
        songs[33]=whatspoppin;
        songs[34]=goodtime;
        songs[35]=tequila;
        songs[36]=bootscootinboogie;
        songs[37]=honeybee;
        songs[38]=takeabackroad;
        songs[39]=mygirl;
        songs[40]=beforehecheats;
        songs[41]=goodvibes;
        songs[42]=beercan;
        songs[43]=summertime;
        songs[44]=ithoughtihadyou;
        songs[45]=socialdistancing;
        songs[46]=bewildered;
        songs[47]=careless;
        songs[48]=coralreef;
        songs[49]=aprilshowers;
        songs[50]=distance;
        songs[51]=roses;
        songs[52]=ibroughtherflowers;
        songs[53]=feelingtoogood;
        songs[54]=illwait;
        songs[55]=liftyourenergy;
        songs[56]=lucky;
        songs[57]=follow;
        songs[58]=loseitall;
        songs[59]=stupidthings;
        songs[60]=fadeaway;
        songs[61]=monsters;
        songs[62]=drifting;
        songs[63]=takemeaway;
        songs[64]=thebox;
        songs[65]=arizona;
        songs[66]=dnd;
        songs[67]=omg;
        songs[68]=suicidal;
        songs[69]=cardigan;
        songs[70]=freak;
        songs[71]=immortal;
        songs[72]=thiscity;
        songs[73]=painkiller;
        songs[74]=feelings;
        songs[75]=idmy;
        songs[76]=sleep;
        songs[77]=lovedontlie;
        songs[78]=everglow;
        songs[79]=alliwant;
        songs[80]=ifound;
        songs[81]=youuu;
        songs[82]=bang;
        songs[83]=realthing;
        songs[84]=unsaid;
        songs[85]=gototown;
        songs[86]=freakk;
        songs[87]=teen;
        songs[88]=foreveryoung;
        songs[89]=boombayah;
        songs[90]=running;
        songs[91]=moonlight;
        songs[92]=dontcry;
        songs[93]=stupid;
        songs[94]=slip;
        songs[95]=detention;
        songs[96]=firedrill;







    }

    public Song searchById(String id) {
        Song song = null;

        //songs playing in sequence and getting songs by their id and imagebutton
        for (int index = 0; index < songs.length; index++) {
            song = songs[index];

            //if id and imagebutton id is same, song will play
            if (song.getId().equals(id)) {
                return song;
            }
        }

        return song;
    }

    public Song getNextSong(String currentSongId)
    {
        Song song = null;

        //playing song in sequence
        for(int index = 0; index < songs.length; index++)
        {
            String tempSongId = songs[index].getId();

            if (tempSongId.equals(currentSongId)&& (index < songs.length - 1))
            {
                song = songs [index +1];

                break;
            }
        }
        return song;
    }
    public Song getPrevSong(String currentSongId)
    {
        Song song = null;

        for(int index = 0; index < songs.length; index++)
        {
            String tempSongId = songs[index].getId();

            if (tempSongId.equals(currentSongId)&& (index != 0))
            {
                song = songs [index -1];

                break;
            }
        }
        return song;
    }
    public Song searchByName(String Name)
    {
        Song song = null;
        //songs playing by its song title

        for (int index = 0; index<songs.length; index++)
        {
            song = songs[index];
            if (song.getTitle().equals(Name))
            {
                return song;
            }
        }
        return song;
    }
}

