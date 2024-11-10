package Dik_ÜCgen;

import java.util.Scanner;

public class Dik_Ücgen {
    public static void main(String[] args) {
        /**
         *  Ödev
         * Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
         *
         * Formül
         * Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
         *
         * 𝑢 = (a+b+c) / 2
         *
         * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         *
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci  kenar uzunluğunu giriniz : ");
        double a=sc.nextDouble();
        System.out.print("İkinci kenar uzunluğunu giriniz : ");
        double b=sc.nextDouble();
        System.out.print("Üçüncü kenar uzunluğunu giriniz : ");
        double c= sc.nextDouble();
        double u=(a+b+c)/2.0;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı : "+alan  );
    }
}
