import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[] = new int[20];
        System.out.println("Первоначальный массив");
        for (int i=0; i<20; i++) {
            arr[i] = rand.nextInt(20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i=1; i<20; i+=2) {
            arr[i] = 0;
        }
        System.out.println("Преобразованный массив: ");
        for (int i=0; i<20; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
