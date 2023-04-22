import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner scan = new Scanner(System.in);

        double renda = scan.nextDouble();

        if(renda <= 2000.00) {
            System.out.println("Isento");
        }
        else if(renda <= 3000.0) {
            System.out.printf("R$ %.2f\n", (renda - 2000.0) * 0.08);
        }
        else if(renda <= 4500.0) {
            System.out.printf("R$ %.2f\n", 1000.0 * 0.08 + (renda - 3000.0) * 0.18);
        }
        else
            System.out.printf("R$ %.2f\n", 1000.0 * 0.08 + 1500.0 * 0.18 + (renda - 4500.0) * 0.28);
    }
}
