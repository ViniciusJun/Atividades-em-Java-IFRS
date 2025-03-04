package Modulo2;

public class calculosNumericos {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro positivo:");
        int n = Integer.parseInt(System.console().readLine());

        int contador = 1;
        int soma = 0;
        int somaQuadrados = 0;

        while (contador <= n) {
            soma = soma + contador;
            somaQuadrados = somaQuadrados + (contador * contador);
            contador = contador + 1;
        }

        double media = (double) soma/n; //* Para a conversão de tipos garantir que o resultado seja decimal, usamos type casting explícito convertendo soma para double antes da divisão (double) */ 

        System.out.println("Somatório dos números: " + soma);
        System.out.println("Soma dos quadrados: " + somaQuadrados);
        System.out.println("Média dos números: " + media);
    }
}
