package Modulo1;

public class diferencaValores {
    public static void main(String[] args) {
      // Leitura dos valores inteiros
      System.out.print("Digite o primeiro valor inteiro: ");
      int valor1 = Integer.parseInt(System.console().readLine());
              
      System.out.print("Digite o segundo valor inteiro: ");
      int valor2 = Integer.parseInt(System.console().readLine());
              
      // Cálculo da diferença absoluta ultilizando o metodo Math.abs
      int diferenca = (valor1 - valor2);

     // Exibição do resultado      
      if (valor1 == valor2) {
            System.out.println("Os valores são iguais, diferença: " + "0");
      } else {
 
            System.out.println("A diferença entre os valores é: " + diferenca); 
      }

    }
}



