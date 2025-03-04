package Java_I;

public class CalculadoraIdade {
    public static void main(String[] args) {

        System.out.print("Digite o ano em que você nasceu: ");
        int nascimento = Integer.parseInt(System.console().readLine());

        System.out.print("Digite o ano atual: ");
        int anoAtual = Integer.parseInt(System.console().readLine());

        // Cálculo da idade em diferentes unidades
        int idadeAnos = anoAtual - nascimento;
        int idadeMeses = idadeAnos * 12;
        int idadeSemanas = idadeAnos * 52;
        int idadeDias = idadeAnos * 365;

        // Exibe os resultados
        System.out.println("A sua idade é de:");
        System.out.println(idadeAnos + " anos");
        System.out.println(idadeMeses + " meses");
        System.out.println(idadeSemanas + " semanas");
        System.out.println(idadeDias + " dias");

    }
}
