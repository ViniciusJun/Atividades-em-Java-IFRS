package Java_III.Modulo1;

public class folhaDePagamento {
    public static void main(String[] args) {
        String resp;
        boolean continuar;

        // Acumuladores para totalizar os valores da folha
        double totalFolha = 0.0;        // Soma dos salários brutos
        double totalIRF = 0.0;          // Soma dos descontos de IRF
        double totalSaude = 0.0;        // Soma dos descontos do plano de saúde

        do {
            // Pergunta ao usuário se deseja iniciar
            System.out.println("Quer iniciar o cálculo da folha? (S/N): ");
            resp = System.console().readLine();

            continuar = !resp.equalsIgnoreCase("n");

            // Laço principal para processar os salários
            while (continuar) {
                // Entrada do salário bruto
                System.out.println("Informe o salário bruto: R$ ");
                double salario = Double.parseDouble(System.console().readLine());

                double irf = 0;
                double taxa = 0;
                double descontoSaude = salario * 0.045; // 4 +5% de desconto fixo
                double salarioLiquido;

                // Cálculo da alíquota e valor do IRF
                if (salario > 4664.68) {
                    taxa = 27.5;
                } else if (salario > 3751.06 && salario <= 4664.68) {
                    taxa = 22.5;
                } else if (salario > 2826.66 && salario <= 3751.06) {
                    taxa = 15;
                } else if (salario > 1903.99 && salario <= 2826.66) {
                    taxa = 7.5;
                } else {
                    taxa = 0;
                }

                irf = salario * (taxa / 100);
                salarioLiquido = salario - irf - descontoSaude;

                // Exibe os resultados detalhados
                System.out.println("\n==========================================");
                System.out.printf("Salário Bruto   : R$ %.2f%n", salario);
                System.out.printf("Desconto IRF    : R$ %.2f%n", taxa + irf);
                System.out.printf("Desconto Saúde  : R$ %.2f%n", descontoSaude);
                System.out.printf("Salário Líquido : R$ %.2f%n", salarioLiquido);
                System.out.println("==========================================");

                // Atualiza os acumuladores
                totalFolha += salario;
                totalIRF += irf;
                totalSaude += descontoSaude;

                // Pergunta se deseja continuar
                resp = System.console().readLine("Deseja continuar? (S/N): ");
                continuar = !resp.equalsIgnoreCase("n");
            }

        } while (!resp.equalsIgnoreCase("n"));

        // Exibe os totais da folha de pagamento
        System.out.println("\n********** RESUMO DA FOLHA **********");
        System.out.printf("Total da folha (bruto)   : R$ %.2f%n", totalFolha);
        System.out.printf("Total do IRF descontado  : R$ %.2f%n", totalIRF);
        System.out.printf("Total do plano de saúde  : R$ %.2f%n", totalSaude);
        System.out.printf("Total de descontos       : R$ %.2f%n", totalIRF + totalSaude);
        System.out.printf("Total líquido da folha   : R$ %.2f%n", (totalFolha - totalIRF - totalSaude));
        System.out.println("*************************************");

        // Finaliza o programa
        System.out.println("Fim do programa.");
    }
}
