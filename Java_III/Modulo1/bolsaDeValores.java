package Java_III.Modulo1;

public class bolsaDeValores {
    public static void main{

        String acao, letra;
        double precoAcao, precoVenda;
        double lucroSuperior, lucroInferior;
        boolean primeiraEntrada = true;

        System.out.println("Bolsa de Valore\n")

        letra = System.console().readline("Informe a letra da ação: ('F' para finalizar) \n")


        while (!acao.equalsIgnoreCase("f")) {/*Condicional que verifica uma String sem considerar maiuculas e minusculas, Se a condição for verdadeira (ou seja, sexo for "f" ou "F"), então será atribuído false para a condição.*/
            precoAcao = Double.parseDouble(System.console().readLine("Informe o valor da ação: \n"));
            precoVenda = Double.parseDouble(System.console().readLine("Informe o valor da de venda da ação: \n"));

            if (primeiraEntrada) {


                primeiraEntrada = false;
            } else{

            } 
        }
    }
}