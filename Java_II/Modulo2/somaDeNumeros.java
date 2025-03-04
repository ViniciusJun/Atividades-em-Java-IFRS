package Modulo2;

public class somaDeNumeros {

    public static void main(String[] args) {
        int contador = 0; // Contador para controlar a quantidade de números inseridos
        double soma = 0;  // Variável que acumula a soma dos números

        while (contador < 10) { // Laço de repetição controlado pelo contador
            System.out.print("Digite um número: ");
            double numero = Double.parseDouble(System.console().readLine()); // Lê um número do usuário
            soma = soma + numero; // Adiciona o número à soma total
            contador++; // Incrementa o contador
        }

        System.out.println("A soma dos números fornecidos é: " + soma);
    }
}