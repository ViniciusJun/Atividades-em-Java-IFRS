package Java_I;

public class AreaTriangulo {
    public static void main(String[] args) {
        System.out.println("Informe a base:");
            double base = Double.parseDouble(System.console().readLine());

        System.out.println("Informa o valor da altura:");
            double altura = Double.parseDouble(System.console().readLine());
        
            double area = (base*altura)/2;

        System.out.printf("A área do triangulo informedo é: %.1f\n", area, " cm²");
    }
}
