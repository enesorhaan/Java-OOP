import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sinir = 3;
        int yeniNot;

        do{
            try{
                System.out.print("Yeni not giriniz: ");

                yeniNot = scanner.nextInt();
                ogrenci.notEkle(yeniNot);

                count++;
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }

        }while (count < sinir);

        ogrenci.notYazdir();

    }
}