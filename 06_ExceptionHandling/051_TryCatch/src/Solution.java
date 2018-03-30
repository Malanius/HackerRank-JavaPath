import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException ex) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException ex) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
    //Note: can't print exception directly and use multi-catch, as last test case throws:
    // java.util.InputMismatchException: For input string: "2147483648" -> fails the test case
}
