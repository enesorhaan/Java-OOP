public class Demo {

    Demo(){
        this(5);
        System.out.println("Default const");
    }
    Demo(int x){
        this(5,15);
        System.out.println("One argument const");
    }
    Demo(int x,int y){

        System.out.println("Two argument cons");

        System.out.println(x*y);

    }


    public static void main(String[] args) {
        new Demo();
    }
}
