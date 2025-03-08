package NesneyeYonelimliProgramlama;

public class Televizyon {

    private int kanal;
    private int sesSeviyesi;
    private boolean acik;

    public void ac(){
        if(acik==false) {
            System.out.println("televizyon acılıyor");
            acik = true;
        }else{
            System.out.println("televizyon zaten açık");

        }
    }

    public void kapat(){
        if(acik){
        System.out.println("televizyon kapanıyor \n");
        acik = false;}
        else{
            System.out.println("televizyon zaten kapalı \n");

        }
    }

    public void setKanal(int yeniKanal){
        if(acik && yeniKanal > 0  && yeniKanal <500){
            kanal = yeniKanal;
        }else{
            System.out.println("tv kapalı veya yanlış bir kanal değeri yazdınız \n");
        }
    }

    public int getKanal(){
        return kanal;
    }

    public int getSesSeviyesi() {
        return sesSeviyesi;
    }

    public void setSesSeviyesi(int sesSeviyesi){
        if (acik && sesSeviyesi > 0 && sesSeviyesi < 20) {
            this.sesSeviyesi = sesSeviyesi;
        }

    }

    public void goster(){
        System.out.println("televizyon acık: " + acik + "kanal no: " + kanal+ "ses seviyesi: " + sesSeviyesi);
    }


}
