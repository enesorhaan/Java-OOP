public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static class ClassicSingleton {
        private static ClassicSingleton instance = null;

        protected ClassicSingleton() {

        }

        public static ClassicSingleton getInstance(){
            if(instance == null)
                instance = new ClassicSingleton();
            return instance;
        }
    }
}

