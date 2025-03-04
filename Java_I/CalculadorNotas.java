package Java_I;

public class CalculadorNotas {
    public static void main(String[] args) {
        
        System.out.println("Informe a primeira nota:");
            double nota1 = Double.parseDouble(System.console().readLine());
        System.out.println("Informe o peso desta nota:");
            int peso1 = Integer.parseInt(System.console().readLine());

        System.out.println("Informe a segunda nota:");
            double nota2 = Double.parseDouble(System.console().readLine());
        System.out.println("Informe o peso desta nota:");
            int peso2 = Integer.parseInt(System.console().readLine());

        System.out.println("Informe a terceira nota:");
            double nota3 = Double.parseDouble(System.console().readLine());
        System.out.println("Informe o peso desta nota:");
            int peso3 = Integer.parseInt(System.console().readLine());

        double calculo = (nota1*peso1)+(nota2*peso2)+(nota3*peso3);
        int peso_total = peso1+peso2+peso3;
        double media = calculo/peso_total;

        System.out.printf("A média das tres notas lenvando em consideração os pesos é: %.1f\n", media);
    }
}
