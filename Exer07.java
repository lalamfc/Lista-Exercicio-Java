import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        float diaria = 40.0f;
        float valorTotal = 0;
        float valorDiaria = 0;
        String opcao = "";

        Scanner leitor = new Scanner(System.in);

        while (!opcao.equalsIgnoreCase("fim")) {
            System.out.println("Informe seu nome: ");
            var nome = leitor.nextLine();
            System.out.println("Informe quantos dias deseja se hospedar: ");
            int quantDias = leitor.nextInt();

            if (quantDias < 10) {
                valorDiaria = 40 + 15f;
                System.out.println("Para " + quantDias + " dias, o valor de cada diária é de: " + valorDiaria);
            } else {
                valorDiaria = 40 + 8f;
                System.out.println("Para " + quantDias + " dias, o valor de cada diária é de: " + valorDiaria);
            }
            System.out.println("Para encerrar o programa digite fim: ");
            opcao = leitor.nextLine();
        }
        valorTotal += valorDiaria;
        System.out.println("O total arrecadado pela pousada foi de: " + valorTotal);
    }
}
