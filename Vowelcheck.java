public class Vowelcheck {
    public static void main(String[] args) {
        System.out.println(checkvowel("Hello"));
        System.out.println(checkvowel("TVxx"));
    }

    public static boolean checkvowel(String input) {

        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
