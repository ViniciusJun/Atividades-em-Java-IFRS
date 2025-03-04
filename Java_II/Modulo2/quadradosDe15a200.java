package Modulo2;
public class quadradosDe15a200 {
    public static void main(String[] args) {
        int numero = 15; // Inicia com 15

        while (numero <= 200) { // Continua até 200
            int quadrado = numero * numero; // Calcula o quadrado do número
            System.out.println("O quadrado de " + numero + " é: " + quadrado);
            numero++; // Incrementa o número para o próximo
        }
    }
}
