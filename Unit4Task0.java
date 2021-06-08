import java.util.Random;
import java.util.Scanner;

public class Unit4Task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int sumEven = 0;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(50);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i][i]%2 == 0){
                sumEven += arr[i][i];
            }
        }
        System.out.println("Сумма четных элементов на главной диагонали: " + sumEven);
    }
}
