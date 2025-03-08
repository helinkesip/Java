package Dizi;

public class DiziElemanlariniKaristirma {
    public static void main(String[] args) {
        int sayilar[] = {1,4,6,7,84,3,46,0,21,-9};

        selectionSort(sayilar);
        System.out.println("Sıralama metodundan sonra dizi ");
        diziYazdir(sayilar);

        int sonuc = binarySearch(sayilar, 46);
        System.out.println("sonuc: " + sonuc);

    }
    public static int binarySearch(int[] dizi, int aranacakEleman) {
        int min = 0;
        int max = dizi.length - 1;

        while (max >= min) {

            int ortaIndex = (max + min) / 2;

            if (dizi[ortaIndex] == aranacakEleman)
                return ortaIndex;

            else if (dizi[ortaIndex] < aranacakEleman)
                min = ortaIndex + 1;

            else
                max = ortaIndex - 1;

        }

        return -1;
    }

    public static void diziYerDegistir(int[] dizi){
        for(int i= dizi.length - 1; i>0; i-- ){
            int rastgeleIndex = (int)(Math.random() * (i+1));

            int gecici = dizi[i];
            dizi[i] = dizi[rastgeleIndex];
            dizi[rastgeleIndex] = gecici;
        }

    }

    public static void selectionSort(int[] dizi){
        for(int i = 0; i<dizi.length - 1; i++){

            int enKucukElemaninIndex = i;


            for(int j=i+1 ; j<dizi.length ; j++){
                if(dizi[enKucukElemaninIndex] > dizi[j]){
                    enKucukElemaninIndex = j;
                }
            }

            int gecici = dizi[enKucukElemaninIndex];
            dizi[enKucukElemaninIndex] = dizi[i] ;
            dizi[i] = gecici;

        }


    }

    public static void diziYazdir(int[] dizi){
        for(int i: dizi){
            System.out.print( i + ", ");

        }
    }
}
