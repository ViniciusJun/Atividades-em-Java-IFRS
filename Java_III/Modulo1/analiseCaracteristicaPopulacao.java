package Java_III.Modulo1;

public class analiseCaracteristicaPopulacao {
    public static void main(String[] args){
        //Variáveis de controle de repeticão
        boolean continuar;

        //Variáveis acumuladoras para totalizar os valores
        double somaIdade = 0, somaAltura =0, somaPeso = 0;
        double mediaIdade, mediaPeso, mediaAltura, porcentagemHomen, porcentagemMulher, porcentagemAzuiseRuivos;
        int totalMulher = 0, totalHomen = 0, somaAzuiseRuivos = 0, totalPessoas = 0;
        
        do {
            //Variáveis de coleta
            int  idade;
            double altura, peso;
            String sexo = "", corCabelo, corOlhos;

            //Coleta da idade
            System.out.println("Insira a idade: ");
            idade = Integer.parseInt(System.console().readLine());
            somaIdade += idade; //Incrementa e adiciona o valor da idade na variavel somaIdade.

            //Coleta da altura
            System.out.println("Insira a altura: ");
            altura = Double.parseDouble(System.console().readLine());
            somaAltura += altura; //Incrementa e adiciona o valor da idade na variavel somaAltura.

            //Coleta do peso
            System.out.println("Insira a peso: ");
            peso = Double.parseDouble(System.console().readLine());
            somaPeso += peso; //Incrementa e adiciona o valor da idade na variavel somaPeso.

            // Menu de opções de sexo
            System.out.println("Escolha o sexo do entrevistado:");
            System.out.println("1 - Mulher");
            System.out.println("2 - Homen");
            System.out.println("3 - Indefinido");
            int opcao0 = Integer.parseInt(System.console().readLine());
            switch (opcao0) {
                case 1:
                    sexo = "Mulher";
                    totalMulher++;
                    break;
                case 2:
                    sexo = "Homem";
                    totalHomen++;
                    break;
                default:
                    sexo = "Indefinido";
                    break;
            }
            
            //Incrementa o número total de entrevistados
            totalPessoas++;

            // Menu de opções dos olhos
            System.out.println("Escolha a cor dos olhos:");
            System.out.println("1 - Azul");
            System.out.println("2 - Verde");
            System.out.println("3 - Castanho");
            int opcao1 = Integer.parseInt(System.console().readLine());
            switch (opcao1) {
                case 1:
                    corOlhos = "Azuis";
                    break;
                case 2:
                    corOlhos = "Verdes";
                    break;
                case 3:
                    corOlhos = "Castanhos";
                    break;
                default:
                    corOlhos = "Pretos";
                    break;
            }

            // Menu de opções dos cabelos
            System.out.println("Escolha a cor dos cabelos:");
            System.out.println("1 - Loiros");
            System.out.println("2 - Castanhos");
            System.out.println("3 - Pretos");
            System.out.println("4 - Ruivos");
            System.out.println("5 - Tingido");
            int opcao2 = Integer.parseInt(System.console().readLine());
            switch (opcao2) {
                case 1:
                    corCabelo = "Loiros";
                    break;
                case 2:
                    corCabelo = "castanhos";
                    break;
                case 3:
                    corCabelo = "pretos";
                    break;
                case 4:
                    corCabelo = "Ruivos";
                    break;
                default:
                    corCabelo = "Tingido";
                    break;
            }

            //Processa o total de olhos azuis e cabelos ruivos
            if (corOlhos.equalsIgnoreCase("Azuis") && corCabelo.equalsIgnoreCase("Ruivos")) {
               somaAzuiseRuivos++; 
            }

            // Pergunta se deseja continuar
            System.out.println("Deseja continuar? (S/N): ");
            String resp = System.console().readLine();
            if (resp.equalsIgnoreCase("n")) {
                continuar = false;
            } else {
                continuar = true;
            }

        } while (continuar);

        //Processamento dos dados coletados, o double entre parenteses é para conversão explícita
        mediaIdade = somaIdade / ((double)totalPessoas);
        mediaAltura = somaAltura / ((double)totalPessoas);
        mediaPeso = somaPeso / ((double)totalPessoas);
        porcentagemHomen = ((double)totalHomen / totalPessoas)*100;
        porcentagemMulher = ((double)totalMulher / totalPessoas)*100;
        porcentagemAzuiseRuivos = ((double)somaAzuiseRuivos / totalPessoas)*100;

        //Imprime os valores obtidos
        System.out.println("Média das Idades: " + mediaIdade);
        System.out.println("Média do peso: " + mediaPeso);
        System.out.println("Média das alturas: " + mediaAltura);
        System.out.println("Porcentagem humens: " + porcentagemHomen + "%");
        System.out.println("Porcentagem mulheres: " + porcentagemMulher + "%");
        System.out.println("Porcentagem de pessoas com olhos azuis e cabelos ruivos: " + porcentagemAzuiseRuivos + "%");
        
    } 
}
