package Java_III.Modulo1;

public class pesquisaHabitantes {
   public static void main(String[] args) {
        System.out.println("Pesquisa de Habitantes");
    
        int opcao = 0, idade, sexo;
        double salario;
 
        do {
            System.out.println("Menu Inicial");
            System.out.println("1. Iniciar Pesquisa");
            System.out.println("2. Reiniciar pesquisa");
            System.out.println("3. Finalizar Programa");
            opcao = Integer.parseInt(System.console().readLine("Digite sua opção:"));

            switch (opcao) {
                case 1:
                    salario = Double.parseDouble(System.console().readLine("Informe o seu salario: "));
                        
                    idade = Integer.parseInt(System.console().readLine("Informe sua Idade: "));
                    sexo = Integer.parseInt(System.console().readLine("Informe o seso: "));
                    break;
                case 2:

                    break;
            
                default:
                    break;
            }
          
        } while (opcao != 3);
        


   
    }
}