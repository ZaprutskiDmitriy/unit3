import java.util.Random;

public class Unit3Task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        double arr1[] = new double[10];
        double arr2[] = new double[10];
        double arr3[] = new double[10];
        for (int i=0; i<10; i++) {
            arr1[i] = rand.nextInt(9);
            arr2[i] = rand.nextInt(9);
        }
        System.out.println("Первый массив");
        for (int i=0; i<10; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Второй массив");
        for (int i=0; i<10; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("Третий массив");
        int count = 0;
        for (int i=0; i<10; i++) {
            if (arr2[i] == 0) {
                arr3[i] = 0;
            }
            else {
                arr3[i] = arr1[i] / arr2[i];
                System.out.print(arr3[i] + " ");
            }
            if (arr3[i] % 1 == 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество целых чисел в третьем массиве: " + count);
    }
}
