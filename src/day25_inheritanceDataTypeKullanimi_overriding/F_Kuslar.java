package day25_inheritanceDataTypeKullanimi_overriding;

public class F_Kuslar extends E_Hayvanlar {
    protected void kanat(){

        System.out.println("kanatlidirlar");
    }

    protected void solunum(){

        System.out.println("akcigerle nefes alirlar");
    }

    protected void gaga(){

        System.out.println("gagalari vardir");
    }

    protected void cogalma(){

        System.out.println("yumurtayla cogalirlar");
    }
}