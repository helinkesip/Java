package NesneyeYonelimliProgramlama;

public class OopGirisKavramlar {
    public static void main(String[] args) {

        Ogrenci[] tumOgrenciler = new Ogrenci[500];

        int sayi = 1;
        Ogrenci helin = new Ogrenci();

        int[] Sayi = new int[50];
        Sayi[0] = 1;
        int[] sayilarinHepsi = {5,6,9,7};




        helin.ogrenciBilgileriniYazdir();




        Ogrenci bos = new Ogrenci();
        bos.ogrenciBilgileriniYazdir();

        Ogrenci ayse = new Ogrenci(500,"ayse yilmaz",(byte) 5, true);
        ayse.ogrenciBilgileriniYazdir();




        System.out.println("helinin bilgilerini yazdiriilacak");
        helin.ogrenciBilgileriniYazdir();
        System.out.println("hasanın bilgilerini yazdiriilacak");


        Ogrenci ogr1 = new Ogrenci();
        Ogrenci ogr2 = new Ogrenci(5);
        Ogrenci ogr3 = new Ogrenci(5, "ogr3");
        Ogrenci ogr4 = new Ogrenci(5,"ogr4", (byte) 5, true);

        tumOgrenciler[0] = ogr1;
        tumOgrenciler[1] = ogr2;
        tumOgrenciler[2] = ogr3;
        tumOgrenciler[3] = ogr4;
        tumOgrenciler[5] = new Ogrenci(10,"yeni", (byte)12, true);

        tumOgrenciler[2].ogrenciBilgileriniYazdir();

    }
}
