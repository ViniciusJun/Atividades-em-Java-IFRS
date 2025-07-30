package Java_III.Modulo3;

public class concursoInformatica {
    public static void main(String[] args) {
        char[][] respostas = new char[10][10]; // respostas dos candidatos
        char[] gabarito = new char[10];        // gabarito da prova
        int[] pontuacao = new int[10];         // pontuação de cada candidato

        // Leitura do gabarito
        System.out.println("Digite o gabarito da prova (A, B, C, D ou E):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = System.console().readLine().toUpperCase().charAt(0);
        }

        // Leitura das respostas dos candidatos
        for (int i = 0; i < 10; i++) {
            System.out.println("\nRespostas do Candidato " + (i + 1) + ":");
            for (int j = 0; j < 10; j++) {
                System.out.print("Questão " + (j + 1) + ": ");
                respostas[i][j] = System.console().readLine().toUpperCase().charAt(0);
            }
        }

        // Cálculo da pontuação de cada candidato
        for (int i = 0; i < 10; i++) {
            int pontos = 0;
            for (int j = 0; j < 10; j++) {
                if (respostas[i][j] == gabarito[j]) {
                    pontos++;
                }
            }
            pontuacao[i] = pontos;
        }

        // Exibindo os resultados
        System.out.println("\nPontos obtidos por cada candidato:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + pontuacao[i] + " ponto(s)");
        }
    }
}
