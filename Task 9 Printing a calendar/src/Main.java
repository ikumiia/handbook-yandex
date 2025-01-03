import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Введите номер дня недели первого числа месяца: ");
        int num1 = data.nextInt();
        if (num1 < 1 || num1 > 7) {
            System.out.println("Неверный ввод");
            return;
        }

        System.out.print("Введите количество дней в месяце: ");
        int num2 = data.nextInt();
        if (num2 < 1 || num2 > 99) {
            System.out.println("Неверный ввод");
            return;
        }


        for (int i = 1; i < num1; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= num2; day++) {
            System.out.printf("%2d ", day);
            if ((day + num1 - 1) % 7 == 0) {
                System.out.println();
            }
        }

        if ((num2 + num1 - 1) % 7 != 0) {
            System.out.println();
        }
    }
}
