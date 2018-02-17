import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            String regex = "<(.+)>([^<>]+)</\\1>";
            Pattern patter = Pattern.compile(regex);
            Matcher matcher = patter.matcher(line);
            int count = 0;
            while (matcher.find()) {
                count++;
                System.out.println(matcher.group(2));
            }
            if (count == 0) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}
