import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int sumLenght = a.length() + b.length();
        System.out.println(sumLenght);

        String before = (a.compareTo(b) > 0) ? "Yes" : "No";
        System.out.println(before);

        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.printf("%s %s%n", a, b);
    }
}
