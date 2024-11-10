package Vucut_Kitle_Endeksi;

import java.util.Scanner;

public class Vucut_Kitle_Endeksi {
    public static void main(String[] args) {
        /**
         * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
         *
         * Formül
         * Kilo (kg) / Boy(m) * Boy(m)
         *
         */
        System.out.print("Lütfen boyunuzu giriniz :" );
        float boy=new Scanner(System.in).nextFloat();
        System.out.print("Lütfen kilo değerinizi giriniz :");
        float kilo=new Scanner(System.in).nextFloat();
        float vkendeksi=kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz : "+vkendeksi);
    }
}
