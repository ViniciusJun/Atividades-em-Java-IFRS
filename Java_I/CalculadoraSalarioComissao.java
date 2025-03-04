package Java_I;

public class CalculadoraSalarioComissao {
    public static void main(String[] args) {
        System.out.println("Escreva seu salario:");
            double salario_fixo = Double.parseDouble(System.console().readLine());
        System.out.println("Qual foi o valor de lsuas vendas diarias?");
            double vendas = Double.parseDouble(System.console().readLine());
        
        double comissao = vendas*0.04;

        System.out.printf("O valor de comissão correspondente as vendas diárias de hoje é: %.2f\n",comissao);

        System.out.printf("somando com seu salário fica: %.2f\n", (comissao+salario_fixo));
    }
}
