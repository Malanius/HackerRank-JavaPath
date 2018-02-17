import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder sb = new StringBuilder(a);
        String reversed = sb.reverse().toString();

        String answer = (a.equals(reversed)) ? "Yes" : "No";

        System.out.println(answer);

    }
}
