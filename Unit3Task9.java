import java.util.Random;
import java.util.Scanner;

public class Unit3Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = 0;
        if (sc.hasNextInt()){
            n = sc.nextInt();
            int arr[] = new int[n];
            int sumLeft = 0;
            int sumRight = 0;
            Random rand = new Random();
            for (int i = 0; i < n; i++) {
                arr[i] = rand.nextInt(15);
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n/2; i++) {
                sumLeft = sumLeft + arr[i];
            }
            for (int i = n-1; i > (n-1)/2; i--) {
                sumRight = sumRight + arr[i];
            }
            System.out.println("Сумма левой половины: " + sumLeft);
            System.out.println("Сумма правой половины: " + sumRight);
            if (sumLeft > sumRight) {
                System.out.println("Сумма левой половины больше");
            }
            else if (sumLeft > sumRight) {
                System.out.println("Сумма правой половины больше");
            }
            else {
                System.out.println("Суммы модулей равны");
            }
        }
        else {
            System.out.println("Вы ввели неподходящее число");
        }

    }
}
