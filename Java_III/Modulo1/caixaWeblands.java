package Java_III.Modulo1;

public class caixaWeblands {
    public static void main(String[] args) {
        int notas50 = 100, notas10 = 100, notas5 = 100, notas1 = 100;
        int limiteSaques = 100, contadorSaques = 0;
        int valor;

        System.out.println("=== Caixa Eletrônico Weblands ===");

        while (contadorSaques < limiteSaques) {
            System.out.print("\nDigite o valor a sacar (ou negativo para sair): ");
            valor = Integer.parseInt(System.console().readLine());

            if (valor < 0) {
                System.out.println("Encerrando operações...");
                break;
            }

            if (valor > 1000) {
                System.out.println("Valor máximo permitido por saque é B$1000,00.");
                continue;
            }

            // Cópias para simulação sem alterar o caixa real
            int n50 = notas50, n10 = notas10, n5 = notas5, n1 = notas1;
            int v = valor;

            // Cálculo simulado para verificar se há notas suficientes
            int usar50 = Math.min(v / 50, n50);
            v -= usar50 * 50;

            int usar10 = Math.min(v / 10, n10);
            v -= usar10 * 10;

            int usar5 = Math.min(v / 5, n5);
            v -= usar5 * 5;

            int usar1 = Math.min(v / 1, n1);
            v -= usar1 * 1;

            if (v != 0) {
                System.out.println("Não há notas suficientes para realizar esse saque.");
                continue;
            }

            // Atualiza o caixa
            notas50 -= usar50;
            notas10 -= usar10;
            notas5 -= usar5;
            notas1 -= usar1;

            contadorSaques++;

            // Exibe resultado do saque
            System.out.println("Notas fornecidas:");
            if (usar50 > 0) System.out.println(usar50 + " nota(s) de B$50");
            if (usar10 > 0) System.out.println(usar10 + " nota(s) de B$10");
            if (usar5 > 0) System.out.println(usar5 + " nota(s) de B$5");
            if (usar1 > 0) System.out.println(usar1 + " nota(s) de B$1");
        }

        // Exibe o total restante
        System.out.println("\n=== Relatório Final do Caixa ===");
        System.out.println("Restam " + notas50 + " nota(s) de B$50");
        System.out.println("Restam " + notas10 + " nota(s) de B$10");
        System.out.println("Restam " + notas5 + " nota(s) de B$5");
        System.out.println("Restam " + notas1 + " nota(s) de B$1");
    }
}

