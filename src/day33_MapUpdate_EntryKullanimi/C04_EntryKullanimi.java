package day33_MapUpdate_EntryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C04_EntryKullanimi {

    public static void main(String[] args) {

        // entrySet() methodu ile map listesi entry'e cevrilir.
        // getKey() methodu ile key'ler elde edilir.
        // getValue() methodu ile value'ler elde edilir.
        // setValue() methodu ile value'ler update edilir.
        // remove(Object key) methodu ile value'yu siler ve sildigi value'yu dondurur.
        // remove(Object key,Object value) methodu ile key-value eslesirse siler ve boolean bir sonuc dondurur
        // replace(Integer key,String value) methodu value'de hic bir kontrol yapmadan verdigimiz degeri yeni deger olarak update eder
        // replace(Integer key,String oldvalue,String newvalue) methodu ile key-value eslesirse verdigimiz degeri yeni deger olarak update eder
        // containsKey() methodu ile (verilen key'i icerir mi?) sorusuna cvp olur
        // containsValue() methodu ile (verilen value'yu icerir mi?) sorusuna cvp olur

        Map<Integer,String > ogrenciMap = MapMethodDepo.okulMapDondur();

        Set<Map.Entry<Integer,String>> entrySeti = ogrenciMap.entrySet();

        System.out.println("Entry seti : " + entrySeti);
        //  [
        //  101=Ali-Can-11-H-MF,
        //  102=Veli-Cem-10-K-TM,
        //  103=Ali-Cem-11-K-TM,
        //  104=Ayse-Can-10-H-MF,
        //  105=Sevgi-Cem-11-M-TM,
        //  106=Sevgi-Can-10-K-MF,
        //  107=Esra-Han-11-M-SOZ,
        //  108=Azim-Kan-12-L-SOZ,
        //  109=Huseyin-Fan-12-H-MF,
        //  110=Azim-Kayisi-11-K-TM
        //  ]

        for (Map.Entry eachEntry : entrySeti
        ) {

            eachEntry.setValue("hacklendi");
        }

        System.out.println(entrySeti);
        // [101=hacklendi,
        // 102=hacklendi,
        // 103=hacklendi,
        // 104=hacklendi,
        // 105=hacklendi,
        // 106=hacklendi,
        // 107=hacklendi,
        // 108=hacklendi,
        // 109=hacklendi,
        // 110=hacklendi]
    }
}