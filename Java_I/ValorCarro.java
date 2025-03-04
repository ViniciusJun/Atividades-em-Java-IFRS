package Java_I;

public class ValorCarro {
    public static void main(String[] args) {

        System.out.print("Digite o valor do preço de fábrica: ");
        double valorFabrica = Double.parseDouble(System.console().readLine());

        System.out.print("Digite o valor da taxa (%): ");
        double taxa = Double.parseDouble(System.console().readLine())/100; // Converte para decimal

        System.out.print("Digite o valor da margem de lucro (%): ");
        double lucro = Double.parseDouble(System.console().readLine())/100; // Converte para decimal

        // Calcula o preço na loja considerando o lucro
        double precoLoja = valorFabrica + (valorFabrica*lucro);

        // Calcula o preço de venda considerando a taxa de impostos
        double precoVenda = precoLoja + (precoLoja*taxa);

        // Exibe os resultados
        System.out.printf("O valor correspondente ao lucro do distribuidor: %.2f\n", (valorFabrica*lucro));
        System.out.printf("O valor correspondente aos impostos: %.2f\n", (precoLoja*taxa));
        System.out.printf("O valor final do produto: %.2f\n", precoVenda);
    }
}
