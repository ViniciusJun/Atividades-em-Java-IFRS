package Java_III.Modulo1;

public class numeroPrimo {
    public static void main(String[] args) {
        System.out.print("Digite um número inteiro maior que 1: ");
        int numero = Integer.parseInt(System.console().readLine());

        if (numero <= 1) {
            System.out.println("Número inválido! Digite um número maior que 1.");
            return;
        }

        boolean ehPrimo = true;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}

