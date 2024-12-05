import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner job = new Scanner(System.in);
        System.out.print("Введи первое число ");
        int a = job.nextInt();
        System.out.print("Введи второе число ");
        int b = job.nextInt();
        System.out.print("Введи третье число ");
        int c = job.nextInt();

        if (Triangle(a, b, c)){
            System.out.print("Прямоугольный");
        }
        else
            System.out.print("Не прямоугольный");
    }
    public  static boolean Triangle(int a, int b, int c) {
        int max = Math.max(a, Math.max(b,c));
        int trg = a * a + b * b + c * c - max * max;
        return Math.abs(trg - max * max) < 1e-9;
    }
}