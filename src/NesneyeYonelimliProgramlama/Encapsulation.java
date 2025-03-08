package NesneyeYonelimliProgramlama;

public class Encapsulation {
    public static void main(String[] args) {
        Televizyon tv = new Televizyon();
        tv.ac();


        tv.setSesSeviyesi(15);
        tv.setKanal(20);
        tv.kapat();

        tv.goster();


    }
}
