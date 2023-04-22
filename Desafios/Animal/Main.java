import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra1, palavra2, palavra3;

        palavra1 = scan.next();
        palavra2 = scan.next();
        palavra3 = scan.next();

        if(palavra1.equalsIgnoreCase("vertebrado")) {
            if(palavra2.equalsIgnoreCase("ave"))
                if(palavra3.equalsIgnoreCase("carnivoro"))
                    System.out.println("aguia");
        }

        if(palavra1.equalsIgnoreCase("vertebrado")) {
            if(palavra2.equalsIgnoreCase("ave"))
                if(palavra3.equalsIgnoreCase("onivoro"))
                    System.out.println("pomba");
        }

        if(palavra1.equalsIgnoreCase("vertebrado")) {
            if(palavra2.equalsIgnoreCase("mamifero"))
                if(palavra3.equalsIgnoreCase("onivoro"))
                    System.out.println("homem");
        }

        if(palavra1.equalsIgnoreCase("vertebrado")) {
            if(palavra2.equalsIgnoreCase("mamifero"))
                if(palavra3.equalsIgnoreCase("herbivoro"))
                    System.out.println("vaca");
        }

        if(palavra1.equalsIgnoreCase("invertebrado")) {
            if(palavra2.equalsIgnoreCase("inseto"))
                if(palavra3.equalsIgnoreCase("hematofago"))
                    System.out.println("pulga");
        }

        if(palavra1.equalsIgnoreCase("invertebrado")) {
            if(palavra2.equalsIgnoreCase("inseto"))
                if(palavra3.equalsIgnoreCase("herbivoro"))
                    System.out.println("lagarta");
        }

        if(palavra1.equalsIgnoreCase("invertebrado")) {
            if(palavra2.equalsIgnoreCase("anelideo"))
                if(palavra3.equalsIgnoreCase("hematofago"))
                    System.out.println("sanguessuga");
        }

        if(palavra1.equalsIgnoreCase("invertebrado")) {
            if(palavra2.equalsIgnoreCase("anelideo"))
                if(palavra3.equalsIgnoreCase("onivoro"))
                    System.out.println("minhoca");
        }
    }
}
