package Java_I;

public class AreaQuadrado {
    public static void main(String[] args) {
     
    System.out.println("Informe o valor da lateral do quadrado:");
        double lado = Double.parseDouble(System.console().readLine());
    
    double area = (lado*lado)/2;

    System.out.printf("A área do quadrado informedo é: %.1f\n", area, " cm²");
    }
}
