public class Parent {

    Parent(){
        System.out.println("Parent class default const");
    }

    Parent(int x){
        System.out.println("Parent class one-arg const");
    }

}
class Child extends Parent{
    Child(){
        System.out.println("Child class default const");
    }
    Child(int x){
        super(x);
        System.out.println("Child class one-arg const");
    }
}

class ParentTest{
    public static void main(String[] args) {
        Child obj1=new Child();
        Child obj2=new Child(10);
    }
}
