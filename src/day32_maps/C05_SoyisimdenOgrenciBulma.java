package day32_maps;

import java.util.Map;

public class C05_SoyisimdenOgrenciBulma {
    public static void main(String[] args) {

        // ogrenci map'inde istenen soyisimdeki ogrencilerin
        // sinif, sube, isim, soyisim bilgilerini yazdiran bir method olusturun



        // bunun icin oncelikle okul ogrenci listesine ihtiyacimiz var
        // methodDepo'dan okulMapDondur methodu ile tum okulun isim listesine ulasiyoruz
        Map<Integer, String> ogrenciMap = MapMethodDepo.okulMapDondur();
        // soyisimdenOgrenciBulma diye yeni bir method olusturuyoruz. tabiki yine methodDepo'da
        MapMethodDepo.soyisimdenOgrenciBulma (ogrenciMap,"Cem");
        // artik 'istenenSoyisim:' kismina hangi soyismi girersek o soyisimdeki ogrenciler karsimiza gelecektir


    }
}
