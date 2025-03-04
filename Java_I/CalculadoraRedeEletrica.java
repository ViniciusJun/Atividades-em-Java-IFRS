package Java_I;

public class CalculadoraRedeEletrica {
    public static void main(String[] args) {

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = Double.parseDouble(System.console().readLine());


        System.out.print("Digite o número de quilowatts gastos no mês: ");
        int quilowatt = Integer.parseInt(System.console().readLine());

        // Calcula o valor de cada unidade de quilowatt
        double valorUnidade = salarioMinimo / 5;

        // Calcula o valor da conta sem desconto
        double conta = quilowatt * valorUnidade;

        // Calcula o desconto de 15%
        double desconto = conta * 0.15;

        // Calcula o valor final da conta com desconto
        double valorFinal = conta - desconto;

        // Exibe os resultados
        System.out.println("O valor do Quilowatt é: " + valorUnidade);
        System.out.println("O valor da Conta do mês: " + conta);
        System.out.println("O valor a ser pago com desconto de 15%: " + valorFinal);
    }
}
