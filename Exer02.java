import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        var numero = 0;
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            numero = leitor.nextInt();

            if (numero % 2 == 0){
                System.out.println("O número é par " + numero);
            } else {
                System.out.println("O número é ímpar " + numero);
            }

        }
    }
}