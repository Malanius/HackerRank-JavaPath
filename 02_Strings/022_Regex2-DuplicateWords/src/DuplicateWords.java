import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b([A-Za-z]+)\\b(\\s\\1\\b)+"; //Note, second capture group is backreference on the first
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for sub-sequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1)); //Replace whole group with duplicate with the first group only
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}