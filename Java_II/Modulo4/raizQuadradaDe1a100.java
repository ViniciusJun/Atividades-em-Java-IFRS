package Modulo4;

public class raizQuadradaDe1a100 {

    public static void main(String[] args){
        int cont = 1;
        System.out.println("Calculo da raiz quadrada de 1 a 100.");

        do {

            System.out.println("A raiz quadrada de " + cont + " é " + (Math.sqrt(cont)));
            cont++; // Incrementa a variável cont somando ao valor dela mais 1.
        } while (cont <= 100);
    }
}