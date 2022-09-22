import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        float percentAumento = 0.20f;
        String opcao = "";
        float salarioNovo = 0;
        float valorAumento = 0;

        while(!opcao.equalsIgnoreCase("fim")){
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite seu salário: ");
            float salario = Float.parseFloat(leitor.nextLine());

            if (salario < 500){
                System.out.println("Você está apto para receber o aumento! ");
                valorAumento = salario * percentAumento;
                System.out.println("Seu aumento foi de: " + valorAumento);
                salarioNovo = salario + valorAumento;
                System.out.println("Seu salário agora é " + salarioNovo);
            } else {
                System.out.println("Você não tem direito ao aumento! ");
            }
            System.out.println("Para encerrar o programa digite fim ");
            opcao = leitor.nextLine();
        }
    }
}
