package Java_III.Modulo3;

public class situacaoalunos {
    public static void main(String[] args) {
        String[] nomes = new String[15];         // Vetor de nomes
        double[][] notas = new double[15][5];    // Matriz de notas
        double[] medias = new double[15];        // Vetor de médias

        // Leitura dos nomes dos alunos
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = System.console().readLine();
        }

        // Leitura das notas
        for (int i = 0; i < 15; i++) {
            System.out.println("Notas do aluno " + nomes[i] + ":");
            double soma = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print("Nota da prova " + (j + 1) + ": ");
                notas[i][j] = Double.parseDouble(System.console().readLine());
                soma += notas[i][j];
            }
            medias[i] = soma / 5;
        }

        // Exibindo resultado final
        System.out.println("\nResultado final:");
        for (int i = 0; i < 15; i++) {
            String situacao;
            if (medias[i] >= 7) {
                situacao = "Aprovado";
            } else if (medias[i] < 2) {
                situacao = "Reprovado";
            } else {
                situacao = "Exame";
            }

            System.out.printf("Aluno: %-15s | Média: %.2f | Situação: %s%n", nomes[i], medias[i], situacao);
        }
    }
}
