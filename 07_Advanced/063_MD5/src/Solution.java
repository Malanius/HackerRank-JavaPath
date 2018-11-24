import javax.xml.bind.DatatypeConverter;
        import java.security.MessageDigest;
        import java.security.NoSuchAlgorithmException;
        import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        md5.update(s.getBytes());
        String hash = DatatypeConverter.printHexBinary(md5.digest()).toLowerCase();
        System.out.println(hash);
    }

}

