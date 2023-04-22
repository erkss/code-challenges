import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int custoFabrica, porcentagemDistribuidor, impostos;
        int valorDistribuidor, valorImpostos, precoCarro;

        custoFabrica = scan.nextInt();
        porcentagemDistribuidor = scan.nextInt();
        impostos = scan.nextInt();

        valorDistribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        valorImpostos = (custoFabrica * impostos) / 100;
        precoCarro = custoFabrica + valorDistribuidor + valorImpostos;

        System.out.println("" + precoCarro);
    }
}
