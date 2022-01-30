package methods;

import java.util.Scanner;

public class Asal {
    public static void main(String args[]) {
        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        sayi= scanner.nextInt();
        if(asalMi(sayi))
            System.out.println(sayi + " sayısı ASALDIR !");
        else
            System.out.println(sayi + " sayısı ASAL değildir !");
    }

    static boolean asalMi(int x)
    {
        boolean asalMi = true;
        for(int i=2; i<x; i++ ){
            if( x%i == 0) {
                asalMi = false;
                break;
            }
        }
        return asalMi;
    }

}

