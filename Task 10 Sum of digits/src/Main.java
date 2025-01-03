import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Введите число: ");
        long num1 = data.nextLong();
        int sum = 0;
        if(num1 > 1000000000){
            System.out.println("Неверный ввод");
            return;
        }

        while(num1 != 0){
            sum += (num1 % 10);
            num1 /= 10;
        }

        System.out.println(sum + " ");

    }
}