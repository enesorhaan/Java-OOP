public class TestSingleton {
    //Singleton sg1 = new Singleton();
    //Singleton sg1 = Singleton.getInstance();
    
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            Singleton s = Singleton.getInstance();
            s.printName();
        }
    }
} 