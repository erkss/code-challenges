import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorCompra, valorDesconto;
        int morangos = scan.nextInt();
        int macas = scan.nextInt();
        int kgFruta = morangos + macas;

        if(morangos <= 5 && macas <= 5)
            valorCompra = (morangos * 2.50) + (macas * 1.80);
        else
            valorCompra = (morangos * 2.20) + (macas * 1.50);

        valorDesconto = (valorCompra * 10) / 100;

        if(kgFruta > 8 || valorCompra > 25.00)
            System.out.println("" + (valorCompra - valorDesconto));
        else
            System.out.println("" + valorCompra);
    }
}
