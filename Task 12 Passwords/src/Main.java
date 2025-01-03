import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isValidPassword(String password) {

        if (password.length() < 8 || password.length() > 14) {
            return false;
        }

        for (char c : password.toCharArray()) {
            if (c < 33 || c > 126) {
                return false;
            }
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        int classesCount = (hasUpperCase ? 1 : 0) + (hasLowerCase ? 1 : 0) + (hasDigit ? 1 : 0) + (hasSpecial ? 1 : 0);
        return classesCount >= 3;
    }
}
