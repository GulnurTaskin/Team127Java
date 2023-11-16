package day33_MapUpdate_EntryKullanimi;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;




public class C09_FarkliDataTurleriIleMapOlusturma {
    public static void main(String[] args) {



              /*

                            {
                              id: 101,
                              title: 'foo',
                              body: 'bar',
                              userId: 1,
                              isActive: true
                              initial: A,
                            }
              */

        Map<String, Object> ornekMap = new HashMap<>();
        // value'yu Object olarak secersek farkli data turlerindeki value'lerden olusan listeden map olusturabiliriz
        // bunun dezavantaji==> farkli data turlerine ait elemanlar uzerinde islem yapabilmek icin casting yapmamiz gerekir
        // cating yapacagimiz data turunu gerekli oldugu yerlerde parantez icnde belirtiriz
        // boylelikle sorun cozulur
        ornekMap.put("id", 101);
        ornekMap.put("title","foo");
        ornekMap.put("body","bar");
        ornekMap.put("userId",1);
        ornekMap.put("isActive", true);
        ornekMap.put("initial",'A');

        System.out.println(ornekMap); // {initial=A, id=101, title=foo, body=bar, isActive=true, userId=1}

        //body key'inin value'sini buyuk harf olarak yazdirin
        System.out.println(((String) ornekMap.get("body")).toUpperCase()); // BAR.
        // burda ornekMap'in basina String ekliyoruz, yoksa altini kirmizi ciziyor
        // cunku value'ler Object class'ta. object class'da her tur deger olaabilir
        // biz string bir deger uzerinde degisiklik yapacagimiz icin parantez icinde string oldugunu belirtmemiz gerekiyor

        // id'yi 1 artir
        Integer idDeger = (Integer) ornekMap.get("id"); // 101
        // burda da yukardaki gibi object class'ta olan value'de degisiklik yapmak istiyoruz
        // ve java buna izin vermiyor, altini kirmizi ciziyor
        // o yuzden parantez icinde Integer yaziyoruz ki integer clas'taki deger uzerinde degisiklik yapabilelim

        // id key'ine ait value'yi 1 artir diyoruz ve atama yapiyoruz
        ornekMap.put("id",idDeger+1);

        System.out.println(ornekMap); // {initial=A, id=102, title=foo, body=bar, isActive=true, userId=1}

        // initial key'ine ait value bir buyuk harf mi?
        System.out.println(Character.isUpperCase((char) ornekMap.get("initial"))); // true
        // yine value object class'ta, o yuzden islem yapacagimiz elemanin oldugu char class'ini parantez icinde ekliyoruz
    }
}