package Kullanici_Girisi;

import java.util.Scanner;

public class Kullanici_Girisi {
    public static void main(String[] args) {
        /**
         * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
         * eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile
         * aynı olmaması gerektiğini kontrol edip, şifreler aynı ise ekrana "Şifre oluşturulamadı,
         * lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */
        String password,correctPassword="12345";
        Scanner sc=new Scanner(System.in);
        System.out.println("Şifreniz       : ");
        password=sc.nextLine();
        if (!password.equals(correctPassword)) {
            System.out.println("Şifreniz yanlış .");
            System.out.print("Şifrenizi sıfırlamak ister misiniz [E/H]   : ");
            String cevap = sc.next();
            if (cevap.equalsIgnoreCase("E")) {
                sc=new Scanner(System.in);
                System.out.println("Yeni şifrenizi giriniz : ");
                String newPassword = sc.nextLine();
                if (newPassword.equals(correctPassword)){
                    System.out.println("Şifre oluşturulamadı,yeniden başka şifre giriniz");

                }else {
                    System.out.println("Şifre oluşturuldu");
                }
            }else System.out.println("Şifre sıfırlama işlemi iptal edildi.");



        }else System.out.println("Şifre doğru Giriş yapıldı.");

    }
}
