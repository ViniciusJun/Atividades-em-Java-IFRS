package Modulo4;

public class operacoesDoisNumeros {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(System.console().readLine("Digite o primeiro número: "));
        int num2 = Integer.parseInt(System.console().readLine("Digite o segundo número: "));

        // Menu de opções
        System.out.println("Escolha uma das opções:");
        System.out.println("1 - O primeiro número elevado ao segundo número");
        System.out.println("2 - Raiz quadrada de cada número");
        System.out.println("3 - Raiz cúbica de cada número");

        int opcao = Integer.parseInt(System.console().readLine("Digite sua opção (1, 2 ou 3): "));

        
        switch (opcao) { // Estrutura condicional para executar a operação escolhida
            case 1:
                double potencia = Math.pow(num1, num2);
                System.out.println("Resultado: " + num1 + " elevado a " + num2 + " = " + potencia);
                break;
            case 2:
                double raiz1 = Math.sqrt(num1);
                double raiz2 = Math.sqrt(num2);
                System.out.println("Raiz quadrada de " + num1 + " = " + raiz1);
                System.out.println("Raiz quadrada de " + num2 + " = " + raiz2);
                break;
            case 3:
                double raizCubica1 = Math.cbrt(num1);
                double raizCubica2 = Math.cbrt(num2);
                System.out.println("Raiz cúbica de " + num1 + " = " + raizCubica1);
                System.out.println("Raiz cúbica de " + num2 + " = " + raizCubica2);
                break;
            default:
                System.out.println("Opção inválida. O programa será encerrado.");
                break;
        }
    }
}
