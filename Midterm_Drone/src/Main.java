public class Main {
    public static void main(String[] args) {
        Araba araba = new Araba();
        Drone drone = new Drone();
        ElektrikliSupurge supurge = new ElektrikliSupurge();

        araba.hizlan();
        araba.fren();

        drone.hizlan();
        drone.fren();
        drone.otonomHareket();

        supurge.otonomHareket();

        Sofor sofor1 = new Sofor("Ahmet");
        Sofor sofor2 = new Sofor("Mehmet");

        araba.setSofor(sofor1);
        System.out.println("Arabanın soforu: " + araba.getSofor().getAd());

        // Polymorphism
        Vasita vasita1 = new Araba();
        Vasita vasita2 = new Drone();

        vasita1.hizlan();
        vasita2.hizlan();
    }
}

interface Vasita{
    void hizlan();
    void fren();
}

interface Otonom{
    void otonomHareket();
}

class Araba implements Vasita, Comparable<Araba> {
    private int hiz;
    private Sofor sofor;

    public Araba(){
        this.hiz = 0;
    }

    public void setSofor(Sofor sofor){
        if(this.sofor == null){
            this.sofor = sofor;
            System.out.println("Sofor atandi: " + sofor.getAd());
        } else if (this.sofor == sofor){
            System.out.println("Bu sofor zaten atanmis");
        }
    }
    public Sofor getSofor(){
        return sofor;
    }
    public void hizlan(){
        System.out.println("Araba hizlaniyor");
        hiz += 20;
        if (hiz > 180) {
            hiz = 180;
        }
    }
    public void fren(){
        System.out.println("Araba yavasliyor");
        hiz -= 20;
        if (hiz < 0) {
            hiz = 0;
        }
    }
    public int compareTo(Araba araba){
        return Integer.compare(this.hiz, araba.hiz);
    }
}

class Drone implements Vasita, Otonom, Comparable<Drone>{
    private int hiz;

    public Drone(){
        this.hiz = 0;
    }

    public void hizlan(){
        System.out.println("Drone Hızlanıyor");
        hiz += 5;
        if (hiz > 90) {
            hiz = 90;
        }
    }
    public void fren(){
        System.out.println("Drone yavasliyor");
        hiz -= 5;
        if (hiz < 0) {
            hiz = 0;
        }
    }
    public void otonomHareket(){
        System.out.println("Drone otonom uçabiliyor");
    }
    public int compareTo(Drone drone){
        return Integer.compare(this.hiz, drone.hiz);
    }
}

class ElektrikliSupurge implements Otonom{
    public void otonomHareket(){
        System.out.println("Kendi süpürebiliyor");
    }
}

class Sofor{
    private String ad;

    public Sofor(String ad){
        this.ad = ad;
    }

    public String getAd(){
        return ad;
    }
}