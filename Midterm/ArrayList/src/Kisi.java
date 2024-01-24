public class Kisi {
    String ad;
    int yas;
    Kisi(String ad, int yas){
        this.ad = ad;
        this.yas = yas;
    }

    public String getName(){
        return ad;
    }

    public int getAge(){
        return yas;
    }

    public String yazdir(){
        return "Person{name='" + ad + "', age=" + yas + '}';
    }
}
