package Dizi;

public class Dizi {
    public static void main(String[] args) {
        int[] sayilar = {1, 5, 6, 8, 34};
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);

            for (int oankiSayi : sayilar) {
                System.out.println("for each eleman: " + oankiSayi);
            }

            String İsimler[] = {"helin", "magsud", "ask"};

            diziYazdir(İsimler);





        }

    }

    private static void diziYazdir(String dizi[]) {
        for(String str : dizi) {
            System.out.println(str);
        }

    }

}

