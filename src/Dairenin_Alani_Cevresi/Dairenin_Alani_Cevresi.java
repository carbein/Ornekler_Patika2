package Dairenin_Alani_Cevresi;

import java.util.Scanner;

public class Dairenin_Alani_Cevresi {
    public static void main(String[] args) {
//        Dairenin Alanını ve Çevresini Hesaplayan Program
//        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
//
//                Alan Formülü : π * r * r;
//
//        Çevre Formülü : 2 * π * r;
//
//        Ödev
//        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//
//        𝜋 sayısını = 3.14 alınız.
//
//                Formül : (𝜋 * (r*r) * 𝛼) / 360

        Scanner Scanner=new Scanner(System.in);
        double pi=3.14D;
        System.out.print("Dairenin yarıçapını giriniz : ");
        double yaricap= Scanner.nextDouble();
        System.out.print("a ölçüsünü giriniz : ");
        double a=Scanner.nextDouble();
        double cevre=2*pi*yaricap;
        double dilimalan=(pi*(yaricap*yaricap)*a)/360;
        System.out.println("Dairenin çevresi : "+cevre);
        System.out.println("Açı ölçüsü verilen daire diliminin alanı : "+dilimalan);

    }
}
