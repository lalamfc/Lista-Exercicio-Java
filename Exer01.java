public class Exer01 {
    public static void main(String[] args) {
        float valorCreditos = 100;
        float percentAumento = 0.15f;
        System.out.println("Seu crédito era " + valorCreditos);
        float valorAumento = valorCreditos * percentAumento;
        System.out.println("Este é o novo valor " + (valorCreditos+valorAumento));
    }
}
