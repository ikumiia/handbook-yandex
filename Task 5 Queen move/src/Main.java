import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner job = new Scanner(System.in);
        System.out.print("Введите первую координату ");
        int x1 = job.nextInt();
        System.out.print("Введите вторую координату ");
        int y1 = job.nextInt();
        System.out.print("Введите третью координату ");
        int x2 = job.nextInt();
        System.out.print("Введите четвертую координату ");
        int y2 = job.nextInt();
        if (x1 == x2 || y1 == y2 || Math.abs(x1-x2) == Math.abs(y1-y2))
            System.out.println("Сможет");
        else
            System.out.println("Не сможет");
    }
}