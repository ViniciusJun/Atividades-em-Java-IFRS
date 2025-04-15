package Modulo3;

public class verificaSenhas {
    
    public static void main(String[] args) {
        int senha;

        // Laço do...while que pergunta indefinidamente a senha ate ser igual a "1234".
        do {  
            System.out.println("DIGITE A SENHA:");
            senha = Integer.parseInt(System.console().readLine());

        } while (senha != 1234); // O "!=" é o operador de desigualdade.

        System.out.println("Senha correta, acesso liberado!");
    }

}
