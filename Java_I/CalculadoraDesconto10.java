package Java_I;

public class CalculadoraDesconto10 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Informe o preço do produto que receberá o desconto:");
        double preco= Double.parseDouble(System.console().readLine());
        System.out.println("O novo preço do produto é:");
        double desconto = 0.1;
        double novoPreco = preco-(preco*desconto);
        System.out.println(novoPreco);
    }
}
