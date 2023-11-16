package day32_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {


    /*
        Map kompleks bilgiler barindirabilir
        Ne kadar cok bilgi barindirirsa, bilgilere erismek o kadar islem gerektirebilir
        Ama temel olarak map key ve value'dan olusur

        value bir cok bilgi barindiran bir String ise
        bilgilere ulasmak icin split() ile String'i array'e ceviririz

        1- Eger sadece value'dan bilgiler istenirse
           - ogrenciMap.values() ile value'ler bir collection'a kaydedilir
           - sonra collection'daki String'ler for-each loop ile ele alinip
           - split() ile array'e cevrilir
           - ve ISTENEN SARTLARA uyan value'lardan ISTENEN BILGILER kullanilir

        2- Eger key ve value birlikte istenirse
            - ogrenciMap.keySet() ile key'ler bir Set'e kaydedilir
            - for each loop ile key'ler elden gecirilir
            - sadece key degil, ogrenciMap.get(each) ile value'ya ulasilir
            - value, split() ile array'e cevrilir
            - Istenen sartlari saglayan kayitlarin, istenen bilgileri KULLANILIR

     */

    // verilen sube'deki ogrencilerin isim ve soyisimlerini yazdiran bir method olusturun

    public static void subeListesiyazdir(Map<Integer,String> ogrenciMap, String istenenSube){

        Collection<String> valueCollection = ogrenciMap.values(); // bu bize ogrenciMap'deki isim listesinin value'lerini
        // collection halinde getiriyor:
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]

        String[] valueArr; // value'leri icine koyacagimiz, string'lerden olusan bir array tanimliyoruz
        System.out.println("========"+istenenSube + " subesi ogrenci Listesi"+"======");

        for (String each: valueCollection // for each ile collection'un her value'yu tek tek ele aliyoruz
        ) { // each ==> Ali-Can-11-H-MF

            // bu value'leri array listesine ceviriyoruz, split ile
            valueArr = each.split("-"); // [Ali, Can, 11, H, MF]

            // eger diyoruz, elimizdeki array'in 3.cu elemani istenenSube'ye esitse
            // array'in 0.ci ve 1. elemanlarini yazdiriyoruz
            if (valueArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println(valueArr[0] + " "+ valueArr[1]);
            }
        }

    }

    public static Map<Integer, String> okulMapDondur() {

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
        ogrenciMap.put(108,"Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109,"Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110,"Azim-Kayisi-11-K-TM");

        return ogrenciMap;
    }

    public static void bolumListesiYazdir(Map<Integer, String> ogrenciMap, String istenenBolum) {
        // istenen bolumdeki ogrencilerin sinif, sube, isim, soyisim'lerini yazdiran
        // bir method olusturun diyordu C04'deki requirement'da
        Collection<String> valueCollection = ogrenciMap.values();

        String[] valueArr; // value'leri icine koyacagimiz, string'lerden olusan bir array tanimliyoruz

        System.out.println("======="+ istenenBolum + " bolumu ogrenci listesi=========");

        for (String each : valueCollection // each ile her birini ele aliyoruz
        ) { // each ==> "Azim-Kayisi-11-K-TM"

            //split ile array'e kaydediyoruz
            valueArr = each.split("-"); // [Ali, Can, 11, H, MF]

            // eger diyoruz, array'in 4. index'i istenenBolum'e esitse,
            // sinif, sube, isim ve soyisimlerin index'lerini siraliyoruz
            // bu sekilde bu olayi da burada formuluze etmis oluyoruz
            if (valueArr[4].equalsIgnoreCase(istenenBolum)){

                System.out.println(valueArr[2] + " " + valueArr[3] + " " + valueArr[0] + " "+valueArr[1]);
            }

        }
    }

    public static void soyisimdenOgrenciBulma(Map<Integer, String> ogrenciMap, String istenenSoyisim) {

        // sinif, sube, isim, soyisim bilgilerini yazdiran bir method olusturun

        Collection<String> valueCollection = ogrenciMap.values();
        // bir collection olusturuyoruz, stringlerden olusan, ismi valueCollection.
        // bu value'leri ogrenciMap'inden almasi lazim

        String[] valueArr; // value'leri icine koyacagimiz, string'lerden olusan bir array tanimliyoruz
        System.out.println("=======" + istenenSoyisim+" soyismindeki ogrenci listesi ======");

        for (String each : valueCollection // each ile her birini ele aliyoruz
        ) { // each ==> "Azim-Kayisi-11-K-TM"

            //split ile array'e kaydediyoruz
            valueArr = each.split("-");


            // eger diyoruz, array'in 1. index'i istenenSoyisim'e esitse,
            if (valueArr[1].equalsIgnoreCase(istenenSoyisim)){
                // sinif, sube, isim, soyisim bilgilerini yazdiriyoruz
                System.out.println(valueArr[2] + " " + valueArr[3] + " " + valueArr[0] + " "+valueArr[1]);

            }

        }

    }

    public static void numaraliSinifOgrenciListesiYazdir(Map<Integer, String> ogrenciMap, String sinifNo) {
        // numara, isim, soyisim ve subelerini yazdiran bir method olusturun
        Set<Integer> keySeti = ogrenciMap.keySet(); //[101, 102, 103, 104, 105, 106, 107, 108, 109, 110]
        String valueEach; // bu keySet'teki numaralari string olarak kaydeden bir variable olusturuyoruz
        String[] valueArr; // stringlerden olusan bir array tanimliyoruz

        System.out.println("======= Numarali "+ sinifNo + ". sinif listesi ========");

        for (Integer each : keySeti
        ) { // each ==> key'leri getirecek 101

            valueEach = ogrenciMap.get(each); // "Azim-Kayisi-11-K-TM"
            valueArr = valueEach.split("-"); // split ile stringleri array'e ceviriyoruz

            // eger, array'in 2.index'i sinifNo'ya esitse, her bir ismi istenen sekilde yazdir diyoruz
            // buna gore index'leri siraliyoruz
            if (valueArr[2].equals(sinifNo)){

                System.out.println(each + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[3]);

            }

        }

    }

    public static void numaraAraligindakiOgrenciListesi(Map<Integer, String> ogrenciMap, int baslangicNo, int bitisNo) {

        // ogrencilerin numara, isim, soyisim'lerini yazdiran bir method olusturun

        // oncelikle tum ogrenci numaralarini keySet ile getirelim
        Set<Integer> keySeti = ogrenciMap.keySet();
        // [101, 102, 103, 104, 105, 106, 107, 108, 109, 110]

        String valueEach; // bu keySet'teki numaralari string olarak kaydeden bir variable olusturuyoruz
        String[] valueArr; // stringlerden olusan bir array tanimliyoruz
        int sayac=0;

        for (Integer each : keySeti
        ) { // each ==> 101

            // eger keySet'den gelen each (her bir ogrenci numarasi),
            // istedigimiz aralikta ise
            if (each >= baslangicNo && each<=bitisNo){

                // o each (yani numaya ait) ogrencinin, value olarak kaydedilen bilgileri lazim
                valueEach = ogrenciMap.get(each); // ogrenciMap'inden value'yu get ile cagiriyoruz
                // split ile array'e ceviriyoruz
                valueArr = valueEach.split("-");

                // sonra da istenen araliktaki numaralari ve o numaraya ait ogrenci isim bilgisini yazdiriyoruz
                System.out.println(each + " " + valueArr[0] + " " + valueArr[1]);
                sayac++; // her seferinde sayac birer artiyor
                //istersek bu sayac ile kac tane ogrenci oldugunu da yazdirabiliriz

            }

        }
        System.out.println("bu aralikta "+ sayac +" tane ogrenci bulunmaktadir");
        if (sayac == 0){
            System.out.println("Verilen aralikta ogrenci bulunmamaktadir");
        }

    }

    public static Map<Integer, String> numaraIleSoyisimUpdate(Map<Integer, String> ogrenciMap, int ogrenciNo, String yeniSoyisim) {

        // once istenen ogrenci numarasina ait value'u alalim
        // Ali-Cem-11-K-TM
        String ogrenciValue = ogrenciMap.get(ogrenciNo);

        // split ile datayi manipule edilebilir hale getirelim
        // [Ali, Cem, 11, K, TM]
        String[] ogrenciValueArr = ogrenciValue.split("-");

        // array'in 1.index'indeki soyismi yeniSoyisim olarak update edelim
        // [Ali, Celik, 11, K, TM]
        ogrenciValueArr[1] = yeniSoyisim;

        // array'deki elemanlari, yeniden value formatina sokmamiz lazim
        // String olarak "Ali-Celik-11-K-TM" elde ederiz
        String yeniValue =  ogrenciValueArr[0] + "-" +
                ogrenciValueArr[1] + "-" +
                ogrenciValueArr[2] + "-" +
                ogrenciValueArr[3] + "-" +
                ogrenciValueArr[4];

        // elimizde key var(ogrenciNo),elimizde yeni value de var
        // bunu ogrenciMap'e ekliyoruz put ile
        ogrenciMap.put(ogrenciNo,yeniValue);

        return ogrenciMap;
    }

    public static Map<Integer, String> subedekiOgrencileriTasi(Map<Integer, String> ogrenciMap, String eskiSube, String yeniSube) {

        // Hangi ogrenci numarasinin subesi degisecek bilmedigimden
        // once keySeti() ile tum key'leri alalim  // [101, 102, 103, 104, 105, 106, 107, 108, 109, 110]
        Set<Integer> keySeti = ogrenciMap.keySet();

        // for-each loop ile her key'e ait value'yu ele alalim
        // Ali-Cem-11-K-TM

        String[] valueArr; // string'lerden olusan bir array tanimliyoruz
        // for loop'dan once yaziyoruz ki methodun her yerinde kullanilabilsin diye


           for (Integer each : keySeti // bizim oglan each, key'leri key setten getirecek
        ){
               // Value'daki bilgileri kullanabilmek icin array'e cevirelim
               // [Ali, Cem, 11, K, TM]
               // get(each) ile her bir key'in value'sunu getirtiyoruz,
               // split() ile de string olan bu value'leri array'e ceviriyoruz
               valueArr = ogrenciMap.get(each).split("-");



               // array[3]'e bakip istenen eskiSube degerine esit ise
               // yeni sube olarak update edelim
               if (valueArr[3].equalsIgnoreCase(eskiSube)){
                   valueArr[3] = yeniSube;

               }


               // map'i update edebilmek icin
               // array'i value formatina uygun String'e donusturelim
               String yeniValue =  valueArr[0] + "-" +
                       valueArr[1] + "-" +
                       valueArr[2] + "-" +
                       valueArr[3] + "-" +
                       valueArr[4];


               // key ve yeni value'yu kullanarak
               // Map'i update edelim
               ogrenciMap.put(each,yeniValue);
           }

        return ogrenciMap;
    }
    public static Map<Integer, String> yilSonuSinifArtir(Map<Integer, String> ogrenciMap) {

        Set<Integer> keySeti = ogrenciMap.keySet();
        String[] valueArr;

        for (Integer each:keySeti
        ) {
            valueArr = ogrenciMap.get(each).split("-");

            // array'deki sinif bilgisini 1 artirmam lazim
            switch (valueArr[2]){
                case "9" :
                    valueArr[2] = "10";
                    break;
                case "10" :
                    valueArr[2] = "11";
                    break;
                case "11" :
                    valueArr[2] = "12";
                    break;
                case "12" :
                    valueArr[2] = "Mezun";
                    break;
                default:
                    valueArr[2] = null ;
            }
            String yeniValue =  valueArr[0] + "-" +
                    valueArr[1] + "-" +
                    valueArr[2] + "-" +
                    valueArr[3] + "-" +
                    valueArr[4];

            ogrenciMap.put(each,yeniValue);
        }

        return ogrenciMap;
    }



    public static Map<Integer, String> isimDuzenle(Map<Integer, String> ogrenciMapi) {

        /* day33,C06'dan==> tum listeyi gozden gecirerek
        isimleri ilk harfi buyuk, sonraki harfleri kucuk olacak sekilde update eden bir method olusturun */

        // update dedigi icin bir entry seti olusturalim
        Set<Map.Entry<Integer,String>> entrySeti = ogrenciMapi.entrySet();

        String eachValue;
        String [] valueArr;
        String isim;

        // her bir entry'i ele almak icin for each loop kullanalim

        for (Map.Entry<Integer,String> eachEntry: entrySeti
             ) {
            // her bir entry'deki value'yi alalim
            eachValue=eachEntry.getValue();

            // value'yi degistirebilmek icin array yapalim
            valueArr=eachValue.split("-");

            // array [0] de bulunan isim bilgisini istenen formata getirelim

            isim=valueArr[0];
            valueArr[0]=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
            // map'i update edebilmek icin array'i String olarak birlestirelim
            String yeniValue =  valueArr[0] + "-" +
                    valueArr[1] + "-" +
                    valueArr[2] + "-" +
                    valueArr[3] + "-" +
                    valueArr[4];


            //setEntryValue() ile guncellenen value'yi update edelim
            eachEntry.setValue(yeniValue);

        }

        return ogrenciMapi;
    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        // okulMap'deki tum soyisimleri buyuk harf yapan bir method olusturun
        Set<Map.Entry<Integer,String>> entrySeti = ogrenciMap.entrySet();

        String eachValue;
        String [] valueArr;

        for (Map.Entry<Integer,String> eachEntry: entrySeti
             ) {
            eachValue =eachEntry.getValue();
            valueArr=eachValue.split("-"); // [Ali, Cem, 11, C, TM]

            valueArr [1] = valueArr[1].toUpperCase();
            // soyisim, valueArr array'inin 1. index'inde yer aliyor.
            // o yuzden valueArr'in index 1'ini toUpperCase ile buyuk harflere ceviriyoruz

            // yapacagimiz degisikligi yaptik, artik herseyi yerine yerlestiriyoruz
            // array listesini bir string olan yeniValue'ye atiyoruz, her bir index'i tek tek ekliyoruz
            String yeniValue =  valueArr[0] + "-" +
                    valueArr[1] + "-" +
                    valueArr[2] + "-" +
                    valueArr[3] + "-" +
                    valueArr[4];

            // yeni value'mizi setValue methodu ile, entry'nin her bir elemanini update ediyoruz
            eachEntry.setValue(yeniValue);

        }

        return ogrenciMap;
    }


    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMapi, String sinif, String sube) {

        // numara, isim, soyisim dedigi icin gelsin entry diyoruz, entry ile hepsini birden kullanabiliyoruz,
        // diger turlu key'ler icin ayri, value'ler icin ayri method cagirmamiz gerekir cunku

        Set<Map.Entry<Integer,String>> entrySeti =ogrenciMapi.entrySet();

        // entry'leri elden gecirip
        // sinif ve sube bilgisi istenen degere esit olanlari yazdiralim

        String eachValue;
        String [] valueArr;
        System.out.println(sinif+"/"+sube+" sinif listesi");

        for (Map.Entry<Integer,String> eachEntry: entrySeti){
            // eachEntry ==> 110=Azim-Kayisi-11-K-TM

            eachValue = eachEntry.getValue(); // Azim-Kayisi-11-K-TM
            valueArr = eachValue.split("-"); // [ Azim, Kayisi, 11, K, TM]

            if (valueArr[2].equals(sinif) && valueArr[3].equalsIgnoreCase(sube)){

                System.out.println(eachEntry.getKey() +" "+valueArr[0] +" "+ valueArr[1] );

            }


        }


    }

    public static Map<String,Object> rezervasyonOlustur(String firstname, String lastname, int totalprice, boolean depositpaid, String checkin, String checkout, String additinonalneeds) {

          /*{
            “firstname” : “Ahmet”,
            “lastname” : “Bulut”,
            “totalprice” : 500,
            “depositpaid” : false,
            “bookingdates” : {
                   “checkin” : “2023-07-21”,
                   “checkout” : “2023-08-10”},
            “additionalneeds” : “wi-fi” }


        */

        Map<String,Object> rezervasyonMap = new HashMap<>();
        rezervasyonMap.put("firstname", firstname);
        rezervasyonMap.put("lastname", lastname);
        rezervasyonMap.put("depositpaid", depositpaid);

        Map<String,String> innerMap= new HashMap<>();
        innerMap.put("checkin",checkin);
        innerMap.put("checkout",checkout);

        rezervasyonMap.put("bookingdates",innerMap);
        rezervasyonMap.put("additionalneeds", additinonalneeds);
        rezervasyonMap.put("totalprice", totalprice);
        return rezervasyonMap;
    }
}

