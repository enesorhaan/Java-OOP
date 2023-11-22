public class Ogrenci {
    public Ogrenci(){
        System.out.println("Ogrenci sinifindan nesne olusturmak icin yapici metodu cagirildi");
    }
    public Ogrenci(String ad){
        System.out.println("Ogrenci sinifindan nesne olusturmak icin yapici metodu cagirildi");
    }
}

class DoktoraOgrenci extends Ogrenci{
    public DoktoraOgrenci() {

    }
    public DoktoraOgrenci(String ad) {
        super(ad);
    }
}

class OgrenciTest{
    public static void main(String[] args) {
        DoktoraOgrenci obj = new DoktoraOgrenci("Enes");
        DoktoraOgrenci obj1 = new DoktoraOgrenci();
    }
}

