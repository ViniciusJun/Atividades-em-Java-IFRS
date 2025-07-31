public class substituirNegativos {

    // Procedimento que substitui negativos por zero
    public static void substituirNegativosPorZero(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                A[i] = 0;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int[] vetor = new int[25];

        System.out.println("Digite 25 números inteiros:");

        // Leitura dos 25 números inteiros
        for (int i = 0; i < vetor.length; i++) {
            // Usando System.console() para ler, conforme seu pedido anterior
            vetor[i] = Integer.parseInt(System.console().readLine());
        }

        // Chama o procedimento para substituir negativos
        substituirNegativosPorZero(vetor);

        // Mostra o vetor resultante
        System.out.println("Vetor após substituir valores negativos por zero:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}
