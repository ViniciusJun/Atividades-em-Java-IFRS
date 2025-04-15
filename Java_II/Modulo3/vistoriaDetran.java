package Modulo3;

public class vistoriaDetran {
    
    public static void main(String[] args) {
        System.out.print("Digite os 4 dígitos da placa: ");
        int placa = Integer.parseInt(System.console().readLine());

        int finalPlaca = placa % 10; // O operador % (módulo) por dez, que retorna o resto que vai ser igual ao ultimo digito.

        switch (finalPlaca) {
            case 0:
                System.out.println("Vistoria em Janeiro do próximo ano.");
                break;
            case 1:
                System.out.println("Vistoria em Fevereiro do próximo ano.");
                break;
            case 2:
                System.out.println("Vistoria em Março do próximo ano.");
                break;
            case 3:
                System.out.println("Vistoria em Abril do próximo ano.");
                break;
            case 4:
                System.out.println("Vistoria em Maio do próximo ano.");
                break;
            case 5:
                System.out.println("Vistoria em Junho do próximo ano.");
                break;
            case 6:
                System.out.println("Vistoria em Setembro deste ano.");
                break;
            case 7:
                System.out.println("Vistoria em Outubro deste ano.");
                break;
            case 8:
                System.out.println("Vistoria em Novembro deste ano.");
                break;
            case 9:
                System.out.println("Vistoria em Dezembro deste ano.");
                break;
            default:
                System.out.println("Número de placa inválido.");
        }
    }
}
