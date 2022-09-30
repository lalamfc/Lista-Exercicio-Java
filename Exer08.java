import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        String nome = "";
        String opcao = "";
        String nomeBaixa = "";
        String nomeVelho = "";
        int quantPacientes = 0;
        int quantHomens = 0;
        int quantMulheres = 0;
        int quantIdade = 0;
        int idadeH = 0;
        int idadeM = 0;
        int mediaH = 0;
        int idade = 0;
        int idadeMax = 0;
        float pesoM = 0;
        float alturaM= 0;
        float peso = 0;
        float altura = 0f;
        float alturaB = 200f;

        Scanner leitor = new Scanner(System.in);

        while (!opcao.equalsIgnoreCase("fim")){
            System.out.println("Digite seu sexo, M ou F : ");
            String sexo = leitor.next();
            if (sexo.equalsIgnoreCase("M")){
                quantHomens++;

                System.out.println("Informe seu nome: ");
                nome = leitor.nextLine();

                System.out.println("Informe seu peso: ");
                peso =  leitor.nextFloat();

                System.out.println("Informe sua idade: ");
                idade = leitor.nextInt();
                idadeH++;
                if (idade<idadeMax){
                    nomeVelho = nome;
                }

                System.out.println("Informe sua altura: ");
                altura = leitor.nextFloat();

            } else if (sexo.equalsIgnoreCase("F")) {
                quantMulheres++;

                System.out.println("Digite seu nome: ");
                nome = leitor.next();

                System.out.println("Digite seu peso: ");
                peso = leitor.nextFloat();

                if (peso > 70) {
                    pesoM++;
                }
                System.out.println("Digite sua idade: ");
                idade = leitor.nextInt();
                idadeM++;

                System.out.println("Digite sua altura: ");
                altura = leitor.nextFloat();
                if (altura < alturaB) {
                    nomeBaixa = nome;
                }

                if (altura >= 1.60 && altura <= 1.70) {
                    alturaM++;

                }
            } else if (idadeH >= 18 && idadeH <= 25) {
                quantIdade++;

            } else if (idadeM >= 18 && idadeM <= 25) {
                quantIdade++;
            }
                System.out.println("Paciente : " + nome + " Sexo : " + sexo + " Peso : " + peso + " Idade : " + idade + " Altura : " + altura);
            }

            System.out.println("Para encerrar o programa digite fim ");
            opcao = leitor.nextLine();

            quantPacientes = quantHomens + quantMulheres;
            System.out.println("A quantidade total de pacientes é: " + quantPacientes);
            mediaH = idadeH / quantHomens;
            System.out.println("A média de idade dos homens é de: " + mediaH);
            System.out.println("A quantidade de melhores com altura entre 1.60 e 1.70 é de: " + alturaM + " e peso acima de 70kg é de: " + pesoM);
            System.out.println("A quantidade de pessoas com idade entre 18 e 25 é de: " + quantIdade);
            System.out.println("O nome do paciente mais velho é: " + nomeVelho);
            System.out.println("O nome da mulher mais baixa é: " + nomeBaixa);
    }
}
