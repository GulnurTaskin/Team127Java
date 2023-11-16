package day34_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C06_ComputeMethodlari {
    public static void main(String[] args) {

        Map<String,Integer> harfler = new HashMap<>();


        harfler.put("A", 24);
        harfler.put("K", 15);
        harfler.put("Y", 28);
        harfler.put("C", 12);

        System.out.println(harfler); // {A=24, C=12, Y=28, K=15}

        // A'nin degerini 5 artirin
        int eskiKullanimMiktari = harfler.get("A");
        harfler.put("A", eskiKullanimMiktari+5);

        System.out.println(harfler); // {A=29, C=12, Y=28, K=15}

        // Eger C yoksa, degeri 40 olarak ekleyin

        if (!harfler.containsKey("C")) {
            harfler.put("C", 40); // C yoksa dedigimiz icin, eskisini silip yeni bir C degeri eklemedi listeye,
                                  // olmasaydi, degeri 40 olarak ekleyecekti..
        }
        // gorelim:
        if (!harfler.containsKey("M")){
                harfler.put("M", 40);
        }
        System.out.println(harfler); // {A=29, C=12, Y=28, K=15, M=40}
        // C'nin degeri degismedi, "M" key ve value'su eklendi eklendi

        // Eger Y varsa degerini iki katina cikarin

        if (harfler.containsKey("Y")){
            eskiKullanimMiktari = harfler.get("Y");
            harfler.put("Y",eskiKullanimMiktari*2);

        }

        System.out.println(harfler); // {A=29, C=12, Y=56, K=15, M=40}

        // A'nin degerini 10 artirin

        harfler.compute("A",(k,v)-> v+10); // compute methodu ile bunu kolayca yapariz
        // key'i yazdiktan sonra (k,v)-> ile istedigimiz islemi ekliyoruz

        // X'in degerini 10 artirin

        // harfler.compute("X", (k,v) ->v+10; // NullPointerException
        // girilen key'in var oldugundan emin degilseniz bu methodu kullanmayin

        // X varsa degerini 10 artirin

        harfler.computeIfPresent("X",(a,b)-> b+10); // k,v yerine a,b de yazabiliriz
        System.out.println(harfler); // {A=39, C=12, Y=56, K=15, M=40}

        // K varsa degerini 10 artirin

        harfler.computeIfPresent("K",(a,b)-> b+10);
        System.out.println(harfler); // {A=39, C=12, Y=56, K=25, M=40}

        // X yoksa degeri 10 olarak ekleyin

        // 1. yontem
        // harfler.putIfAbsent("X",10);

        // 2. yontem
        harfler.computeIfAbsent("X", k->10);  // {A=39, C=12, X=10, Y=56, K=25, M=40}


        System.out.println(harfler);




    }
}
