package Dizi;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Tek bir Scanner nesnesi kullanılmalı

        int kullaniciSecimi;

        do {
            kullaniciSecimi = menuGoster();

            if (kullaniciSecimi == 0) {
                System.out.println("Çıkış yapılıyor...");
                break;
            }

            System.out.print("Birinci sayıyı girin: ");
            int birinciSayi = input.nextInt();
            System.out.print("İkinci sayıyı girin: ");
            int ikinciSayi = input.nextInt();

            switch (kullaniciSecimi) {
                case 1:
                    ikiSayiyiCarp(birinciSayi, ikinciSayi);
                    break;
                case 2:
                    int toplam = ikiSayininToplami(birinciSayi, ikinciSayi);
                    System.out.println("İki sayının toplamı: " + toplam);
                    break;
                case 3:
                    ikiSayininKuvvetiniBul(birinciSayi, ikinciSayi);
                    break;
                case 4:
                    double ToplamDouble = ikiDoubleSayininToplaminiBul(birinciSayi,ikinciSayi);
                    System.out.println("İki sayının toplamı: "+ ToplamDouble);
                    break;
                case 5:
                    String sonuc = İsaretiBelirleme(-5);
                    System.out.println(sonuc);
                    break;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }

        } while (kullaniciSecimi != 0);

        input.close(); // Scanner'ı kapatma
    }

    private static String İsaretiBelirleme(int i) {
        if(i > 0 ){
            return "pozitif";
        }else if(i==0){
            return "Sayı sıfır";
        }else if(i< 0){
            return "Negatif";
        }else
            return "";


    }

    private static double ikiDoubleSayininToplaminiBul(double birinciSayi, double ikinciSayi) {
        return (birinciSayi+ikinciSayi);
    }

    private static void ikiSayininKuvvetiniBul(int birinciSayi, int ikinciSayi) {
        double sonuc = Math.pow(birinciSayi, ikinciSayi);
        System.out.println("Sayıların kuvveti: " + sonuc);
    }

    private static int ikiSayininToplami(int birinciSayi, int ikinciSayi) {
        return birinciSayi + ikinciSayi;
    }

    private static void ikiSayiyiCarp(int birinciSayi, int ikinciSayi) {
        System.out.println("Sayıların çarpımı: " + (birinciSayi * ikinciSayi));
    }

    public static int menuGoster() {
        System.out.println("\n************** MENU ****************");
        System.out.println("1 - İki sayının çarpımını bul");
        System.out.println("2 - İki sayının toplamını bul");
        System.out.println("3 - İki sayının kuvvetini bul");
        System.out.println("4 - İki double sayının toplamını bul");
        System.out.println("5 - Sayının işaretini belirle");
        System.out.println("0 - Çıkış yap");

        Scanner input = new Scanner(System.in);
        System.out.print("Seçiminizi girin: ");
        int secim = input.nextInt();

        return secim;
    }
}
