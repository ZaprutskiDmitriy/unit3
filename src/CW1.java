import java.util.Scanner;

public class CW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        if (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        } else {
            System.out.println("NAN");
        }
    }
}
