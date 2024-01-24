import java.util.ArrayList;

public class Ogrenci {
    private ArrayList<Integer> notlar = new ArrayList<Integer>();

    public void notEkle(int not) throws kucukDegerHatasi, buyukDegerHatasi{
        if(not < 0)
            throw new kucukDegerHatasi(not);
        else if(not > 100)
            throw new buyukDegerHatasi(not);
        else
            notlar.add(not);
    }
    public void notYazdir(){
        for(int not : notlar){
            System.out.println(not);
        }
    }
}
