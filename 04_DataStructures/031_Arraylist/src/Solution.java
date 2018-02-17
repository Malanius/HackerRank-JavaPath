import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> matrix = new ArrayList<>();

        int lines = scanner.nextInt();
        System.err.println("Lines:" + lines);
        for (int i = 0; i < lines; i++) {
            List<Integer> line = new ArrayList<>();
            int numbers = scanner.nextInt();
            System.err.println("\tNumbers: " + numbers);
            for (int j = 0; j < numbers; j++) {
                int num = scanner.nextInt();
                System.err.print(num + "|");
                line.add(num);
            }
            System.err.println("\nLine completed.");
            System.err.println(line.toString());
            matrix.add(line);
            System.err.println();

        }
        int queries = scanner.nextInt();
        System.err.println("Queries: " + queries);
        for (int i = 0; i < queries; i++) {
            int x = scanner.nextInt();
            System.err.println("Requested x: " + x);
            int y = scanner.nextInt();
            System.err.println("Requested y: " + y);
            try {
                System.out.println(matrix.get(x - 1).get(y - 1));
            } catch (NoSuchElementException | IndexOutOfBoundsException ex) {
                System.out.println("ERROR!");
            }
        }
    }
}
