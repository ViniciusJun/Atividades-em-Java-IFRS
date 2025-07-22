package Java_III.Modulo1;

public class sistemaDeVotacao {
    public static void main(String[] args) {
        int voto;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
        int nulo = 0, branco = 0, totalVotos = 0;

        do {
            // Exibe o menu de opções
            System.out.println("\nMenu de opções:");
            System.out.println("1-4 Para candidatos");
            System.out.println("5. Nulo");
            System.out.println("6. Branco");
            System.out.println("0. Encerrar");
            System.out.print("Escolha uma opção: ");
            voto = Integer.parseInt(System.console().readLine());

            //Analisa o voto
            switch (voto) {
                case 0:
                    System.out.println("Encerrando votação...\n");
                    break;
                case 1:
                    candidato1++;
                    totalVotos++;
                    break;
                case 2:
                    candidato2++;
                    totalVotos++;
                    break;
                case 3:
                    candidato3++;
                    totalVotos++;
                    break;
                case 4:
                    candidato4++;
                    totalVotos++;
                    break;
                case 5:
                    nulo++;
                    totalVotos++;
                    break;
                case 6:
                    branco++;
                    totalVotos++;
                    break;
                default:
                    System.out.println("Código inválido! Tente novamente.");
            }

        } while (voto != 0);

        // Exibição dos resultados
        System.out.println("Resultado da votação:");
        System.out.println("Candidato 1: " + candidato1 + " voto(s)");
        System.out.println("Candidato 2: " + candidato2 + " voto(s)");
        System.out.println("Candidato 3: " + candidato3 + " voto(s)");
        System.out.println("Candidato 4: " + candidato4 + " voto(s)");
        System.out.println("Votos nulos: " + nulo);
        System.out.println("Votos em branco: " + branco);

        // Cálculo de percentuais
        if (totalVotos > 0) {
            double percentualNulo = (nulo * 100.0) / totalVotos;
            double percentualBranco = (branco * 100.0) / totalVotos;

            System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulo);
            System.out.printf("Percentual de votos em branco: %.2f%%\n", percentualBranco);
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }
    }
}

