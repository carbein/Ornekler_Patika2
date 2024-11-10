package Patika_Ornekler;

import java.util.Scanner;

public class KDV_Tutari_Ornek {
    public static void main(String[] args) {
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        Scanner sc=new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz . . . :");
        double tutar=sc.nextDouble();
        if (tutar>0 && tutar<1000 ){
            double sonfiyat=tutar+(tutar*0.18);
            System.out.println("KDV li tutar : " +sonfiyat);
        }
        if (tutar>=1000){
            double sonfiyat2=tutar+(tutar*0.08);
            System.out.println("KDV li tutar :"+sonfiyat2);
        }
    }


}
