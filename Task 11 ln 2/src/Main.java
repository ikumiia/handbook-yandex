import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Введите количество членов ряда: ");
        int num1 = data.nextInt();

        double sum = 0.0;
        int sign = 1;

        for (int num2 = 1; num2 <= num1; num2++) {
            sum += sign * (1.0 / num2);
            sign = -sign;
        }

        System.out.printf("Значение натурального логарифма ln 2 с %d членами ряда: %f%n", num1, sum);
    }
}