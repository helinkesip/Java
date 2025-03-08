package Odev;
import java.util.Random;

public class Soru1 {
    public static void main(String[] args) {
        //soru 1 : 100 elemanlı bir dizi oluşturun,rastgele üret,
        // dizinin ortalamasının altındaki kaç tane elemanın olduğunu hesapla

        int[] arr = new int[100];

        Random random = new Random();

        for(int i = 0; i<100 ; i++){
            arr[i] = random.nextInt(100);
        }

        int toplam =0;

        for(int i=0; i<arr.length; i++){
            toplam += arr[i];
        }

        int ort = toplam/arr.length;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < ort){
                System.out.println(arr[i]);
            }
        }
    }
}
