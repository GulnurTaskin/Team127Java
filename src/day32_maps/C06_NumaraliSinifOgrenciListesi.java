package day32_maps;

import java.util.Map;

public class C06_NumaraliSinifOgrenciListesi {
    public static void main(String[] args) {

        // verilen siniftaki ogrencilerin
        // numara, isim, soyisim ve subelerini, yazdiranbir method olusturun

        // mapDepo'daki ogrenci listesine ulasmak icin;
        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();
        // ogrenciMap'den her bir key'in value'sunu get ile getirtiriz
        // get(Object key)==> String donduruyor,
        // sen bana integer key soyle ben sana string value dondureyim diyor yani
        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-TM

        // key'leri bir bir ele alip o key'e ait value'yi inceleriz
        // sinif uygunsa key ve value'den istenen bolumleri yazdiririz

        // yine bir method olusturuyoruz, tabiki yine methodDepo'da
        MapMethodDepo.numaraliSinifOgrenciListesiYazdir (ogrenciMap,"11");


    }
}
