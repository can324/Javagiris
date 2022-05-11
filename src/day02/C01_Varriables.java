package dy02;

import java.util.Scanner;

public class C01_Varriables {

    public static void main(String[] args) {

        Scanner dene=new Scanner(System.in);



        //2- Verilen sayi1 ve sayi2 variable’larinin degerlerini kova olmadan degistiren (SWAP) bir program yaziniz
        //Orn  : sayi1=10 ve sayi2=20;
        //kod calistiktan sonra

        int sayi1=10;
        int sayi2=20;

        sayi1= sayi1+sayi2;
        sayi2=sayi1-sayi2;

        System.out.println( sayi1 + " "  + sayi2 );

    }
}
