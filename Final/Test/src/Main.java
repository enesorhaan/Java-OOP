public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        B b = new A();
        A a = new B(); // hatali
    }
}

class B {

}

class A extends B {

}