package Modulo4;

public class decimalParaBinario0a100 {

    public static void main(String[] args) {
        System.out.println("Conversão de números decimais para binário (0 a 100):\n");

        for (int numero = 0; numero <= 100; numero++) {
            String binario = Integer.toBinaryString(numero); // Converte para binário
            System.out.println("Decimal: " + numero + " → Binário: " + binario);
        }

        System.out.println("\nConversão concluída.");
    }
}