package Modulo2;

public class quadradosNumericos {
    public static void main(String[] args) {
        System.out.println("Digite números inteiros para ver seus quadrados (digite um número negativo para sair): ");
     
        int numero; // Variável para armazenar o número digitado
   
       while (true) { // Laço infinito, controlado por uma condição dentro do loop
           numero = Integer.parseInt(System.console().readLine()); // Lê o número digitado pelo usuário
           
           if (numero < 0) { // Se for negativo, interrompe o loop
               break;
           }
   
           int quadrado = numero * numero; // Calcula o quadrado do número
           System.out.println("O quadrado de " + numero + " é: " + quadrado);
       }
   
       System.out.println("Programa encerrado.");
    }
}
