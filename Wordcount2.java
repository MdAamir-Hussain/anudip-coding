import java.util.Scanner;

public class Wordcount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        input = input.trim();

        // check if the is empty
        if (input.isEmpty()) {
            System.out.println("Number of words in the string : 0");

        } else {
            int wordCount = 1; // start with 1 as the first word is counted

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ' && input.charAt(i - 1) != ' ') {
                    wordCount++;
                }
            }

            // output the result
            System.out.println("Number of words in the string : " + wordCount);
        }

        sc.close();
    }
}
