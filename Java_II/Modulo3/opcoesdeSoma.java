package Modulo3;

public class opcoesdeSoma {
    
    public static void main(String[] args) {
        int resultado, num1, num2, opcao = 0;

        System.out.println("Menu de opções:");
        System.out.println("1. Somar dois números.");
        System.out.println("2. Número ao quadrado.");
        System.out.println("Digite a opção desejada: ");
        opcao = Integer.parseInt(System.console().readLine());
        
        switch (opcao) {
           case 1:
              System.out.println("Digite o primeiro número: ");
              num1 = Integer.parseInt(System.console().readLine());
              System.out.println("Digite o segundo número: ");
              num2 = Integer.parseInt(System.console().readLine());
              resultado = num1 + num2;
              System.out.println("A soma é: " + resultado);
            break;
           case 2:
              System.out.println("Digite o número: ");
              num1 = Integer.parseInt(System.console().readLine());
              resultado = num1 * num1;
              System.out.println("O quadrado do número é: " + resultado);
            break;
            default:
                System.out.println("Opção inválida."); 
            break;
        }           
    }
}

