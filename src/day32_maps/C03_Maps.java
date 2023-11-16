package day32_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_Maps {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        System.out.println(ogrenciMap);

        // {
        //    101=Ali-Can-11-H-MF,
        //    102=Veli-Cem-10-K-TM,
        //    103=Ali-Cem-11-K-TM,
        //    104=Ayse-Can-10-H-MF,
        //    105=Sevgi-Cem-11-M-TM,
        //    106=Sevgi-Can-10-K-MF
        //                          }

        // ogrenciMap'in eleman sayisini hesaplamak icin size kullaniyoruz
        System.out.println(ogrenciMap.size()); // 6

        // ogrenci numaralarindan olusan, yani map icindeki key'lerden olusan listeyi,
        // .keySet ile yazdiriyoruz
        System.out.println(ogrenciMap.keySet());

        // ogrenci isim, soy,isim, sinif, sube, bolum bilgisi icin, ogrenciMap'den value'leri yazdiriyoruz
        System.out.println(ogrenciMap.values());

        // verilen sube'deki ogrencilerin isim ve soyisimlerini yazdiran bir method olusturun
        // bu methodu MapMethodDepo class'inda olusturuyoruz.
        // bu class'da methodu yazinca method call yapmis oluyoruz
        // MapMethodDepodaki method formulu nasilsa o sekilde calisyor

        MapMethodDepo.subeListesiyazdir(ogrenciMap,"k");
        // yani bu methodun arkaplanindaki ayrintili formuller burda yer kaplamamis oluyor
        // buyuk projelerde methodlarin ayri bir class'ta depolanmasi,
        // calisilan class'daki kod'larin daha iyi anlasilmasini sagliyor
        // burada subeListesiYazdir methodunu cagirdigimizda asagidaki sekilde istenen liste onumuze cikiyor

        /*

        ========k subesi ogrenci Listesi======
        Veli Cem
        Ali Cem
        Sevgi Can

        */
    }
}