import java.util.Random;

public class Unit3Task6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[] = new int[4];
        int count = 0;
        System.out.println("Массив");
        for (int i = 0; i < 4; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < 4; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
            }
        }
        if (count == 3) {
            System.out.println("Последовательность является строго возрастающей");
        } else {
            System.out.println("Последовательность не является строго возрастающей");
        }
    }
}
