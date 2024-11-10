package Patika_Ornekler;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Not_Ortalaması {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Matematik notunuz ......: ");
        int matNotu=sc.nextInt();
        System.out.print("Fizik notunuz ..........:");
        int fizikNotu=sc.nextInt();
        System.out.print("Kimya notunuz ..........:");
        int kimyaNotu=sc.nextInt();
        System.out.print("Türkçe notunuz .......:");
        int turkceNotu=sc.nextInt();
        System.out.print("Tarih notunuz ........:");
        int tarihNotu=sc.nextInt();
        System.out.print("Müzik notunuz ........:");
        int müzikNotu=sc.nextInt();

        double ort=(double)(matNotu+fizikNotu+kimyaNotu+turkceNotu+tarihNotu+müzikNotu)/6.0;
        System.out.println(ort);

        String sonuc=(ort>=60) ?"Sınıfı Geçti"  :"Sınıfta Kaldı";
        System.out.println(sonuc);

    }
}