package Java_I;

public class SubtracaoDoisNumeros {
    public static void main(String[] args) {
        
        System.out.println("Digite o primeiro número:");
        int Num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o segundo número:");
        int Num2 = Integer.parseInt(System.console().readLine());
        int Resp = Num1-Num2;
        System.out.println("A subtração entre os números informados é:");
        System.out.println(Resp);
        
    }
}
