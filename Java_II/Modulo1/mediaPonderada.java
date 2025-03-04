package Modulo1;

public class mediaPonderada {
    public static void main(String[] args) {
        // Leitura das três notas
        double notaLaboratorio = Double.parseDouble(System.console().readLine("Digite a nota do Trabalho de Laboratório: "));
        double notaSemestral = Double.parseDouble(System.console().readLine("Digite a nota da Avaliação Semestral: "));
        double notaExameFinal = Double.parseDouble(System.console().readLine("Digite a nota do Exame Final: "));
        
        // Cálculo da média ponderada
        double media = (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
        
        // Determinação do conceito
        char conceito;
        if (media >= 8.0 && media <= 10.0) {
            conceito = 'A';
        } else if (media >= 7.0) {
            conceito = 'B';
        } else if (media >= 6.0) {
            conceito = 'C';
        } else if (media >= 5.0) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }
        
        // Exibição da média e conceito
        System.out.println("Média Ponderada: " + media);
        System.out.println("Conceito: " + conceito);
    }
}
