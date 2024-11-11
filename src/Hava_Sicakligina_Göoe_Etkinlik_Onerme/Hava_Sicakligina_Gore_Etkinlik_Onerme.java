package Hava_Sicakligina_Göoe_Etkinlik_Onerme;

import java.util.Scanner;

public class Hava_Sicakligina_Gore_Etkinlik_Onerme {
    public static void main(String[] args) {
        int sicaklik ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz :");
        sicaklik=sc.nextInt();
        if (sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik >=5 && sicaklik<=15) {
            System.out.println("Sinemaya gidebilirsiniz");
        }else if (sicaklik>=15&&sicaklik<25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
