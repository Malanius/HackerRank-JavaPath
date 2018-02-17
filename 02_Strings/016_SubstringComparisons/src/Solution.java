import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    private static String getSmallestAndLargest(String string, int subLength) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < (string.length() - subLength + 1); i++) {
            String current = string.substring(i, i + subLength);
            //System.err.printf("Current substr.: %s%n", current);
            substrings.add(current);
        }

        substrings.sort(null);

        return substrings.get(0) + "\n" + substrings.get(substrings.size() - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
