package day02;

import java.util.Scanner;

public class C06_Swap_DegerleriYerDegistirme {

    public static void main(String[] args) {

        // Soru:  (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1.sayiyi giriniz...");
        int sayi1  = scanner.nextInt(); // 15


        System.out.println("Lutfen 2.sayiyi giriniz...");
        int sayi2  = scanner.nextInt(); // 25


        int yedek = sayi2; //  Sayilarin yerlerini degistirebilmek icin önce boş bir variable olusturduk,
        // yedek variable'mizin icine sayi ikiyi atadık



        sayi2 = sayi1;      // sayi2'nin icine sayi1'i atamasını yaptık
        // sayi2'nin yerine sayi1'mizin degerini atadık



        sayi1 = yedek;      //son olarak yedege atadıgımız sayi2 degerimizi
        //sayi1 deklare ederek swap islemini tamamladik




        System.out.println("Sayi1'in yeni degeri : " + sayi1 ); // 25
        System.out.println("Sayi2'nin yeni degeri : " + sayi2 ); // 15



    }
}
