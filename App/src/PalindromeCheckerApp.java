import java.util.Scanner;

// version 4.0
//author Srikar
//useCase 4: Character Array Based Palindrome check
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App Management System");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();


        int start = 0;
        int end = chars.length - 1;


        boolean isPalindrome = true;


        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }


        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        scanner.close();

    }
}
