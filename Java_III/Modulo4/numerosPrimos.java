public class numerosPrimos {

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false; // números menores ou iguais a 1 não são primos
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // divisível por outro número, não é primo
            }
        }
        return true; // se não encontrou divisor, é primo
    }

    public static void main(String[] args) {
        System.out.println("Números primos de 1 a 100:");
        for (int i = 1; i <= 100; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
