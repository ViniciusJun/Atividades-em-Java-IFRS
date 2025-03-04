package Modulo1;

public class divisivelPor2e3 {
    public static void main(String[] args) {
        // Leitura dos quatro valores inteiros
        int num1 = Integer.parseInt(System.console().readLine("Digite o primeiro número: "));
        int num2 = Integer.parseInt(System.console().readLine("Digite o segundo número: "));
        int num3 = Integer.parseInt(System.console().readLine("Digite o terceiro número: "));
        int num4 = Integer.parseInt(System.console().readLine("Digite o quarto número: "));
        
        // Exibição dos números divisíveis por 2 e 3
        System.out.println("Números divisíveis por 2 e 3:");
        
        if (num1 % 2 == 0 && num1 % 3 == 0) {
            System.out.println("O número "+num1+" é divisivel por 2 e 3.");
        }else{
            System.out.println("O número "+num1+" não é divisivel por 2 e 3.");
        }
        if (num2 % 2 == 0 && num2 % 3 == 0) {
            System.out.println("O número "+num2+" é divisivel por 2 e 3.");
        }else{
            System.out.println("O número "+num2+" não é divisivel por 2 e 3.");
        }
        if (num3 % 2 == 0 && num3 % 3 == 0) {
            System.out.println("O número "+num3+" é divisivel por 2 e 3.");
        }else{
            System.out.println("O número "+num3+" não é divisivel por 2 e 3.");
        }
        if (num4 % 2 == 0 && num4 % 3 == 0) {
            System.out.println("O número "+num4+" é divisivel por 2 e 3.");
        }else{
            System.out.println("O número "+num4+" não é divisivel por 2 e 3.");
        }
    }
}
