public class Reverse_Words_in_a_string {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // split by one or more spaces
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    // Main method for testing in VS Code
    public static void main(String[] args) {
        Reverse_Words_in_a_string sol = new Reverse_Words_in_a_string();

        String input = "   the sky   is blue   ";
        String result = sol.reverseWords(input);

        System.out.println("Original: \"" + input + "\"");
        System.out.println("Reversed: \"" + result + "\"");
    }
}

