package Sınıf_Geçme_Durumu;

import java.util.Scanner;

public class Sinif_Gecme_Durumu {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        int gecerliNotSayisi=0,toplamNot=0;

        Scanner sc=new Scanner(System.in);
        System.out.print("Matematik notunu giriniz : ");
        mat=sc.nextInt();
        System.out.print ("Fizik notunu giriniz     : ");
        fizik=sc.nextInt();
        System.out.print("Tükçe notunu giriniz     : ");
        turkce=sc.nextInt();
        System.out.print("Kimya notunu giriniz     : ");
        kimya=sc.nextInt();
        System.out.print("Müzik notunu giriniz     :");
        muzik=sc.nextInt();

        if (mat >=0 && mat<=100){
            toplamNot+=mat;
            gecerliNotSayisi++;
        }else System.out.println("Matematik notu 0 ile 100 aralığında olmadığından ortalamaya dahil edilmemiştir.");

        if (fizik>=0&& fizik<=100){
            toplamNot+=fizik;
            gecerliNotSayisi++;
        }else System.out.println("Fizik notu 0 ile 100 aralığında olmadığından ortalamaya dahil edilmemiştir.");

        if (turkce>=0 && turkce<=100){
            toplamNot+=turkce;
            gecerliNotSayisi++;
        }else System.out.println("Turkçe notu 0 ile 100 aralığında olmadığından ortalamaya dahil edilmemiştir.");

        if (kimya>=0 && kimya<=100){
            toplamNot+=kimya;
            gecerliNotSayisi++;
        }else System.out.println("Kimya notu 0 ile 100 aralığında olmadığından ortalamaya dahil edilmemiştir.");

        if (muzik>=0&& muzik<=100){
            toplamNot+=muzik;
            gecerliNotSayisi++;
        }else System.out.println("Müzik notu 0 ile 100 aralığında olmadığından ortalamaya dahil edilmemiştir.");

        if (gecerliNotSayisi>0){
            double ortalama=(double) toplamNot/gecerliNotSayisi;
            if (ortalama>55) {
                System.out.println("Tebrikler geçtiniz");
            }else System.out.println("Malesef kaldınız");

        }else System.out.println("Geçerli not girişi yapılamadı ortalama hesaplanamadı.");


    }

}
