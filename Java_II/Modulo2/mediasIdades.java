package Modulo2;

public class mediasIdades {
    public static void main(String[] args) {
        int idade, soma = 0, contador = 0; // Variáveis para armazenar a idade, soma total e contagem de entradas
        
        System.out.println("Digite as idades para calcular a média (digite 0 para encerrar):");

        while (true) { // Laço infinito, controlado pelo break
            idade = Integer.parseInt(System.console().readLine()); // Lê a idade do usuário

            if (idade == 0) { // Se idade for 0, encerra o loop
                break;
            }

            soma += idade; // Soma a idade ao total acumulado
            contador++; // Incrementa o número de idades digitadas
        }

        if (contador > 0) { // Verifica se pelo menos uma idade foi inserida antes do zero
            double media = (double) soma / contador; // Calcula a média convertendo soma para double
            System.out.println("A média das idades digitadas é: " + media);
        } else {
            System.out.println("Nenhuma idade válida foi digitada.");
        }

        System.out.println("Programa encerrado.");
    }
}
