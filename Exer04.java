import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        float valorRefri = 3.00f;
        float valorLitroGasol = 2.50f;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantos litros você quer abastecer: ");
        float quantLitroGasol = Float.parseFloat(leitor.nextLine());
        float totalGasol = quantLitroGasol * valorLitroGasol;
        System.out.println("O valor a pagar da gasolina é de: " + totalGasol);

        System.out.println("Digite quantos refrigerantes você quer comprar? ");
        float quantRefri = Float.parseFloat(leitor.nextLine());
        float totalRefri = quantRefri * valorRefri;
        System.out.println("O valor a pagar dos refrigerantes é de: " + totalRefri);

        float valorTotal = totalGasol + totalRefri;
        System.out.println("O valor total a pagar é: " + valorTotal);
    }
}
