import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] countsA = countChars(a);
        int[] countsB = countChars(b);
        return Arrays.equals(countsA, countsB);
    }

    private static int[] countChars(String inputString) {
        int[] charCount = new int[26];
        for (char c : inputString.toCharArray()) {
            int letterIndex = c - 97;
            //System.err.println(letterIndex);
            charCount[letterIndex]++;
        }
        System.err.println(Arrays.toString(charCount));
        return charCount;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

