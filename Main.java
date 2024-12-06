import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Введите номер дня недели первого числа месяца: ");
        int num1 = data.nextInt();
        if (num1 > 7 || num1 < 1) {
            System.out.print("Неверный ввод");
            return;
        }

        System.out.print("Введите количество дней в месяце: ");
        int num2 = data.nextInt();
        if (num2 > 99 || num2 < 1) {
            System.out.print("Неверный ввод");
            return;
        }

        for (int f = 0; f <= num2; f++) {
            System.out.printf(num1 + " ");
        }

        for (int day = 1; day <= num1; day++) {
            System.out.printf("%2d ", day);
        }

    }
}