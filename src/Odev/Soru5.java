package Odev;

import java.util.Random;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        String[] cevaplar = {"A", "B", "C", "D", "E"};

        System.out.print("Not girdisi yapacağınız öğrenci sayısını giriniz: ");
        int ogrenciSayi = sc.nextInt();
        System.out.println("Toplam soru sayısı nedir: ");
        int soruSayisi = sc.nextInt();

        String[] dogruCevaplar = new String[soruSayisi];
        String[][] tablo = new String[ogrenciSayi][soruSayisi];

        cevapAnahtari(dogruCevaplar,cevaplar,soruSayisi);
        ogrenciCevaplari(tablo, cevaplar, ogrenciSayi, soruSayisi);
        cevaplarKontrol(ogrenciSayi, soruSayisi,tablo, dogruCevaplar);

    }
    public static void cevapAnahtari(String[] dizi, String[] dizi2, int dongu ){
        for(int i = 0; i < dongu; i++ ){
            int rastgeleIndex = (int)(Math.random() * 5) ;
            dizi[i] = dizi2[rastgeleIndex] ;
        }
    }

    public static void ogrenciCevaplari(String[][] dizi, String[] secenekler, int ogrSayisi, int soruSayisi){
        Random rand = new Random();
        for(int i= 0;  i<ogrSayisi ; i++){
            for(int j= 1;  j < soruSayisi ; j++){
                int rastgeleIndex = rand.nextInt(5);
                dizi[i][j] = secenekler[rastgeleIndex] ;

                }
            }

    }

    public static void cevaplarKontrol(int ogrsay, int sorusay, String[][] dizi, String[] dogruCevaplar){
        for(int i= 0;  i<ogrsay ; i++){
            int dogru = 0;
            int yanlis = 0 ;
            for(int j= 1;  j < sorusay ; j++){
                if(dizi[i][j].equals(dogruCevaplar[j])){
                    dogru++;
                }else{
                    yanlis++;
                }
            }

            System.out.println("Öğrenci" + (i+1) + "\nDoğru: "+dogru+"\nYanlis: "+yanlis);



        }
    }
}
