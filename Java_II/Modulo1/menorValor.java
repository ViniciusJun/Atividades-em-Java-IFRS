package Modulo1;

public class menorValor {
    public static void main(String[] args) {
        // Leitura dos três valores inteiros
        int num1 = Integer.parseInt(System.console().readLine("Digite o primeiro número: "));
        int num2 = Integer.parseInt(System.console().readLine("Digite o segundo número: "));
        int num3 = Integer.parseInt(System.console().readLine("Digite o terceiro número: "));
        
        // Identificação do menor valor
        int menor = 0;
        
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            System.out.println("O menor valor informado é: " + menor);
        }else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            System.out.println("O menor valor informado é: " + menor);
        }else {
            menor = num3;
            System.out.println("O menor valor informado é: " + menor);
        }
    }
}
