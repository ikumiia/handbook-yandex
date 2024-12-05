import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner job = new Scanner(System.in);
        System.out.print("Введите год: ");
        int god = job.nextInt();
        if ((god % 4 == 0 && god % 100 != 0) || (god % 400 == 0))
            System.out.print("Это високосный год!");
        else
            System.out.print("Обычный год, не високосный!");
    }
}