package Java_III.Modulo3;

public class somaDiagonalSecundaria {
    public static void main(String[] args) {
        double[][] matriz = new double[5][5];
        double soma = 0;

        // Preenchendo a matriz com valores informados pelo usuário
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = Double.parseDouble(System.console().readLine());
            }
        }

        // Calculando a soma da diagonal secundária
        for (int i = 0; i < 5; i++) {
            soma += matriz[i][4 - i]; // diagonal secundária: [0][4], [1][3], ..., [4][0]
        }

        // Exibindo o resultado
        System.out.println("\nA soma dos elementos da diagonal secundária é: " + soma);
    }
}
