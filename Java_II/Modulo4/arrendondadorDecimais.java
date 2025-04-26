package Modulo4;
public class arrendondadorDecimais {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        double numero = Double.parseDouble(System.console().readLine("Informe um número Real: "));
        int casas = Integer.parseInt(System.console().readLine("Informe a quantidade de casa apos a vírgula: "));
        
        double fator = Math.pow(10, casas); //Elevaremos a base 10 ao valor de casas decimais.
        double resultado = Math.round(numero * fator) / fator; //Aqui primeiro arredondamos e depois dividimos pelo fator.

        System.out.println("Número arredondado: " + resultado);
    }
}
