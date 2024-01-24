public class Singleton {
    private static Singleton instance;
    //private static Singleton instance = new Singleton();
    private static int count;
    private String name;
 
    private Singleton() {
        count++;
        name = "Singleton" + count;
    }
    
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
     public void printName() {
        System.out.println(name);
    }
}