algoritmo "MaiorEMenorIdade"

var
   idade: inteiro
   maior: inteiro
   menor: inteiro
   primeiraEntrada: logico

inicio
   primeiraEntrada <- verdadeiro

   repita
      escreva("Digite a idade (negativa para encerrar): ")
      leia(idade)

      se (idade >= 0) então
         se (primeiraEntrada) entao
            maior <- idade
            menor <- idade
            primeiraEntrada <- falso
         senão
            se (idade > maior) entao
               maior <- idade
            fimse 

            se (idade < menor) entao
               menor <- idade
            fimse
         fimse
      fimse
   ate (idade < 0)

   se primeiraEntrada entao
      escreva("Nenhuma idade válida foi inserida.")
   senao
      escreva("Maior idade: ", maior, "\n")
      escreva("Menor idade: ", menor, "\n")
   fimse
fimalgoritmo