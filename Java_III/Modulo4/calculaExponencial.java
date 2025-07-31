public class calculaExponencial {
    
    // Método para calcular o fatorial de um número
    public static long fatorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Leitura do valor de x (usando System.console())
        System.out.print("Informe o valor de x: ");
        int x = Integer.parseInt(System.console().readLine());

        double resultado = 0.0;

        // Calcular a série até o 15º termo (n=0 a n=14)
        for (int n = 0; n < 15; n++) {
            double termo = Math.pow(x, n) / fatorial(n);
            resultado += termo;
        }

        System.out.println("O valor aproximado de e^" + x + " é: " + resultado);
    }
}
