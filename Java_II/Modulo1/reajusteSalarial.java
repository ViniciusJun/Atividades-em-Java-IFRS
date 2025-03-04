package Modulo1;

public class reajusteSalarial {
    public static void main(String[] args) {
        // Leitura do salário atual
        double salario = Double.parseDouble(System.console().readLine("Digite o salário do funcionário: "));
        
        // Verificação e cálculo do reajuste
        if (salario < 5000) {
            salario *= 1.3; // Aumento de 30%
        }
        
        // Exibição do salário reajustado
        System.out.println("O salário reajustado é: R$ " + salario);
    }
}
