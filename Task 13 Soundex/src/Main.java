import java.util.Scanner;

public class Main {

    public static String encode(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        }

        char firstChar = Character.toLowerCase(word.charAt(0));
        StringBuilder soundex = new StringBuilder().append(firstChar);

        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i);
            String digit = switch (c) {
                case 'b', 'f', 'p', 'v' -> "1";
                case 'c', 'g', 'j', 'k', 'q', 's', 'x', 'z' -> "2";
                case 'd', 't' -> "3";
                case 'l' -> "4";
                case 'm', 'n' -> "5";
                case 'r' -> "6";
                default -> "";
            };

            if (!digit.isEmpty() && !soundex.toString().endsWith(digit)) {
                soundex.append(digit);
            }
        }

        soundex.setLength(Math.min(soundex.length(), 4));
        while (soundex.length() < 4) {
            soundex.append("0");
        }

        return soundex.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово для вычисления Soundex кода: ");
        String word = scanner.nextLine();
        String soundexCode = encode(word);
        System.out.print("Soundex код для слова \"" + word + "\" : " + soundexCode);
    }
}
