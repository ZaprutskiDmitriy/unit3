import java.util.Random;
import java.util.Scanner;

public class Java2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        for (int i=1; i<=n; i++){
            System.out.println(random.nextInt(50));
        }
    }
}
