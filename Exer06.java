import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        var i = 0;
        var totalAprovados = 0;
        var totalExame = 0;
        var totalReprovados = 0;
        float mediaTotal = 0;

        Scanner leitor = new Scanner(System.in);

        for (i = 0; i <= 5; i++){
            System.out.println("Digite a primeira nota: ");
            float nota1 = Float.parseFloat(leitor.nextLine());
            System.out.println("Digite a segunda nota: ");
            float nota2 = Float.parseFloat(leitor.nextLine());
            float media = (nota1 + nota2)/2;
            System.out.println("Sua média é: " + media);
            mediaTotal = media/6;

            if (media < 3){
                System.out.println("Você foi REPROVADO!");
                totalReprovados++;
            } else if (media >= 3 && media <= 7){
                System.out.println("Você está em exame final!");
                totalExame++;
            } else{
                System.out.println("Você foi APROVADO!");
                totalAprovados++;
            }
        }
        System.out.println("O total de alunos aprovados foi de: " + totalAprovados);
        System.out.println("O total de alunos em exame foi de: " + totalExame);
        System.out.println("O total de alunos reprovados foi de: " + totalReprovados);
        System.out.println("A média total da turma foi de: " + mediaTotal);
    }

}
