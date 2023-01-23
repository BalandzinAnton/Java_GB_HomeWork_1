package HomeWork.HomeWork1;
//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class numbersOneToN {
    public static Scanner number = new Scanner(System.in);
    public static void main(String[] args) {
        printNumber(inputNumber());
    }

    private static void printNumber(int number) {
        int numberSumN = 0;
        int numberMult = 1;
        for (int i = 1; i < number + 1; i++) {
            numberSumN += i;
            numberMult *= i;
        }

        System.out.println("сумма чисел от 1 до n равна: " + numberSumN + ", произведение от 1 до n: " + numberMult);
    }

    private static int inputNumber() {
        System.out.print("Введите число 'n': ");
        int numberN = Integer.parseInt(number.nextLine());
        return numberN;
    }
}
