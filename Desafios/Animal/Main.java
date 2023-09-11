import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra1, palavra2, palavra3;

        palavra1 = scan.next();
        palavra2 = scan.next();
        palavra3 = scan.next();

        if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("carnivoro")) {
            System.out.println("aguia");
        } 
        else if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("onivoro")) {
            System.out.println("pomba");
        } 
        else if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("mamifero") && palavra3.equalsIgnoreCase("onivoro")) {
            System.out.println("homem");
        } 
        else if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("mamifero") && palavra3.equalsIgnoreCase("herbivoro")) {
            System.out.println("vaca");
        } 
        else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("hematofago")) {
            System.out.println("pulga");
        } 
        else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("herbivoro")) {
            System.out.println("lagarta");
        } 
        else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("anelideo") && palavra3.equalsIgnoreCase("hematofago")) {
            System.out.println("sanguessuga");
        } 
        else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("anelideo") && palavra3.equalsIgnoreCase("onivoro")) {
            System.out.println("minhoca");
        }
    }
}
