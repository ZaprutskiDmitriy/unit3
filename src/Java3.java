import java.util.Random;

public class Java3 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(30);
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        int min = arr[0];
        int max = arr[0];
        for (int j = 0; j < 10; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        for (int k = 0; k < 10; k++) {
            if (arr[k] > max) {
                max = arr[k];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
