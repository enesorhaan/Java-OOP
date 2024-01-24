import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> meyveler = new ArrayList<String>();

        meyveler.add("elma");
        meyveler.add("armut");
        meyveler.add("kiraz");
        meyveler.add("muz");

        System.out.println("************************");
        System.out.println("Dizinin ilk elemani: " + meyveler.get(0));

        System.out.println("************************");
        for(String meyve : meyveler){
            System.out.println(meyve);
        }
        System.out.println("Liste boyutu: " + meyveler.size());

        System.out.println("************************");
        meyveler.remove(1);

        System.out.println("Liste boyutu: " + meyveler.size());

        for(int i = 0; i < meyveler.size(); i++){
            System.out.println("Listenin " + (i+1) + ". elemani: " + meyveler.get(i));
        }

        System.out.println("--------------------------------------");
        System.out.println("Kisiler Ex");

        ArrayList<Kisi> kisiler = new ArrayList<Kisi>();

        Kisi kisi1 = new Kisi("Enes", 24);
        Kisi kisi2 = new Kisi("Cigdem", 26);

        kisiler.add(kisi1);
        kisiler.add(kisi2);

        for(Kisi kisi : kisiler){
            System.out.println(kisi.yazdir());
        }

        System.out.println("--------------------------------------");
        System.out.println("Telefon Ex");

        Telefon telefon1 = new Telefon("General Mobile","Go",1,8,8);
        Telefon telefon2 = new Telefon("LG","K10 Lite",2,16,8);
        Telefon telefon3 = new Telefon();
        telefon1.goster();
        telefon2.goster();
        telefon3.goster();

        System.out.println("--------------------------------------");
        System.out.println("Cokgen Ex");

        Cokgen cokgen1 = new Cokgen();
        Cokgen cokgen2 = new Cokgen(3,4,5);
        Cokgen cokgen3 = new Cokgen(12,12,12,12);
        Cokgen cokgen4 = new Cokgen(8,8,6,7);

    }
}