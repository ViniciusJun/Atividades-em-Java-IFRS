package Modulo2;

public class consumoMedioCarro {
    public static void main(String[] args) {
        System.out.print("Digite o número de viagens realizadas: ");
        int numeroViagens = Integer.parseInt(System.console().readLine()); // Lê o número de viagens

        int contador = 1; // Variável de controle do loop
        double somaConsumo = 0; // Acumulador do consumo total

        while (contador <= numeroViagens) { // Laço que percorre todas as viagens informadas
            System.out.print("Digite a distância percorrida na viagem " + contador + " (km): ");
            double distancia = Double.parseDouble(System.console().readLine()); // Lê a distância

            System.out.print("Digite a quantidade de litros de combustível gasto na viagem " + contador + ": ");
            double litros = Double.parseDouble(System.console().readLine()); // Lê os litros consumidos

            if (litros > 0) { // Evita divisão por zero
                double consumo = distancia / litros; // Calcula o consumo médio da viagem
                somaConsumo += consumo; // Soma os consumos individuais
            } else {
                System.out.println("A quantidade de litros deve ser maior que zero. Viagem ignorada.");
                continue; // Volta para a próxima iteração sem incrementar o contador
            }

            contador++; // Incrementa o número da viagem
        }

        if (numeroViagens > 0) { // Verifica se pelo menos uma viagem foi registrada
            double consumoMedio = somaConsumo / numeroViagens; // Calcula o consumo médio total
            System.out.println("O consumo médio do carro foi: " + consumoMedio + " km/l");
        } else {
            System.out.println("Nenhuma viagem registrada.");
        }

        System.out.println("Programa encerrado.");
    }
}
