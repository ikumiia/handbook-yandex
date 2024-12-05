import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Введите n: ");
        long num1 = data.nextLong();
        long sum = (num1 * (num1 + 1)) / 2L;// Формула арифметической прогрессии
        System.out.println("cумма первого: " + num1 + "\nнатура: " + sum);

    }
}