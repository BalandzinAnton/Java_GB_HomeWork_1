package HomeWork.HomeWork1;
import java.util.Scanner;

public class Calculator {
    public static Scanner numberA = new Scanner(System.in);
    public static Scanner numberB = new Scanner(System.in);
    public static Scanner result = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите число 'A': ");
            float a = numberA.nextInt();
            System.out.print("Введите число 'B': ");
            float b = numberA.nextInt();
            String massage = "Выберите действие:\n 1 - сложить;\n 2 - отнять; \n 3 - умножить; \n 4 - разделить;";
            System.out.println(massage);
            int res = numberA.nextInt();
            if (res == 1) {
                System.out.println(a + b);
            }
            if (res == 2) {
                System.out.println(a - b);
            }
            if (res == 3) {
                System.out.println(a * b);
            }
            if (res == 4) {
                System.out.println(a / b);
            }
        }
    }
}
