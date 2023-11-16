package day31_collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Set {
    public static void main(String[] args) {
        Set<String> harfler = new HashSet<>();
        System.out.println(harfler.hashCode()); // 0

        harfler.add("B"); // sadece B'yi yazdirinca 66 yazdi, sadece A yazdirinca 65 yazdi. A ve B birlikte yazdirinca 131 yazdi
        harfler.add("Ali");

        System.out.println(harfler.hashCode()); // 65984, B ve Ali birlikte yazdirinca bu sonuc cikti.
        // hash code 'un kendine has bir kodlama sekli oldugunu gosterir..

    }
}
