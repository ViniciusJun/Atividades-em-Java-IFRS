package Modulo1;

public class calculoDelta {
    public static void main(String[] args) {
        // Leitura dos coeficientes A, B e C
        int a = Integer.parseInt(System.console().readLine("Digite o coeficiente A: "));
        int b = Integer.parseInt(System.console().readLine("Digite o coeficiente B: "));
        int c = Integer.parseInt(System.console().readLine("Digite o coeficiente C: "));
        
        // Cálculo do delta (Δ = b² - 4ac)
        int delta = (b * b) - (4 * a * c);
        
        // Verificação da quantidade de raízes reais
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta > 0) {
            System.out.println("A equação possui duas raízes reais.");
        } else {
            System.out.println("A equação possui uma única raiz real.");
        }
    }
}
