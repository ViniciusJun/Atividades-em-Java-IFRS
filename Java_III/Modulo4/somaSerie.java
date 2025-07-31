public class somaSerie {

    // Método para calcular o fatorial de um número
    public static long fatorial(int n) {
        long fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        double soma = 0;

        for (int i = 0; i <= 20; i++) {
            int numerador = 100 - i;
            long denominador = fatorial(i);
            soma += (double) numerador / denominador;
        }

        System.out.printf("A soma da série é: %.10f%n", soma);
    }
}
