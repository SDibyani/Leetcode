import java.util.Scanner;

public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // Compare characters (case insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Main method for testing in VS Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

          Valid_Palindrome vp = new Valid_Palindrome();
        boolean result = vp.isPalindrome(input);

        if (result) {
            System.out.println("✅ It is a palindrome!");
        } else {
            System.out.println("❌ Not a palindrome.");
        }

        sc.close();
    }
}
