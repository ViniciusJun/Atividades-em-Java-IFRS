package Modulo1;

public class divisivelPor2ou3 {
    public static void main(String[] args) {
        // Leitura dos quatro valores inteiros
        int num1 = Integer.parseInt(System.console().readLine("Digite o primeiro numero: "));
        int num2 = Integer.parseInt(System.console().readLine("Digite o segundo numero: "));
        int num3 = Integer.parseInt(System.console().readLine("Digite o terceiro numero: "));
        int num4 = Integer.parseInt(System.console().readLine("Digite o quarto numero: "));
        
        // Exibicao dos numeros divisiveis por 2 e 3
        System.out.println("Numeros divisiveis por 2 ou 3:");
        
        if (num1 % 2 == 0 || num1 % 3 == 0) {
            System.out.println("O numero "+num1+" e divisivel por 2 ou 3.");
        }else{
            System.out.println("O numero "+num1+" nao e divisivel por 2 ou 3.");
        }
        if (num2 % 2 == 0 || num2 % 3 == 0) {
            System.out.println("O numero "+num2+" e divisivel por 2 ou 3.");
        }else{
            System.out.println("O numero "+num2+" nao e divisivel por 2 ou 3.");
        }
        if (num3 % 2 == 0 || num3 % 3 == 0) {
            System.out.println("O numero "+num3+" e divisivel por 2 ou 3.");
        }else{
            System.out.println("O numero "+num3+" nao e divisivel por 2 ou 3.");
        }
        if (num4 % 2 == 0 || num4 % 3 == 0) {
            System.out.println("O numero "+num4+" e divisivel por 2 ou 3.");
        }else{
            System.out.println("O numero "+num4+" nao e divisivel por 2 ou 3.");
        }
    }
}
