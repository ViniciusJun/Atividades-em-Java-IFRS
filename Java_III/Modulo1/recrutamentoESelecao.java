package Java_III.Modulo1;

public class recrutamentoESelecao {
    public static void main(String[] args) {
        System.out.println("JS Recrutamento e Seleção LTDA\n");

        String resp;
        boolean opcao;

        System.out.print("Quer começar? (Y/N): ");
        resp = System.console().readLine();
        opcao = resp.equalsIgnoreCase("y");

        // Variáveis acumuladoras fora do laço (para guardar o total geral)
        int totalFeminino = 0, totalMasculino = 0;
        int idadeMasculino = 0, idadeFemininaComExp = 0;
        int qtdFemininaComExp = 0;

        while (opcao) {
            System.out.print("Qual é o sexo do candidato? (M/F): ");
            String sexo = System.console().readLine();

            System.out.print("Informe a idade: ");
            int idade = Integer.parseInt(System.console().readLine());

            System.out.print("Quantos anos de experiência: ");
            int experiencia = Integer.parseInt(System.console().readLine());

            if (sexo.equalsIgnoreCase("F")) {
                totalFeminino++;

                if (experiencia > 0) {
                    qtdFemininaComExp++;
                    idadeFemininaComExp += idade;
                }
            } else if (sexo.equalsIgnoreCase("M")) {
                totalMasculino++;
                idadeMasculino += idade;
            } else {
                System.out.println("Sexo inválido. Candidato ignorado.");
            }

            System.out.print("Deseja cadastrar outro candidato? (Y/N): ");
            String continuar = System.console().readLine();
            opcao = continuar.equalsIgnoreCase("y");
        }

        // Cálculo das médias, com verificação para evitar divisão por zero
        double mediaMasculina = (totalMasculino > 0) ? (double) idadeMasculino / totalMasculino : 0;
        double mediaFeminina = (qtdFemininaComExp > 0) ? (double) idadeFemininaComExp / qtdFemininaComExp : 0;

        // Saída final
        System.out.println("\nNúmero de candidatas do sexo feminino: " + totalFeminino);
        System.out.println("Número de candidatos do sexo masculino: " + totalMasculino);
        System.out.println("Idade média dos homens: " + mediaMasculina);
        System.out.println("Idade média das mulheres com experiência: " + mediaFeminina);
        System.out.println("\nPrograma encerrado.");
    }
}

