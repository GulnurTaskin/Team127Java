package odevler;

import java.util.Scanner;

public class Hw_02 {
    public static void main(String[] args) {
         /*
            Kullanicidan satir sayisini alip
            asagidaki gibi *'lardan olusan bir sekil cizdirin
            *
            * *
            * * *
            * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = scanner.nextInt();
        // ucgen sekiller icin de nested for loop kullanilir
        // diktortgenden farki, sutun nosuna ihtiyacimiz yoktur
        // her satirdaki sutun sayisi o satirin nosu ile aynidir
        {
            for (int i = 1; i <= satir; i++) { // satir
                for (int j = 1; j <= i; j++) { // her satirda satir numarasi kadar sutun oldugu icin

                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
    }
}
