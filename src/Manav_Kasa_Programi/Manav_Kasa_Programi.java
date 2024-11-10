package Manav_Kasa_Programi;

import java.util.Scanner;

public class Manav_Kasa_Programi {
    public static void main(String[] args) {
        /**
         * Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
         *
         * Meyveler ve KG Fiyatları
         *
         * Armut : 2,14 TL
         * Elma : 3,67 TL
         * Domates : 1,11 TL
         * Muz: 0,95 TL
         * Patlıcan : 5,00 Tl
         */
        float armut=2.14f,elma=3.67f,domates=1.11f,muz=0.95f;
        float patlican = 5.00f,toplamTutar;
        System.out.print("Armut kaç kilo    : ");
        float armKilo=new Scanner(System.in).nextFloat();
        System.out.print("Elma kaç kilo     : ");
        float elmKilo=new Scanner(System.in).nextFloat();
        System.out.print("Domates kaç kilo  : ");
        float dmtKilo=new Scanner(System.in).nextFloat();
        System.out.print("Muz kaç kilo      : ");
        float muzKilo=new Scanner(System.in).nextFloat();
        System.out.print("Patlican kaç kilo : ");
        float ptlKilo=new Scanner(System.in).nextFloat();

        toplamTutar=(armut*armKilo)+(elma*elmKilo)+(domates*dmtKilo)+(muz*muzKilo)+(patlican*ptlKilo);
        System.out.println("Toplam Tutar : "+toplamTutar+" TL");

    }
}
