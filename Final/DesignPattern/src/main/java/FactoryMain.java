interface ICar{ //Arayüz tasarımı
    String getColor();
    double getPrice();
    int modelYear();
    boolean backupCamera();
    void showCarInfo();
    
}
class BMW implements ICar{
    
    //Arabada bulunan özellikleri belirledik.
    private String color;
    private double price;
    private int modelYear;
    private boolean backupCamera;
    
    public BMW(String color, double price, int modelYear, boolean backupCamera){
        this.color = color;
        this.price = price;
        this.modelYear = modelYear;
        this.backupCamera = backupCamera;
    }
    //ICar Interface'indeki metotlar override edilir :
    //Bu metotlar yardımı ile nesne özelliklerine erişilebilir.
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int modelYear() {
        return modelYear;
    }

    @Override
    public boolean backupCamera() {
        return backupCamera;
    }

    @Override
    public void showCarInfo() {
        System.out.println("Araba Markası : BMW");
        System.out.println("Araba Fiyatı : "+price);
        System.out.println("Araba Model Yılı : "+modelYear);
        
        if(backupCamera){
            System.out.println("Arka Kamera Özelliği : Var");
        }
        else{
            System.out.println("Arka Kamera Özelliği : Yok");
        }
    }

   
}
class Audi implements ICar{
    private String color;
    private double price;
    private int modelYear;
    private boolean backupCamera;
    
    public Audi(String color, double price, int modelYear, boolean backupCamera){
        this.color = color;
        this.price = price;
        this.modelYear = modelYear;
        this.backupCamera = backupCamera;
    }
    
    @Override
    public String getColor() {
        return color;
    }
    
    
    public double getPrice() {
        return price;
    }

    @Override
    public int modelYear() {
        return modelYear;
    }

    @Override
    public boolean backupCamera() {
        return backupCamera;
    }

    @Override
    public void showCarInfo() {
        System.out.println("Araba Markası : Audi");
        System.out.println("Araba Fiyatı : "+price);
        System.out.println("Araba Model Yılı : "+modelYear);
        
        if(backupCamera){
            System.out.println("Arka Kamera Özelliği : Var");
        }
        else{
            System.out.println("Arka Kamera Özelliği : Yok");
        }
    }
}

class CarFactory{ //Factory Class
    
    //Factory Method, newInstance() ile:
    public static ICar createCar(String mark, String color, double price, int modelYear, boolean backupCamera){
        
        ICar car;
        if(mark.equals("BMW")){
            car = new BMW(color, price, modelYear, backupCamera);
        }
        else if(mark.equals("Audi")){
            car = new Audi(color, price, modelYear, backupCamera);
        }
        else{
            throw new RuntimeException(mark+" markasının üretimi desteklenmemektedir.");
        }
        return car;
    }
}
public class FactoryMain{
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        
        ICar bmw = CarFactory.createCar("BMW", "Siyah", 240000, 2016, true);
        ICar audi = CarFactory.createCar("Audi", "Beyaz", 194000, 2018, false);
        
        bmw.showCarInfo();
        System.out.println("");
        audi.showCarInfo();
    }
}