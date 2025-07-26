package Java_III.Modulo2;

public class locadora {
    
    public static void main(String[] args){

        //Declaração de vetores.
        String clientes[] = new String[8];
        int dvd[] = new int[8];

        //Acumuladores.
        int locacaoGratis[] = new int[8];

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Informe o nome do cliente " + (i+1) + "°: ");
            clientes[i] = System.console().readLine();
            System.out.println("Qual é a quantidade de DVDs locados deste clente: ");
            dvd[i] = Integer.parseInt(System.console().readLine());

            locacaoGratis[i] = dvd[i] / 10;
        }

        for (int a = 0; a < clientes.length; a++) {
            System.out.println("Cliente: " + clientes[a] + " tem " + locacaoGratis[a] + " locações grátis.");
        }
    }
}
