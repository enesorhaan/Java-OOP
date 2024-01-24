public class Surucu {
    String ad;
    String soyad;
    Araba araba;

    public Surucu(String ad, String soyad, Araba araba){
        this.ad = ad;
        this.soyad = soyad;
        this.araba = araba;
    }

    public void arabaSur(int hiz){
        araba.hiziArttir(hiz);
    }

    public void yavasla(int hiz){
        araba.hiziAzalt(hiz);
    }

    public void bilgiGoster(){
        System.out.println("Surucu: " + ad + " " + soyad);
        araba.bilgiGoster();
    }
}
