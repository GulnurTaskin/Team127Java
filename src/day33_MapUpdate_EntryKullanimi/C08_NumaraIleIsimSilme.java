package day33_MapUpdate_EntryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C08_NumaraIleIsimSilme {
    public static void main(String[] args) {

        // verilen numaradaki ogrenciyi
        // map'den silme

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();
        ogrenciMap.remove(101); // 101 numarali ismi listeden sildi
        // silindigini gormemiz icin tum listeyi yazdiran methodu kullanabiliriz
        // System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.remove(102)); // Veli-Cem-10-K-TM dondurdu.
        // bu demek oluyorki, 102 numarada veli cem isimli ogrenci var, bu isimli ogrenci listeden silindi

        System.out.println(ogrenciMap.remove(103, "Ali-Cem-11-K-TM")); // true.
        // bu demek oluyorki istenen key ve value ikilisiyle eslesen isim listeden bulundu ve silindi

        System.out.println(ogrenciMap.remove(104, "Ali-Cem-11-K-TM")); // false
        // bu demek oluyorki istenen key ve value ikilisiyle eslesen isim listede bulunamadi ve bu yuzden silinemedi
        // islem gerceklesmedigi icin false donduruyor

        ogrenciMap.replace(104,"Ali-Cem-11-K-TM");
        // hicbir kontrol yapmadan verdigimiz deger olarak update eder

        ogrenciMap.replace(104, "Ali-Cem-11-K-TM","Ali-Yan-10-S-TM"); // true
        // key ve oldValue eslesirse, oldValue silinir, yerine newValue kaydedilir. true dondurur
        // eger eslesmezse, degisiklik yapilmaz. istenen degisiklik yapilamadigi icin false dondurur

        System.out.println(ogrenciMap.containsKey(103)); //103 numarali key daha once listeden silindigi icin,
        // containsKey methodu ile cagirirsak artik 103 numara olmadigi icin false dondurur
        System.out.println(ogrenciMap.containsKey(107)); // true

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // value'nin icindeki degerlere degil
        // bir butun olarak value'ye bakar
        // ogrenciMap'de value'su "Ali" olan bir value olmadigi icin false dondurur

        System.out.println(ogrenciMap);

    }
}
