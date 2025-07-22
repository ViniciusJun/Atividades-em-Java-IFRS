package Java_III.Modulo1;

public class conceitosFinais {
    
    public static void main(String[] args){

        //Declaração de contadores.
        int quantA = 0, quantB = 0, quantC = 0, quantD = 0, quantE = 0, quantAluno = 0;

        //Declaração de acumuladores.
        double somaA = 0, somaB = 0, somaC = 0, somaD = 0, somaE = 0;

        //Declaração variáveis de média totais.
        double mediaA, mediaB, mediaC, mediaD, mediaE;

        System.out.println("Qual é a quantidade de Alunos? ");
        quantAluno = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= quantAluno; i++) {
             
            // Coleta e classificação de dados.
            System.out.println("Qual é o código do Aluno " + i + ": ");
            int codigo = Integer.parseInt(System.console().readLine());  
            System.out.println("Qual é a nota final do Aluno " + i + ": ");
            double nota = Double.parseDouble(System.console().readLine());

            //Validação da nota
            while (nota < 0 || nota > 10) {
                System.out.println("Por favor insira um valor válido entre 0 e 10:");
                System.out.println("Qual é a nota final do Aluno " + i + ": ");
                nota = Double.parseDouble(System.console().readLine()); 
            } 
            
            //Classifica os conceitos da nota.
            if (nota >= 0 && nota <= 2.9) {
                quantE++;
                somaE += nota;
            } else if (nota >= 3.0 && nota <= 4.9) {
                quantD++;
                somaD += nota;
            } else if (nota >= 5.0 && nota <= 6.9) {
                quantC++;
                somaC += nota;
            } else if (nota >= 7.0 && nota <= 8.9) {
                quantB++;
                somaB += nota;
            } else if (nota >= 9.0 && nota <= 10.0) {
                quantA++;
                somaA += nota;
            } 
        }

        //Cálculo das médias.
        mediaE = quantE > 0 ? somaE / quantE : 0;
        mediaD = quantD > 0 ? somaD / quantD : 0;
        mediaC = quantC > 0 ? somaC / quantC : 0;
        mediaB = quantB > 0 ? somaB / quantB : 0;
        mediaA = quantA > 0 ? somaA / quantA : 0;

        //Impressão dos resultados.
        System.out.println("Conceito A: " + quantA + " alunos - Média: " + mediaA);
        System.out.println("Conceito B: " + quantB + " alunos - Média: " + mediaB);
        System.out.println("Conceito C: " + quantC + " alunos - Média: " + mediaC);
        System.out.println("Conceito D: " + quantD + " alunos - Média: " + mediaD);
        System.out.println("Conceito E: " + quantE + " alunos - Média: " + mediaE);
 
    }
}
