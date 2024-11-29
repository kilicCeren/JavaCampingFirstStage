package day02;

import java.util.Scanner;

public class C04_KullanicidanAlinanDegerleriYazdirma {
    public static void main(String[] args) {

        //Soru: Kullanicidan  isimini,soyismini ve yasini alip
        //      asagidaki formatta yazdiriniz

        //      girilen bilgiler : J Doe  44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        // String girilenIsim1 = scanner.next(); // bu ilk space'e kadar olan kismi alir
        String girilenIsim = scanner.nextLine(); // butun satiri alir


        System.out.println("Lutfen soyisminizi giriniz...");
        String girilenSoyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scanner.nextInt();

        System.out.println(
                "girilen bilgiler : " +girilenIsim.charAt(0) +
                        " " + girilenSoyisim + ", " + yas +
                        "\n Kaydiniz basarili sekilde olusturuldu..."
        );

    }
}
