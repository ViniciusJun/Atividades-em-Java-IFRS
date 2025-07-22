package Java_III.Modulo1;

public class menuDeMedias {
    public static void main(String[] args) {
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("\nMenu de opções:");
            System.out.println("1. Média Aritmética");
            System.out.println("2. Média Ponderada");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(System.console().readLine());

            switch (opcao) {
                case 1:
                    // Média Aritmética
                    System.out.print("Digite a primeira nota: ");
                    double nota1 = Double.parseDouble(System.console().readLine());

                    System.out.print("Digite a segunda nota: ");
                    double nota2 = Double.parseDouble(System.console().readLine());

                    double mediaAritmetica = (nota1 + nota2) / 2;
                    System.out.println("Média Aritmética: " + mediaAritmetica);
                    break;

                case 2:
                    // Média Ponderada
                    System.out.print("Digite a primeira nota: ");
                    double n1 = Double.parseDouble(System.console().readLine());
                    System.out.print("Digite o peso da primeira nota: ");
                    double p1 = Double.parseDouble(System.console().readLine());

                    System.out.print("Digite a segunda nota: ");
                    double n2 = Double.parseDouble(System.console().readLine());
                    System.out.print("Digite o peso da segunda nota: ");
                    double p2 = Double.parseDouble(System.console().readLine());

                    System.out.print("Digite a terceira nota: ");
                    double n3 = Double.parseDouble(System.console().readLine());
                    System.out.print("Digite o peso da terceira nota: ");
                    double p3 = Double.parseDouble(System.console().readLine());

                    double mediaPonderada = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
                    System.out.println("Média Ponderada: " + mediaPonderada);
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 3);
    }
}
