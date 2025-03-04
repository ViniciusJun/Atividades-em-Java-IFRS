package Java_I;

public class MediaTresNotas {
    public static void main(String[] args) {
        System.out.println("Digite o primeira nota:");
            double nota1 = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o segunda nota:");
            double nota2 = Double.parseDouble(System.console().readLine());
        System.out.println("Digite a terceira nota:");
            double nota3 = Double.parseDouble(System.console().readLine());
        System.out.println("A subtração entre os números informados é:");
            double media = (nota1+nota2+nota3)/3;
            System.out.printf("Media das notas = %.1f\n", media);
    }
}
