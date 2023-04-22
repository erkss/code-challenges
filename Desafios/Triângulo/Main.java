import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner scan = new Scanner(System.in);

        double valorA = scan.nextDouble();
        double valorB = scan.nextDouble();
        double valorC = scan.nextDouble();
        double area, perimetro;

        if(valorA + valorB > valorC && valorB + valorC > valorA && valorA + valorC > valorB) {
            perimetro = valorA + valorB + valorC;
            System.out.printf("Perimetro = %.1f", perimetro);
        } else {
            area = ((valorA + valorB) * valorC) / 2;
            System.out.printf("Area = %.1f", area);
        }
    }
}
