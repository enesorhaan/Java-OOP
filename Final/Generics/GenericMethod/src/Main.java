public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "Paris", "New York", "Austin"};

        Main.<Integer>print(integers);
        Main.<String>print(strings);

        String[] countries = {"Turkey", "Germany", "England"};

        show(countries);
    }

    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }

    public static <T> void show(T[] list){
        for (int j = 0; j < list.length; j++)
            System.out.print(list[j] + " ");
        System.out.println();
    }
}