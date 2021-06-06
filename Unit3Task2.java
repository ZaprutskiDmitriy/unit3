public class Unit3Task2 {
    public static void main(String[] args) {
        int razm = 0;
        for (int l = 1; l <= 99; l++) {
            if (l % 2 != 0) {
                razm++;
            }
        }
        int arr[] = new int[razm];
        for (int i = 0; i < razm; i++) {
            arr[i] = i * 2 + 1;
        }
        for (int j = 0; j < razm; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        for (int k = razm-1; k >= 0; k--) {
            System.out.print(arr[k] + " ");
        }
    }
}
