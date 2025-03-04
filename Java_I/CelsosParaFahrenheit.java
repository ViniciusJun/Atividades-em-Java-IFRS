package Java_I;

public class CelsosParaFahrenheit {
    public static void main(String[] args) {
        
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = Double.parseDouble(System.console().readLine());

        // Converte Celsius para Fahrenheit
        double fahrenheit = ((9 * celsius) / 5) + 32;

        // Exibe o resultado
        System.out.println("A conversão da temperatura de Celsius para Fahrenheit é: " + fahrenheit + "°F");

    }
}