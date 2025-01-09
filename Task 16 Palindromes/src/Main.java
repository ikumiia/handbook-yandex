import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        System.out.println(isPalindrome(input1) ? "YES" : "NO");
        System.out.println(isPalindrome(input2) ? "YES" : "NO");
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
