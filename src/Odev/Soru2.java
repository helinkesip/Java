package Odev;
import java.util.Random;

//her bir elemanı rastgele oluşturulmuş 3*2 lik martiste bulunaan sayıların toplamını yazdıran programı yazın
//matriste yer alan en kücük ve en büyük sayıları da versin

public class Soru2 {
    public static void main(String[] args) {
        int[][] matris = new int[3][2];
        int enKucukSayi = Integer.MAX_VALUE;
        int enBuyukSayi = Integer.MIN_VALUE;
        int toplam = 0;
        Random random = new Random();

        for(int i= 0; i<3; i++){
            for(int j= 0; j<2; j++){
                matris[i][j] = random.nextInt(100);
            }
        }


        for(int i= 0; i<3; i++){
            for(int j= 0; j<2; j++){
                if(matris[i][j] < enKucukSayi){
                    enKucukSayi = matris[i][j];
                }
                if(matris[i][j] > enBuyukSayi){
                    enBuyukSayi = matris[i][j];
                }
                    toplam += matris[i][j];
            }
        }
        System.out.println("matristeki sayıların toplamı: "+ toplam);
        System.out.println("matristeki en kücük sayı: " + enKucukSayi);
        System.out.println("matristeki en büyük sayı: " + enBuyukSayi);


    }
}
