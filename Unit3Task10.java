import java.util.Random;
import java.util.Scanner;

public class Unit3Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите размерность массива (больше 3)");
        int n = 0;
        int count = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else {
            System.out.println("Вы ввели неподходящее число");
        }
        int arr[] = new int[n];

        if (n > 3) {
            System.out.println("Исходный массив:");
            for (int i = 0; i < n; i++) {
                arr[i] = rand.nextInt(n);
                System.out.print(arr[i] + " ");
                if (arr[i] % 2 == 0 && arr[i] != 0) {
                    count++;
                }
            }
            System.out.println();
            int arr2[] = new int[count];
            System.out.println("Массив из четных элементов первого массива:");
            for (int i = 0, j = 0; i < n; i++) {
                if (arr[i] % 2 == 0 && arr[i] != 0) {
                    arr2[j] = arr[i];
                    System.out.print(arr2[j] + " ");
                    j++;
                }
            }
        } else {
            System.out.println("Вы ввели неподходящее число");
        }
    }
}
