package Java_III.Modulo3;

public class matrizMultiplicaMaior {
    public static void main(String[] args) {
        int[][] matriz = new int[6][4];
        int[] maiores = new int[6];

        // Entrada dos dados
        for (int i = 0; i < 6; i++) {
            System.out.println("Linha " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(System.console().readLine());
            }
        }

        // Encontrar o maior valor de cada linha
        for (int i = 0; i < 6; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            maiores[i] = maior;
        }

        // Multiplicar os elementos da linha pelo maior valor da linha
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= maiores[i];
            }
        }

        // Mostrar a matriz resultante
        System.out.println("\nMatriz resultante:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

