package day32_maps;

import java.util.Map;

public class C04_BolumListesi {
    public static void main(String[] args) {

        // verilen bir ogrenci map'inde
        // istenen bolumdeki ogrencilerin sinif, sube, isim, soyisimlerini yazdiran
        // bir method olusturun

        Map<Integer, String> ogrenciMap = MapMethodDepo.okulMapDondur();
        // method depo icinde yeni bir method olusturuyoruz, yani yeni bir formul.
        // her istiyacimiz oldugunda kullanmak uzere okul listesini  okulMapDondur seklinde formuluze ediyoruz
        // yazdiralim..
        System.out.println(ogrenciMap); // bu bizim okulumuuzn ogrenci listesi
        // istedigimiz zaman ekleme cikarma, uzerinde degisiklikler yapma imkanimiz var

        //{101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF,
        // 107=Esra-Han-11-M-SOZ,
        // 108=Azim-Kan-12-L-SOZ,
        // 109=Huseyin-Fan-12-H-MF,
        // 110=Azim-Kayisi-11-K-TM}

        MapMethodDepo.bolumListesiYazdir(ogrenciMap,"mf");
        // listemizi ogrenciMap olarak yukarida formuluze ettik
        // ikinci adim olarak bolumListesiYazdir seklinde yeni bir method olusturduk
        // bu method da yine methodDepo'da yerini aldi, yani method'un ayrintilari depoda
        // 'istenenBolum:' kismina hangi bolumu yazarsak o bolumdeki ogrenci listesi karsimiza geliyor. miss..
    }
}
