package day31_collections;


import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C06_HashSet_TreeSet_karsilastirma {

    public static void main(String[] args) {

        // Bir HashSet ve TreeSet olusturun.
        // Bir loop ile bu set’lere element ekleyip sureleri karsilastirin.

        Set <Integer> hashSet = new HashSet<>();
        Set <Integer> treeSet = new TreeSet<>();

        Random rnd = new Random();

        long hashSetBas = LocalTime.now().toNanoOfDay(); // hashSet'i burdan itibaren olusturuyoruz

        for (int i = 0; i<1000000 ; i++) {

            hashSet.add(rnd.nextInt(1000));
        }
        long hashSetBit = LocalTime.now().toNanoOfDay();

        System.out.println("Hash set islem suresi: " + (hashSetBit-hashSetBas));



        long treeSetBas = LocalTime.now().toNanoOfDay(); // burasi da hashSet

        for (int i = 0; i<1000000 ; i++){
            treeSet.add(rnd.nextInt(1000));
        }
        long treeSetBit = LocalTime.now().toNanoOfDay();

        System.out.println("Tree set islem suresi: " + (treeSetBit-treeSetBas));
        // sayi miktari az oldugu zaman tree set daha hizli iken, sayi miktari yukselince hashSet daha hizli calisti.
        // bunun sebebi, hashSet'in duzen prensibinin adrese dayali olmasidir.
        // yani basta bir adres duzeni olusturduktan sonra islemleri daha hizli bir sekilde devam ettirir.

    }
}
