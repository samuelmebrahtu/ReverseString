import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string >> ");
        String input = scanner.nextLine();
        scanner.close();
        String reversedString = reverseString(input);
        System.out.println("Your reversed string is \""+reversedString+"\"");
    }

    public static String reverseString(String s) {
        List<String> reversedStringList = new ArrayList<>();
        String[] letters = s.split("");
        for (String c: letters) {
            reversedStringList.add(0, c);
        }

        return String.join("", reversedStringList);
    }
}
