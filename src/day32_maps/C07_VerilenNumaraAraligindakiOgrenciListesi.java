package day32_maps;

import java.util.Map;

public class C07_VerilenNumaraAraligindakiOgrenciListesi {
    public static void main(String[] args) {

        // ogrenci map'inde verilen baslangic ve bitis numaralari (dahil) arasindaki
        // ogrencilerin numara, isim, soyisim'lerini yazdiran bir method olusturun

        // mapDepodaki okul listesine ulasmak icin okulMapDondur methodu'nu call yapiyoruz
        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        // sonra yine bir method olusturuyoruz, mapDepo'da
        MapMethodDepo.numaraAraligindakiOgrenciListesi (ogrenciMap,103,111);

    }
}
