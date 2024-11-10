package Taksimetre_Programı;

import java.util.Scanner;

public class Taksimetre_Programı {
    public static void main(String[] args) {
//        Taksimetre Programı
//        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//
//        Taksimetre KM başına 2.20 TL tutmaktadır.
//        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//        Taksimetre açılış ücreti 10 TL'dir.

        double ucret,km,kmBasinaTutar=2.20D;
        int acilisUcreti=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi yazınız (km) : ");
        km=sc.nextDouble();
        ucret=(kmBasinaTutar*km)+acilisUcreti;
        if (ucret>20) System.out.printf("Ücretiniz : "+ucret);
        if (ucret<=20) System.out.println("Ücretiniz : "+(ucret+20));



    }
}
