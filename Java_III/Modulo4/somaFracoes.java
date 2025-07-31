public class somaFracoes {

    // Função para calcular o MMC de dois números
    public static int mmc(int a, int b) {
        return (a * b) / mdc(a, b);
    }

    // Função auxiliar para calcular o MDC (máximo divisor comum)
    public static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Informe o numerador da primeira fração:");
        int n1 = Integer.parseInt(System.console().readLine());

        System.out.println("Informe o denominador da primeira fração:");
        int d1 = Integer.parseInt(System.console().readLine());

        System.out.println("Informe o numerador da segunda fração:");
        int n2 = Integer.parseInt(System.console().readLine());

        System.out.println("Informe o denominador da segunda fração:");
        int d2 = Integer.parseInt(System.console().readLine());

        // Calcula o denominador comum (MMC)
        int dr = mmc(d1, d2);

        // Calcula o numerador resultante
        int nr = (dr / d1) * n1 + (dr / d2) * n2;

        System.out.println("Resultado da soma das frações:");
        System.out.println(nr + " / " + dr);
    }
}
