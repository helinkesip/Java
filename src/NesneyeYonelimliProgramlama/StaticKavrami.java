package NesneyeYonelimliProgramlama;

public class StaticKavrami {

    public static void main(String[] args){

        Memur m1 = new Memur();
        m1.setIsim("Helin");
        m1.setMaas(40000000);

        Memur m2 = new Memur();
        m2.setIsim("Magsud");
        m2.setMaas(1000000000);

        Memur m3 = new Memur();
        m3.setIsim("ayşe");
        m3.setMaas(200);

        m3.bilgileriGoster();
        Memur.kanunuSoyle();
        m1.kanunuSoyle();
        m2.kanunuSoyle();
        m3.kanunuSoyle();


        System.out.println("Nesne sayısı: " + Memur.olusturulanMemurNesnesi);

        System.out.println("Nesne sayısı m1: " + m1.olusturulanMemurNesnesi);
        System.out.println("Nesne sayısı m1: " + m2.olusturulanMemurNesnesi);
        System.out.println("Nesne sayısı m1: " + m3.olusturulanMemurNesnesi);



    }
}

class Memur{

    private String isim;
    private int maas;
    public static int olusturulanMemurNesnesi = 0; //herhangi bir neseneye bağımlı değil de tüm nesneler ona bağımlı

    public Memur(){
        olusturulanMemurNesnesi++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim){
        this.isim = isim;
    }

    public void setMaas(int maas){
        if(maas<0){
            this.maas = 0;
        }else{
            this.maas = maas;
        }
    }

    public static void kanunuSoyle(){
        System.out.println("657 nolu kanun geçerli");
    }


    public int getMaas(){
        return maas;
    }

    public void bilgileriGoster(){
        kanunuSoyle();
        System.out.println("oluşturulan memur nesnesi: "+ olusturulanMemurNesnesi);
    }


}