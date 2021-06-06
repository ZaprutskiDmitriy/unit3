import java.util.Random;

public class Unit3Task3 {
    public static void main(String[] args) {
        int arr[] = new int[15];
        Random rand = new Random();
        int countEven = 0;
        for (int i = 0; i < 15; i++) {
            arr[i] = rand.nextInt(99);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println();
        System.out.println("Количество четных чисел в массиве " + countEven);
    }
}
