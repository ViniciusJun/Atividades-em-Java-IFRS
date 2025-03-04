package Java_I;

public class CalculadoraSalarios {
    public static void main(String[] args) {

        System.out.println("Qual é seu salário?");
            double Salario_base = Double.parseDouble(System.console().readLine());

        double Taxa = 0.7*Salario_base;
        double Bonus = 0.5*Salario_base;
        double Salario_liquido = (Salario_base + Bonus) - Taxa;
        System.out.println("O salário líquido é de:");
            System.out.println(Salario_liquido);
    }
}
