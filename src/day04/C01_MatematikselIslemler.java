package day04;

public class C01_MatematikselIslemler {

    public static void main(String[] args) {

        int a = 14;
        int b = 36;


        int c = a + b;  //toplama
        int d = b - a;  //çıkarma
        int e = b / a;  //bölme
        int f = a * b;  //çarpma
        int g = b % a;  //modulus:Bir sayiya bölümünden kalan
        int h = a + d - b * g - e / a;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
    }
}