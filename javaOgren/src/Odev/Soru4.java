package Odev;

//verilen iki sayının en küçük ortak katını bulan uygulama
// ekok(s1,s2) * ebob(s1,s2) = (s1*s2)


import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi1 = sc.nextInt();
        System.out.println("Diğer sayıyı giriniz: ");
        int sayi2 = sc.nextInt();

        int büyükSayi = Math.max(sayi1, sayi2);
        int kücükSayi = Math.min(sayi1, sayi2);

        int ebob = 0;
        for(int i = 1; i < kücükSayi; i++){
            if( kücükSayi % i == 0 && büyükSayi  % i == 0 ){
                ebob = i;
            }
        }
        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("ekok: " + ekok);


    }
}
