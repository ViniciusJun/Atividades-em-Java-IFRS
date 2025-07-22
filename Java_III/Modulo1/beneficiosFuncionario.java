package Java_III.Modulo1;

public class beneficiosFuncionario {
    public static void main(String[] args) {
        int opcao;

        do {
            // Menu de opções
            System.out.println("\nMenu de opções:");
            System.out.println("1. Novo salário");
            System.out.println("2. Férias");
            System.out.println("3. Décimo terceiro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(System.console().readLine());

            switch (opcao) {
                case 1:
                    // Novo salário com reajuste
                    System.out.print("Digite o salário atual: R$ ");
                    double salario = Double.parseDouble(System.console().readLine());
                    double novoSalario;

                    if (salario <= 1000.00) {
                        novoSalario = salario * 1.15;
                    } else if (salario <= 3000.00) {
                        novoSalario = salario * 1.10;
                    } else {
                        novoSalario = salario * 1.05;
                    }

                    System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
                    break;

                case 2:
                    // Cálculo das férias
                    System.out.print("Digite o salário do funcionário: R$ ");
                    double salarioFerias = Double.parseDouble(System.console().readLine());
                    double valorFerias = salarioFerias + (salarioFerias / 3);
                    System.out.printf("Valor das férias: R$ %.2f\n", valorFerias);
                    break;

                case 3:
                    // Cálculo do décimo terceiro salário proporcional
                    System.out.print("Digite o salário do funcionário: R$ ");
                    double salario13 = Double.parseDouble(System.console().readLine());

                    System.out.print("Digite o número de meses trabalhados (1 a 12): ");
                    int meses = Integer.parseInt(System.console().readLine());

                    if (meses >= 1 && meses <= 12) {
                        double decimoTerceiro = (salario13 * meses) / 12;
                        System.out.printf("Décimo terceiro salário: R$ %.2f\n", decimoTerceiro);
                    } else {
                        System.out.println("Número de meses inválido. Deve ser entre 1 e 12.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha entre 1 e 4.");
            }

        } while (opcao != 4);
    }
}

