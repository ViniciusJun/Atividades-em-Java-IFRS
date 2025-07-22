package Java_III.Modulo1;

public class identificadorAnimal {
    public static void main(String[] args) {
        String resposta;

        System.out.print("O animal é mamífero, ave ou réptil? ");
        resposta = System.console().readLine().toLowerCase();

        if (resposta.equals("mamífero")) {
            System.out.print("É quadrúpede, bípede, voador ou aquático? ");
            resposta = System.console().readLine().toLowerCase();

            if (resposta.equals("quadrúpede")) {
                System.out.print("É carnívoro ou herbívoro? ");
                resposta = System.console().readLine().toLowerCase();

                if (resposta.equals("carnívoro")) {
                    System.out.println("O animal escolhido foi o Leão.");
                } else if (resposta.equals("herbívoro")) {
                    System.out.println("O animal escolhido foi o Cavalo.");
                }

            } else if (resposta.equals("bípede")) {
                System.out.print("É onívoro ou frutívoro? ");
                resposta = System.console().readLine().toLowerCase();

                if (resposta.equals("onívoro")) {
                    System.out.println("O animal escolhido foi o Homem.");
                } else if (resposta.equals("frutívoro")) {
                    System.out.println("O animal escolhido foi o Macaco.");
                }

            } else if (resposta.equals("voador")) {
                System.out.println("O animal escolhido foi o Morcego.");
            } else if (resposta.equals("aquático")) {
                System.out.println("O animal escolhido foi a Baleia.");
            }

        } else if (resposta.equals("ave")) {
            System.out.print("É não-voadora, nadadora ou de rapina? ");
            resposta = System.console().readLine().toLowerCase();

            if (resposta.equals("não-voadora") || resposta.equals("nao-voadora")) {
                System.out.print("É tropical ou polar? ");
                resposta = System.console().readLine().toLowerCase();

                if (resposta.equals("tropical")) {
                    System.out.println("O animal escolhido foi a Avestruz.");
                } else if (resposta.equals("polar")) {
                    System.out.println("O animal escolhido foi o Pinguim.");
                }

            } else if (resposta.equals("nadadora")) {
                System.out.println("O animal escolhido foi o Pato.");
            } else if (resposta.equals("de rapina")) {
                System.out.println("O animal escolhido foi a Águia.");
            }

        } else if (resposta.equals("réptil") || resposta.equals("reptil")) {
            System.out.print("É com casco, carnívoro ou sem patas? ");
            resposta = System.console().readLine().toLowerCase();

            if (resposta.equals("com casco")) {
                System.out.println("O animal escolhido foi a Tartaruga.");
            } else if (resposta.equals("carnívoro")) {
                System.out.println("O animal escolhido foi o Crocodilo.");
            } else if (resposta.equals("sem patas")) {
                System.out.println("O animal escolhido foi a Cobra.");
            }
        } else {
            System.out.println("Classificação inválida.");
        }
    }
}

