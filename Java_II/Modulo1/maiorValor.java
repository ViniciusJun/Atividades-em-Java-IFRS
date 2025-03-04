package Modulo1;

public class maiorValor {
    public static void main(String[] args) {
        // Leitura dos três valores inteiros
        int num1 = Integer.parseInt(System.console().readLine("Digite o primeiro número: "));
        int num2 = Integer.parseInt(System.console().readLine("Digite o segundo número: "));
        int num3 = Integer.parseInt(System.console().readLine("Digite o terceiro número: "));
        
        // Identificação do maior valor
        int maior = 0;
        
        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
            System.out.println("O maior valor informado é: " + maior);
        }else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
            System.out.println("O maior valor informado é: " + maior);
        }else {
            maior = num3;
            System.out.println("O maior valor informado é: " + maior);
        }
    }
}
