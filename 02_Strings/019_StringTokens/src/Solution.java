import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        tokenize(s);
        scan.close();
    }

    private static void tokenize(String s) {
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(s);
        List<String> tokens = new ArrayList<>();
        int count = 0;

        while (matcher.find()) {
            count++;
            tokens.add(matcher.group());
        }

        System.out.println(count);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
