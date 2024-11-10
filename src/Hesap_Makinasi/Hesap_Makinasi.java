package Hesap_Makinasi;

import java.util.Scanner;

public class Hesap_Makinasi {
    public static void main(String[] args) {
        int n1,n2,select,sıfır=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz  : ");
        n1=sc.nextInt();
        System.out.print("İkinci sayiyi giriniz : ");
        n2=sc.nextInt();
        System.out.println("1-Toplama\n 2-Çıkartma \n 3-Çarpma \n 4-Bölme ");
        System.out.print("Seçiminiz :");
        select=sc.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplam :"+(n1+n2)); break;
            case 2:
                System.out.println("Fark : "+(n1-n2)); break;
            case 3:
                System.out.println("Çarpım : "+(n1*n2));break;
            case 4:
                if ((n2 != 0)) {
                    System.out.print("Bölme :" + (n1 / n2));
                } else {
                    System.out.print("Bir sayı sıfıra bölünenemez");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız tekrar deneyiniz!!");
        }

    }
}
