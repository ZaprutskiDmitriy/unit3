public class Unit3Task1 {
    public static void main(String[] args) {
        int razm = 0;
        for (int k = 2; k <= 20; k++) {
            if (k % 2 == 0) {
                razm++;
            }
        }
        int arr[] = new int[razm];
        for (int i = 1; i <= razm; i++) {
            arr[i - 1] = i * 2;
            System.out.print(arr[i - 1] + " ");
        }
        System.out.println();
        for (int j = 0; j < razm; j++) {
            System.out.println(arr[j]);
        }
    }
}
