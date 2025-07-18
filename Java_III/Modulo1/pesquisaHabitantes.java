package Java_III.Modulo1;

public class pesquisaHabitantes {
    public static void main(String[] args) {
        System.out.println("Pesquisa de Habitantes\n");

        int idade, quantidade = 0;
        String sexo, escravizado = "";
        int salarioFeminino = 0, idadeMaior = 0, idadeMenor = 0;
        double salario, menorSalario = 0, salarioEscravo = 0, soma = 0, mediaSalarial = 0;

        boolean primeiraEntrada = true;

        // Primeira leitura da idade
        idade = Integer.parseInt(System.console().readLine("Digite a idade (negativa para encerrar): "));

        while (idade > 0) {
            salario = Double.parseDouble(System.console().readLine("Informe o salário: "));
            sexo = System.console().readLine("Informe o sexo (M ou F): ");

            quantidade++; // Conta o número de participantes
            soma += salario;

            if (primeiraEntrada) {
                idadeMaior = idade;
                idadeMenor = idade;
                menorSalario = salario;
                salarioEscravo = salario;
                escravizado = sexo.equalsIgnoreCase("M") ? "homem" : "mulher"; /* Condicional Ternária que verifica uma String sem considerar maiuculas e minusculas, Se a condição for verdadeira (ou seja, sexo for "M" ou "m"), então o valor "homem" será atribuído à variável escravizado, senão o valor "mulher" é atribuido. */
                primeiraEntrada = false;
            } else {
                // Atualiza maior idade
                if (idade > idadeMaior) idadeMaior = idade;
                // Atualiza menor idade
                if (idade < idadeMenor) idadeMenor = idade;
                // Verifica menor salário
                if (salario < menorSalario) {
                    menorSalario = salario;
                    salarioEscravo = salario;
                    escravizado = sexo.equalsIgnoreCase("M") ? "homem" : "mulher";//Condicional Ternária que verifica uma String sem considerar maiuculas
                }
            }

            // Contador de mulheres com salário até R$ 1500
            if (salario <= 1500 && sexo.equalsIgnoreCase("F")) {
                salarioFeminino++;
            }

            // Nova leitura da idade para continuar ou sair do loop
            idade = Integer.parseInt(System.console().readLine("\nDigite a idade (negativa para encerrar): "));
        }

        // Evita divisão por zero
        if (quantidade > 0) {
            mediaSalarial = soma / quantidade;

            System.out.println("\nRESULTADO DA PESQUISA:");
            System.out.println("Média salarial: R$ " + mediaSalarial);
            System.out.println("Maior idade: " + idadeMaior + " anos");
            System.out.println("Menor idade: " + idadeMenor + " anos");
            System.out.println("Quantidade de mulheres com salário até R$ 1500: " + salarioFeminino);
            System.out.println("Pessoa com menor salário é um(a) " + escravizado + " com salário de R$ " + salarioEscravo);
        } else {
            System.out.println("Nenhum dado foi informado.");
        }

        System.out.println("\nPrograma encerrado.");
    }
}
