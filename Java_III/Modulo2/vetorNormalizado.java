package Java_III.Modulo2;

public class vetorNormalizado {
    
    public static void main(String[] args) {
        int[] original = new int[20];
        double[] normalizado = new double[20];

        // Leitura dos elementos do vetor
        for (int i = 0; i < original.length; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            original[i] = Integer.parseInt(System.console().readLine());
        }

        // Encontrar o maior valor do vetor
        int maior = original[0];
        for (int i = 1; i < original.length; i++) {
            if (original[i] > maior) {
                maior = original[i];
            }
        }

        // Dividir todos os elementos pelo maior valor e armazenar no vetor normalizado
        for (int i = 0; i < original.length; i++) {
            normalizado[i] = (double) original[i] / maior;
        }

        // Mostrar os valores do vetor normalizado
        System.out.println("\nValores normalizados (divididos pelo maior valor):");
        for (int i = 0; i < normalizado.length; i++) {
            System.out.printf("normalizado[%d] = %.4f\n", i, normalizado[i]);
        }
    }
}
