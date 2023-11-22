public class Araba {
    String model;
    String renk;
    int hiz;
    double yakitSeviyesi;

    Araba(String model, String renk){
        this.model = model;
        this.renk = renk;
        this.hiz = 0;
        this.yakitSeviyesi = 50.0;
    }

    public void hiziArttir(int artisMiktari){
        hiz += artisMiktari;
    }

    public void hiziAzalt(int azalisMiktari){
        hiz -= azalisMiktari;
    }

    public double yakitKontrol(){
        return yakitSeviyesi;
    }

    public double mesafeHesapla(){
        return yakitSeviyesi*10;
    }

    public void bilgiGoster(){
        System.out.println("Araba Modeli: " + model);
        System.out.println("Araba Rengi: " + renk);
        System.out.println("Araba Hizi: " + hiz);
        System.out.println("Araba Yakit Seviyesi: " + yakitSeviyesi);
    }

}
