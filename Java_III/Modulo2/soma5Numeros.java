package Java_III.Modulo2;

public class soma5Numeros {
    
    public static void main(String[] args){

        //Declaração de vetores.
        int numeros[] = new int[5];

        //Acumuladores
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i+1) + "° número: " );
            numeros[i] = Integer.parseInt(System.console().readLine());

            soma = soma + numeros[i];
        }

        System.out.println("Os números digitados foram: ");
        System.out.println(numeros[0] + " + " + numeros[1] + " + " + numeros[2] + " + " + numeros[3] + " + " + numeros[4] + " = " + soma);
    }
}
