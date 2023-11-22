public class Main {
    public static void main(String[] args) {
        Araba araba1 = new Araba("Volvo", "kirmizi");
        Araba araba2 = new Araba("Mercedes", "mavi");

        Surucu surucu1 = new Surucu("Enes", "Orhan", araba1);
        Surucu surucu2 = new Surucu("Cigdem", "Oztutan", araba2);

        surucu1.arabaSur(120);
        surucu1.bilgiGoster();

        surucu2.arabaSur(90);
        surucu2.bilgiGoster();

        surucu2.yavasla(60);
        surucu2.bilgiGoster();
    }
}