package day28_exceptions;

import java.util.Scanner;

public class C02_Exceptions {

    public static void main(String[] args) {

        // Exceptions Cesitleri
        //1)NullPointerExceptions
        //2)StringIndexOutOfBoundsException
        //3)ArrayIndexOutOfBoundsException
        //4)NumberFormatException
        //5)ClassCastException
        //6)InputMismatchException
        //7)FileNotFoundException
        //8)IOException
        //9)IllegalArgumentException
        //               java lang
        //               Object
        //               Throwable
        //  1)Errors                2)Exceptions
        //        A)UNCHECKED EXCEPTIONS                     B)CHECKED EXCEPTIONS
        //        (Kod calisinca ortaya cikanlar)             (Kod yazarken ortaya cikanlar)
        //        ArithmeticExc.                              ClassNotFoundExc.
        //        ClassCastExc.                               InterruptedExc.
        //        NullPointerExc.                             IOExc.
        //        ArrayIndexOutOfBoundsExc.                   InstantiationExc.
        //        ArrayStoreExc.                              SQLExc.

        
        // kullanicidan iki tamsayi alin
        // ilk sayiyi ikinciye bolup yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi2 != 0){
            System.out.println("Sayilarin bolumu : " + sayi1/sayi2);
        }else {
            System.out.println("ikinci sayi 0 olamaz");
        }
    }
}