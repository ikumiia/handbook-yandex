import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner job = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        int month = job.nextInt();
        System.out.print("Введите год: ");
        int year = job.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Неверное число");
            return;
        }

        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 0;
        }

        System.out.printf("%d дней в месяце в %d году\n", days, year);
    }
}