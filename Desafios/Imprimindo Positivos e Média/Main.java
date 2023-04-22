import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner scan = new Scanner(System.in);

        int valoresPositivos = 0;
        double media, valores, soma = 0;

        for(int i = 0; i < 6; i++) {
            valores = scan.nextDouble();

            if(valores > 0)
            {
                valoresPositivos++;
                soma += valores;
            }
        }

        media = soma / valoresPositivos;

        System.out.println("" + valoresPositivos + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}
