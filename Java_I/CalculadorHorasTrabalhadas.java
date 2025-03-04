package Java_I;

public class CalculadorHorasTrabalhadas {
    public static void main(String[] args) {
        
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = Double.parseDouble(System.console().readLine());


        System.out.print("Digite o valor das horas trabalhadas: ");
        double horasTrabalho = Double.parseDouble(System.console().readLine());

        // Calcula o valor da hora trabalhada
        double valorHora = salarioMinimo / 10;

        // Calcula o salário bruto
        double salarioBruto = horasTrabalho * valorHora;

        // Calcula os impostos (3% do salário bruto)
        double impostos = salarioBruto * 0.03;

        // Calcula o salário líquido
        double salarioLiquido = salarioBruto - impostos;

        // Exibe os resultados
        System.out.printf("O salário a receber: %.2f\n", salarioLiquido);
        System.out.printf("O salário bruto: %.2f\n", salarioBruto);
        System.out.printf("Os impostos que serão debitados: %.2f\n", impostos);
    }
}
