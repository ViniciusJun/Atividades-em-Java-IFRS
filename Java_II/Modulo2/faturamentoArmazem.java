package Modulo2;
public class faturamentoArmazem {
    public static void main(String[] args) {
        System.out.print("Digite o número de mercadorias comercializadas: ");
        int numMercadorias = Integer.parseInt(System.console().readLine()); // Lê o número de mercadorias

        int contador = 1; // Controlador do loop
        double faturamentoTotal = 0; // Variável para armazenar o faturamento total do armazém

        while (contador <= numMercadorias) { // Loop para cada mercadoria
            System.out.print("Digite o nome da mercadoria " + contador + ": ");
            @SuppressWarnings("unused")// suprime o aviso de erro para variavel não usada.
            String nomeMercadoria = System.console().readLine(); // Lê o nome da mercadoria

            System.out.print("Digite o preço unitário da mercadoria " + contador + ": ");
            double precoUnitario = Double.parseDouble(System.console().readLine()); // Lê o preço unitário

            System.out.print("Digite a quantidade vendida da mercadoria " + contador + ": ");
            int quantidadeVendida = Integer.parseInt(System.console().readLine()); // Lê a quantidade vendida

            double faturamentoMercadoria = precoUnitario * quantidadeVendida; // Calcula o faturamento da mercadoria
            faturamentoTotal += faturamentoMercadoria; // Soma ao faturamento total

            contador++; // Incrementa o contador
        }

        System.out.println("\nO faturamento total do armazém no mês foi: R$ " + faturamentoTotal);
    }

}
