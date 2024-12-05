import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Enter the number in centimeters: ");
        double cm = data.nextDouble();
        double count = 1000000;
        double sum = cm / 2.54;
        double sum1 = Math.round(sum * count) / count;
        System.out.print("Your number in inches: " + sum1);


    }
}