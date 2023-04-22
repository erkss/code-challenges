import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String frase = scan.nextLine();
        String fraseMinusculo = frase.toLowerCase();
        String[] strSplit = frase.split(" ");
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for(int i = 0; i < fraseMinusculo.length(); i++) {
            char letra = fraseMinusculo.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
                quantVogais++;
        }

        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}



