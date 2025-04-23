package Modulo4;

public class BinarioParaDecimal {

    public static void main(String[] args) {
        System.out.println("Conversao de numeros binarios para decimais:\n");

        String resp = System.console().readLine("Quer comecar? (Y/N) ");
        boolean opcao;

        if (resp.equalsIgnoreCase("y")) {
            opcao = true;
        } else {
            opcao = false;
        }

        while (opcao) {
            String binario = System.console().readLine("Digite um numero binario: ");

            try {
                // Converte o binario para decimal
                int decimal = Integer.parseInt(binario, 2);
                System.out.println("Binario: " + binario + " -> Decimal: " + decimal);
            } catch (NumberFormatException e) {
                System.out.println("Erro: valor digitado nao e um numero binario valido.");
            }

            String continuar = System.console().readLine("Deseja converter outro numero? (Y/N) ");
            opcao = continuar.equalsIgnoreCase("y"); // Atualiza a decisao
        }

        System.out.println("\nConversao concluida.");
    }
}
