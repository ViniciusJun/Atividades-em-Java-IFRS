package Modulo1;

public class verificaTriangulo {
    public static void main(String[] args) {
        // Leitura dos lados A, B e C
        int a = Integer.parseInt(System.console().readLine("Digite o valor do lado A: "));
        int b = Integer.parseInt(System.console().readLine("Digite o valor do lado B: "));
        int c = Integer.parseInt(System.console().readLine("Digite o valor do lado C: "));
        
        // Verificacao se os lados formam um triangulo
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os lados formam um triangulo.");
        } else {
            System.out.println("Os valores informados nao podem formar um triangulo.");
        }
    }
}
