package day35_Maps_GenelTekrar;

import java.util.Scanner;

public class C02_GenelTekrar_forLoop {

    public static void main(String[] args) {


        /*
       Yıldızlar (*) ile baklava deseni oluşturabileceğiniz bir kod yazınız.
       Sonuç böyle olmalıdır;

              *
             * *
            * * *
           * * * *
          * * * * *
           * * * *
            * * *
             * *
              *


         şeklini konsola yazdiriniz.
         */



        // burayi kullanicidan gelen sayiya gore de olusturabiliriz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baklava dilimi deseni icin istediginiz genisligi yaziniz");

        String sayi = scan.nextLine(); // kullanicidan alacagimiz degeri String 'sayi' olarak aliyoruz
        int enGenisSatir =  Integer.valueOf(sayi); // bu string degeri integer'a ceviriyoruz

        // once baklava diliminin ust kismindaki ucgen icin for loop olusturuyoruz
        for (int i = 1; i <=enGenisSatir ; i++) { // i degeri 1'den baslayip enGenisSatir degerine kadar 1 artarak gidecek

            for (int j =1 ; j <= enGenisSatir-i ; j++) { // bastaki bosluklar icin
                System.out.print(" "); // burda print diyoruz yan yana yazmasi icin
                // enGenisSatir-i yani mesala 7-1= 6 tane bosluk olacak
            }

            for (int j = 1; j <=i ; j++) { // yildizlar icin
                System.out.print("* "); // burda da print
                // bosluklardan sonra da i sayisi kadar yildiz olacak
            }
            System.out.println(""); // burda println hiclik yapiyoruz, bir alt satira gecmesi icin
        } // en genis satira kadar olan kisim


        // simdi az once yaptigimiz ucgenin tam tersini yapmamiz lazim
        for (int i = enGenisSatir-1; i >=1 ; i--) { // enGenisSatir -1'den baslayacak azalarak asagi inecek
            for (int j = 1; j <=enGenisSatir-i ; j++) { // bosluklar icin
                System.out.print(" "); // yan yana yazmasi icin print diyoruz
            }

            for (int j = 1; j <=i ; j++) { // bu da ayni sekilde yildizlar icin
                System.out.print("* "); // bu da print
            }

            System.out.println(""); // yukardaki loop her satirda bittikten sonra alt satira inmesi icin println yapiyoruz
            // ve desenimiz istedigimiz sekilde ortaya cikiyor
            // enGenisSatir 6 icin baklava dilimi :
            // 6
            //      *
            //     * *
            //    * * *
            //   * * * *
            //  * * * * *
            // * * * * * *
            //  * * * * *
            //   * * * *
            //    * * *
            //     * *
            //      *
        }
    }
}