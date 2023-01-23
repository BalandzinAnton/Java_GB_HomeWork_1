package HomeWork.HomeWork1;

public class task4 {

    String given = "2? + ?5 = 69"; // уравнение вида Aq + Bw = e

    public static void main(String[] args) {

        for (int i = 0; i < 70; i++) {
            for (int j = 0; j < 70; j++) {
                if (2 * i + j * 5 == 69)  {
                    System.out.println("Корни уравнения: A=" + i + " B=" + j);
                }
            }
        }

    }
}
