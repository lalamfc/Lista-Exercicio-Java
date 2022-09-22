import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        float valorPrestacao = 0;
        float salarioBruto = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        salarioBruto = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor da prestação desejada: ");
        valorPrestacao = Float.parseFloat(leitor.nextLine());

        if (valorPrestacao <= (salarioBruto*0.3f)){
            System.out.println("Empréstimo concedido!");
        } else{
            System.out.println("Empréstimo não concedido!");
        }
    }
}
