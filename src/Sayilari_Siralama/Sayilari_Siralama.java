package Sayilari_Siralama;

import java.util.Scanner;

public class Sayilari_Siralama {
    public static void main(String[] args) {
        int s1,s2,s3;           // 25 35 10     25  10  35
        Scanner sc=new Scanner(System.in);
        System.out.print(" 1. sayiyi giriniz :");
        s1=sc.nextInt();
        System.out.print("2.sayiyi giriniz :");
        s2=sc.nextInt();
        System.out.print("3.sayiyi giriniz :");
        s3=sc.nextInt();
        int enk=s1;
        int enb=s1;
        int ort=s1;
        if (enb<s2)enb=s2;
        if (enb<s3)enb=s3;
        if (enk>s2)enk=s2;
        if (enk>s3)enk =s3;
        if ((s2<ort && s2>s3) || s2<s3 && s2>ort){
            ort=s2;
        } else if ((ort<s2 && ort>s3) ||(s2<ort && s3>ort)) {
            ort=s1;
        }else ort=s3;

        System.out.println(enk+" < "+ort+" < "+enb);

    }
}
