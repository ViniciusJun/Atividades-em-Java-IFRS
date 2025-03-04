package Modulo1;

public class verificaFaixa {
    public static void main(String[] args) {
        // Leitura do valor
        int valor = Integer.parseInt(System.console().readLine("Digite um valor inteiro: "));
        
        // Verificação da faixa
        if (valor >= 1 && valor <= 9) {
            System.out.println("O valor está na faixa permitida");
        } else {
            System.out.println("O valor está fora da faixa permitida");
        }
    }
}
