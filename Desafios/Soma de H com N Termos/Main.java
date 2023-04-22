import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double h = 0d;
        double n = scan.nextDouble();

        for(int i = 1; i <= n; i++) {
            h += 1d/i;
        }

        System.out.println(Math.round(h));
    }
}
