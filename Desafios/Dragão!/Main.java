import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int nivelEnergia;

        for(int i = 0; i < casos; i++) {
            nivelEnergia = scan.nextInt();

            if(nivelEnergia > 8000) {
                System.out.println("Mais de 8000!");
            } else {
                System.out.println("Inseto!");
            }
        }
    }
}
