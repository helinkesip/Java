package Dizi;

public class MetotlaraDiziGöndermek {
    public static void main(String[] args) {

        int[] anaDizi = {1,4,7,20};
        int[] kopyaDizi = new int[anaDizi.length];
        for(int i = 0; i<kopyaDizi.length; i++){
            kopyaDizi[i] = anaDizi[i];
        }

        for(int sayi: kopyaDizi){
            System.out.println(sayi);

        }
    }
}
