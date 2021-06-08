import java.util.Random;

public class Unit3Task7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[] = new int[12];
        int max = arr[0];
        int maxInd = 0;
        System.out.println("Массив");
        for (int i=0; i<12; i++) {
            arr[i] = rand.nextInt(15);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i=0; i<12; i++) {
            if (arr[i] >= max){
                max = arr[i];
                maxInd = i;
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Индекс его последнего вхождения в массив: " + maxInd);
    }
}
