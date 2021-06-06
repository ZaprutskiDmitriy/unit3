import java.util.Random;

public class Unit3Task5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        double sum1 = 0;
        double sum2 = 0;
        System.out.println("Первый массив");
        for (int i=0; i<5; i++) {
            arr1[i] = rand.nextInt(15);
            System.out.print(arr1[i] + " ");
            sum1 = sum1 + arr1[i];
        }
        double sredArifm1 = sum1 / 5;
        System.out.println();
        System.out.println("Второй массив");
        for (int i=0; i<5; i++) {
            arr2[i] = rand.nextInt(15);
            System.out.print(arr2[i] + " ");
            sum2 = sum2 + arr2[i];
        }
        double sredArifm2 = sum2 / 5;
        System.out.println();
        System.out.println("Среднее арифметическое массива 1 = " + sredArifm1);
        System.out.println("Среднее арифметическое массива 2 = " + sredArifm2);
        if (sredArifm1 > sredArifm2) {
            System.out.println("Среднее арифметическое массива 1 больше, чем массива 2");
        }
        else if (sredArifm1 < sredArifm2) {
            System.out.println("Среднее арифметическое массива 2 больше, чем массива 1");
        }
        else {
            System.out.println("Средние арифметические двух массивов равны");
        }
    }
}
