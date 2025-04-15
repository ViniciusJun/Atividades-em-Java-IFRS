package Modulo3;

public class os10PrimeirosFibonacci {
  
    public static void main(String[] args) {
        int a = 1, b = 1; 
        int contador = 3; // Para a exibição correta dos somentes 10 primeiros da sequência o contador deve esta com três valores em vez de um.
        
        System.out.print(a + ", " + b + ", "); //Impressão com print não quebra a linha a cada número.
     
        do {
           int proximo = a + b;
           System.out.print(proximo + ", ");
           a = b;
           b = proximo;
           contador++;

        }while (contador <= 10);

    }
}
