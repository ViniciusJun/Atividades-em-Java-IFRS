package Java_III.Modulo3;

public class mediaDiagonalPrincipal {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int somaDiagonal = 0;
        int elementos = 10; // sempre 10 na diagonal principal de uma matriz 10x10

        // Preenchendo a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(System.console().readLine());

                // Se for posição da diagonal principal
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }

        double media = (double) somaDiagonal / elementos;

        System.out.println("\nA média dos elementos da diagonal principal é: " + media);
    }
}
