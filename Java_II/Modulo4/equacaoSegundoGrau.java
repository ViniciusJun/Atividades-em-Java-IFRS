package Modulo4;

public class equacaoSegundoGrau {
    public static void main(String[] args){
        System.out.println("Equações de Sedundo Grau\n");
        double A = Double.parseDouble(System.console().readLine("Informe o valor de A: "));
        double B = Double.parseDouble(System.console().readLine("Informe o valor de B: "));
        double C = Double.parseDouble(System.console().readLine("Informe o valor de C: "));

        double delta = (Math.pow(B, 2))-(4*A*C);
        
        if (delta < 0) {
            System.out.println("\nA equação não possui raízes reais.");
        } else {
            // Calcula as duas raízes
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.println("\nAs raízes da equação são:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}