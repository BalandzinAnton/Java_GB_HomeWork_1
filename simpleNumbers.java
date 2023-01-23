package HomeWork.HomeWork1;
// Вывести все простые числа от 1 до 1000

public class simpleNumbers {
    static boolean answerBol;
    static final int NUMBER = 1000;

    public static void main(String[] args) {
        int counter = 2; // два первых вручную

        for (int k = 2; k <= 3; k++) {
            System.out.printf("%4d", k);
        }
        for (int i = 5; i <= NUMBER; i += 2) {
            answerBol = true;
            for (int j = 3; j < i; j += 2) {
                if (i % j == 0) {
                    answerBol = false;
                    break;
                }
            }

            if (answerBol) {
                System.out.printf("%4d", i);
                counter++;
                if (counter % 15 == 0)
                    System.out.println();
            }
        }
    }
}

