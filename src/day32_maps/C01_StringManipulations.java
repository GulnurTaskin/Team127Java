package day32_maps;

import java.util.Arrays;

public class C01_StringManipulations {
    public static void main(String[] args) {

        // bir ogrencinin bilgileri arada - olarak String bir variable'a atanmistir
        // isim-soyisim-sinif-sube-bolum
        // bu formatta verilen bilgiden, subeyi yazdiran bir method olusturun

        String bilgi = "Gulnur-Taskin-10-A-MF";

        // ogrencinin subesini yazdiran bir method olusturun
        subeYazdir(bilgi);

        // ogrencinin isim ve soyismini yazdiran bir method olusturun
        isimSoyisimYazdir(bilgi);

        // ogrencinin bolumunu yazdiran method olusturdum,
        // bu method burda olmazsa sout icine yazdiklarimiz, terminal ekraninda gorunmuyor
        // yani method tanimlamasi olmasi lazim, main class'ta
        bolumYazdir(bilgi);




    }

    public static void  subeYazdir(String bilgi) {

        // once elimizdeki string'i, yani bilgi split ile array'e cevirmeliyiz
        String [] bilgilerArr = bilgi.split("-"); // [Ali Can, Yildiz, 10, K, Soz]


        System.out.println("Ogrenci sube: "+ bilgilerArr[3]); // Ogrenci sube: K


        System.out.println(Arrays.toString((bilgilerArr)));



    }

    public static void isimSoyisimYazdir (String bilgi){

        String [] bilgilerArr = bilgi.split("-"); // [Ali Can, Yildiz, 10, K, Soz]
        System.out.println("isim soyisim: " + bilgilerArr[0]+" "+ bilgilerArr[1]);



    }
    public static void bolumYazdir (String bilgi) {

        String [] bilgilerArr = bilgi.split("-"); // [Ali Can, Yildiz, 10, K, Soz]
        System.out.println("bolum: " + bilgilerArr[4]);


    }

}
