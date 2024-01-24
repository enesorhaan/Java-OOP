interface ICar{ //Soyut sınıf tasarımı
    String getColor();
    double getPrice();
    
}
class AudiCar implements ICar{
    private String color;
    private double price;

    public AudiCar(String color, double price) {
        this.color = color;
        this.price = price;
    }
    
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
class BMWCar implements ICar{

    private String color;
    private double price;

    public BMWCar(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }
    
}
interface IMotorCycle{
    String getType();
    double getPrice();
}

class AudiMotorcycle implements IMotorCycle{

    private String type;
    private double price;

    public AudiMotorcycle(String type, double price) {
        this.type = type;
        this.price = price;
    }
    
    
    @Override
    public String getType() {
       return type;
    }

    @Override
    public double getPrice() {
        return price;
    }
    
}
class BMWMotorcycle implements IMotorCycle{
    
    private String type;
    private double price;

    public BMWMotorcycle(String type, double price) {
        this.type = type;
        this.price = price;
    }
    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

interface IAbstractFactory{
    ICar createCar(String color, double price);
    IMotorCycle createMotorCycle(String type, double price);
}
class AudiFactory implements IAbstractFactory{
    
    @Override
    public ICar createCar(String color, double price) {
        return new AudiCar(color, price);
    }

    @Override
    public IMotorCycle createMotorCycle(String type, double price) {
        return new AudiMotorcycle(type, price);
    }
}
class BMWFactory implements IAbstractFactory{
    
    @Override
    public ICar createCar(String color, double price) {
        return new BMWCar(color, price);
    }

    @Override
    public IMotorCycle createMotorCycle(String type, double price) {
        return new AudiMotorcycle(type, price);
    }
}

public class AbstractFactoryMain{
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        
        IAbstractFactory audiFactory = new AudiFactory();
        IAbstractFactory bmwFactory = new BMWFactory();
        
        
        ICar audiCar = audiFactory.createCar("Beyaz", 500000);
        ICar bmwCar  = bmwFactory.createCar("Siyah", 420000);
        
        IMotorCycle audiMotorCycle = audiFactory.createMotorCycle("Yarış Motoru", 125000);
        IMotorCycle bmwMotorCycle = bmwFactory.createMotorCycle("Cadde Motoru", 24000);
       
    }
}