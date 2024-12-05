import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = data.nextInt();

        System.out.println("Введите второе чилсо:");
        int num2 = data.nextInt();
        int sum = num1 + num2;

        System.out.println("Сумма ваших чисел: " + sum);
    }
}