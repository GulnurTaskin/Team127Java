package day34_NestedMaps;

import day32_maps.MapMethodDepo;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class C03_FarkliDataTurleriIleMapOlusturma {
    public static void main(String[] args) {

        // Eger value olarak farkli data turlerinden degerler girilecekse
        // Map olustururken Map<?,Object> secilebilir

        // Eger value data turu olarak Object secilirse
        // value'lara ulasmak istedigimizde, casting yapmamiz gerekebilir


        /*{
            “firstname” : “Ahmet”,
            “lastname” : “Bulut”,
            “totalprice” : 500,
            “depositpaid” : false,
            “bookingdates” : {
                   “checkin” : “2023-07-21”,
                   “checkout” : “2023-08-10”},
            “additionalneeds” : “wi-fi” }


        */

        Map<String, Object> bookingMap =
        MapMethodDepo.rezervasyonOlustur("Ahmet", "Bulut",500 ,false,"2023-07-21","2023-08-10","wi-fi");


        System.out.println(bookingMap);
        /*
        {
        firstname=Ahmet,
        additionalneeds=wi-fi,
        bookingdates=
             {
              checkin=2023-07-21,
              checkout=2023-08-10
              },
        totalprice=500,
        depositpaid=false,
        lastname=Bulut
        }
        */
        Map<String, Object> bookingMap2 =
        MapMethodDepo.rezervasyonOlustur("Gulnur", "Taskin",300 ,true,"2023-11-21","2023-12-10",null);

        System.out.println(bookingMap2);
        /*
        {
        firstname=Gulnur,
        additionalneeds=null,
        bookingdates=
                {checkin=2023-11-21,
                checkout=2023-12-10},
        totalprice=300,
        depositpaid=true,
        lastname=Taskin
        }
         */

        // bookingMap'den firstname'i yazdirin

        System.out.println(bookingMap.get("firstname")); // Ahmet

        // depositpaid'i yazdirin

        System.out.println(bookingMap.get("depositpaid")); // false

        // checkin'i yazdirin

        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkin")); // 2023-07-21

        // checkout'u yazdirin

        System.out.println(((Map<?, ?>) bookingMap.get("bookingdates")).get("checkout")); // 2023-08-10

        // total^price'i 300 olarak update edelim

        System.out.println(bookingMap.put("totalprice", 300));  // 500, update yapti, eski degeri de bize dondurdu

        // checkin degerini 2023-10-18 olarak update edelim


        ((Map<String, String>) bookingMap.get("bookingdates")).put("checkin","2023-10-18");


        System.out.println(bookingMap);

        // {firstname=Ahmet,
        // additionalneeds=wi-fi,
        // bookingdates=
        // {checkin=2023-07-21,
        // checkout=2023-08-10},
        // totalprice=300,
        // depositpaid=false,
        // lastname=Bulut}


    }
}
