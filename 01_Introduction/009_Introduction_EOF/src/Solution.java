import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = 0;
        while (sc.hasNext()) {
            lines++;
            System.out.printf("%d %s%n", lines, sc.nextLine());
        }
    }
}
