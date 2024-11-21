import java.util.Scanner;

public class Wordcount {

    //count words in a string : write a program to count the numbeer of words in a given string..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner object

        System.out.println("Enter a string: ");

        String input = sc.nextLine();

        String words[] = input.trim().split("\\s+");

        int count = words.length;

        // output

        System.out.println("Number of words in the string: " + count);

        sc.close();
    }
}