import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n = sc.nextInt();
        Produto[] vect = new Produto[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.next();
            double price = sc.nextDouble();
            vect[i] = new Produto(name, price);
        }
        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }
        double avg = soma / vect.length;
        System.out.printf("AVERAGE PRICE: %.2f%n", avg);
        sc.close();
    }
}