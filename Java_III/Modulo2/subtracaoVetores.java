package Java_III.Modulo2;

public class subtracaoVetores {
    
    public static void main(String[] args) {
        
        //declaração de vetores.
        int A[] = new int[5];
        int B[] = new int[5];
        int resultados[] = new int[5];

        //Coleta do usuário os valores dos vetores A[] e B[].
        for (int i = 0; i < A.length; i++) {
            System.out.println("Informe o " + (i+1) + "° valor do vetor A[]: ");
            A[i] = Integer.parseInt(System.console().readLine());
        }
        for (int e = 0; e < A.length; e++) {
            System.out.println("Informe o " + (e+1) + "° valor do vetor B[]: ");
            B[e] = Integer.parseInt(System.console().readLine());
        }

        //Subtrai os valores de A[] com B[] em decremento do indice de B[4 - x] e armazena no vetor resusltados[].
        for (int x = 0; x < A.length; x++) {
            resultados[x] = A[x] - B[4 - x];
        }

        //Imprime os resultados das subtrações.
        for (int a = 0; a < resultados.length; a++) {
            System.out.println(A[a] + " - " + B[4 - a] + " = " + resultados[a]);
        }
    }
}
