import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o preço do produto: ");
        float produto = teclado.nextFloat();
        double novovalor = produto * 0.95;
        System.out.println("O produto que custava "+produto+", na promoção com desconto de 5% vai custar " +novovalor);
    }
}