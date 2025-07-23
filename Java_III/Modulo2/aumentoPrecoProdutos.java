package Java_III.Modulo2;

public class aumentoPrecoProdutos {
    
    public static void main(String[] args){
        //declaração dos vetores.
        String produtos[] = new String[10];
        int codigo[] = new int[10];
        double preco[] = new double[10];
        double novoPreco[] = new double[10];

        //Solicita ao usuário o nome, código e valores dos 10 produtos.
        for (int pos = 0; pos < produtos.length; pos++) {
            System.out.println("Insira o nome do produto " + (pos) + " da lista: ");
            produtos[pos] = System.console().readLine();

            System.out.println("Informe o codigo do produto " + (pos) + " da lista: ");
            codigo[pos] = Integer.parseInt(System.console().readLine());

            System.out.println("Informe o valor do produto " + (pos) + " da lista: ");
            preco[pos] = Double.parseDouble(System.console().readLine());

            //Classifica se o produto terá aumento com base no preço e código.
            if ((preco[pos] >= 1000) && (codigo[pos] % 2 == 0)) {
                 novoPreco[pos] = (preco[pos] + (preco[pos] * 0.20));

            } else if (codigo[pos] % 2 == 0) {
                novoPreco[pos] = (preco[pos-1] + (preco[pos] * 0.15));

            } else if (preco[pos] >= 1000) {
                novoPreco[pos] = (preco[pos] + (preco[pos] * 0.10));

            } else {
                novoPreco[pos] = preco[pos];
            }  
        }

        //Impressão do relatório final.
        System.out.println("\n********** Relatório **********");

        for (int i = 0; i < preco.length; i++) {
            if (novoPreco[i] > preco[i]) {
                System.out.printf("Item: %s | Código: %d | Preço: R$ %.2f | Novo Preço: R$ %.2f\n", produtos[i], codigo[i], novoPreco[i]);

            } else {
                System.out.printf("Item: %s | Código: %d | Preço: R$ %.2f | Novo Preço: R$ %.2f\n", produtos[i], codigo[i], preco[i]);
            }
        }
        System.out.println("*************************************");

        // Finaliza o programa
        System.out.println("Fim do programa.");

    }
}
