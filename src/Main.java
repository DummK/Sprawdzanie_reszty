import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wprowadź liczbę:");
        int number = scan.nextInt();

        if(number % 7 == 0) {
            System.out.println("Liczba 7 jest dzielnikiem liczby " + number + " :)");
        }
        else {
            System.out.println("Liczba 7 NIE jest dzielnikiem liczby " + number + " :(");
        }
    scan.close();
    }
}