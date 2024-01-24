package Yarisma;

import java.util.ArrayList;

public class Yarisma {

    private ArrayList<Integer> takimPuanlari;

    public Yarisma() {
        this.takimPuanlari = new ArrayList<>();
    }

    public void puanEkle(Object puan) throws HataliPuanException {
        if (!(puan instanceof Integer)) {
            throw new HataliPuanException("TypeError: " + puan + " puan olarak eklenemez.");
        }
        else{

            int intPuan = (int) puan;

            if (intPuan <= 0 || intPuan > 100) {
                throw new HataliPuanException("ValueError: " + intPuan + " not olarak eklenemez.");
            }

            this.takimPuanlari.add(intPuan);

        }


    }

    public static void main(String[] args) {
        Yarisma yarisma = new Yarisma();

        try {
//            yarisma.puanEkle(75);  // Geçerli bir puan
//            yarisma.puanEkle(110); // Hatalı bir puan
            yarisma.puanEkle(6.25);
        } catch (HataliPuanException e) {
            System.out.println(e.getMessage());
        }
    }
}
