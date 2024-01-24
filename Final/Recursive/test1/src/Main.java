import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string to generate its permutations: ");
        String str = scn.next(); //String input from the user

        System.out.println("Permutations of " + str + ":");
        findPermutations(str);
    }

    public static void findPermutations(String str) {
        findPermutationsHelper("", str);
    }

    private static void findPermutationsHelper(String prefix, String remaining) {
        int n = remaining.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                findPermutationsHelper(newPrefix, newRemaining);
            }
        }
    }
}
