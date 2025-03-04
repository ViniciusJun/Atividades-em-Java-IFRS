package Java_I;

public class CalculoMedidas {
    public static void main(String[] args) {

        System.out.println("Informe o valor da medida em pés:");
            int pes = Integer.parseInt(System.console().readLine());
        
        int polegadas = pes/12;
        int jardas = pes*3;
        int milhas = jardas*1760;

        System.out.println("Os valores de medidas em (Polegadas, Pés, Jardas, Milhas) é:");
        System.out.println(polegadas+" polegadas");
        System.out.println(pes+" pes (valor informado)");
        System.out.println(jardas+" jardas");
        System.out.println(milhas+" milhas");
    }
}
