package day32_maps;

import java.util.ArrayList;
import java.util.List;

public class C02_StringManipulations {

    public static void main(String[] args) {

        // ogrenci bilgilerini belirli formatta tutan String'lerden olusan bir listemiz var

        // Bu listeden isim verdigimizde,
        // o isme sahip olanlarin isim ve soyisimlerini yazdiran bir method olusturun

        List<String> ogrenciList = new ArrayList<>();
        ogrenciList.add("Beytullah-Yildiz-10-K-Soz");
        ogrenciList.add("Esra-Yilmaz-11-L-Soz");
        ogrenciList.add("Ercan-Yil-10-M-MF");
        ogrenciList.add("Beytullah-Han-12-K-MF");
        ogrenciList.add("Gulnur-Taskin-10-A-MF");


        isimSoyisimYazdir(ogrenciList,"beytullah");

        // sube'si verilen ogrencilerin isim ve soyisimlerini
        // yazdiran bir method olusturun

        subeListesiYazdir(ogrenciList,"a"); // buraya hangi sube adini yazarsak
        // o subedeki ogrenci listesi gelir

    }


    public static void subeListesiYazdir(List<String> ogrenciList, String istenenSube){


        String[] bilgilerArr; // oncelikle string'lerden olusan bos bir array tanimliyoruz



        for (String each :ogrenciList // bu array'in icine ogrencilist'in her bir elemana for each ile ulasiyoruz
        ) {   // split kullanarak ogrenciList'in elemanlarini array'e ceviriyoruz, bilgilerArr olusmus oldu
            bilgilerArr = each.split("-"); // [Beytullah, Yildiz, 10, K, Soz]

            // eger diyoruz, bilgilerArr'in 3. index'i aradigimiz sube adina esitse,
            // ayni array icindeki 0. ve 1. indexleri yazdir diyoruz

            if (bilgilerArr[3].equalsIgnoreCase(istenenSube)){ //kucuk buyuk harf girilebilsin diye ignorecase kullaniyoruz
                System.out.println(bilgilerArr[0] + " " + bilgilerArr[1]);
            }
        }

    }




    public static void isimSoyisimYazdir(List<String> ogrenciList, String istenenIsim){

        String ogrenciBilgi; // oncelikle string'lerden olusan bir variable tanimliyoruz

        // for loop ile ogrenciList'in her bir elemanini ele aliyoruz
        for (int i = 0; i < ogrenciList.size() ; i++) {

            // ogrenciBilgi variable'ina, i'nin getirdigi her elemani ekliyoruz
            ogrenciBilgi = ogrenciList.get(i); // "Beytullah-Yildiz-10-K-Soz"

            //split ile string'i array'e ceviriyoruz. yeni array'in ismi strinler'den olusan bilgiler array'i
            String[] bilgiler = ogrenciBilgi.split("-"); // [Beytullah, Yildiz, 10, K, Soz]

            // eger diyoruz, bilgiler array'inin 0. indexi, istenen isme esitse,
            // bilgiler array'inin 0. ve 1. elemanlarini yazdirmasini istiyoruz
            if (bilgiler[0].equalsIgnoreCase(istenenIsim)){
                System.out.println("Isim soyisim : " + bilgiler[0] + " " + bilgiler[1]);
            }
        }
    }
}