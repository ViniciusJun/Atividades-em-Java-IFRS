package Modulo4;

public class rolaDados {
    public static void main(String[] args) {
        boolean resp = true;
        do {
            System.out.println("Vamos rolar o dado!\n");
            System.out.println("Dado rolado\n");
            int inteiroAleatorio = (int) (Math.random() * (6 - 1 + 1)) + 1; //Calcula a quantidade de números inteiros no intervalo e converte para inteiro.
            System.out.println("Face " + inteiroAleatorio + " do dado. \n" );
            
            String alt = System.console().readLine("Quer continuar? (S/N)"); //Ler a entrada do console diretamente com String e pergunta se quer continuar.
            switch (alt) {
                case "s":
                    resp = true;
                    break;
                case "S":
                    resp = true;
                    break;
                case "n":
                    resp = false;
                    break;
                case "N":
                    resp = false;
                    break;
                default:
                    continue;
            }
        }while(resp);
    }
}
