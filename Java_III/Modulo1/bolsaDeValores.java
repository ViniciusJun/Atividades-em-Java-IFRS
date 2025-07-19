package Java_III.Modulo1;

public class bolsaDeValores {
    public static void main(String[] args) {
        String tipo;
        int acima1000 = 0, abaixo200 = 0;
        double compra, venda, lucro;

        // Início do loop
        do {
            tipo = System.console().readLine("Digite o tipo da ação (ou F para finalizar): ");
            
            // Só processa se não for "F"
            if (!tipo.equalsIgnoreCase("F")) {
                compra = Double.parseDouble(System.console().readLine("Digite o preço de compra: "));
                venda = Double.parseDouble(System.console().readLine("Digite o preço de venda: "));

                lucro = venda - compra;

                if (lucro > 1000) {
                    acima1000++;
                } else if (lucro < 200) {
                    abaixo200++;
                }
            }

        } while (!tipo.equalsIgnoreCase("F"));  // Repete enquanto tipo for diferente de "F"

        System.out.println("Fim do Programa");

        // Resultado final
        System.out.println("\nQuantidade de ações com lucro superior a R$1000,00: " + acima1000);
        System.out.println("Quantidade de ações com lucro inferior a R$200,00: " + abaixo200);
    }
}
