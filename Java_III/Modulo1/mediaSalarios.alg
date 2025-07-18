algoritmo "media_salarios"
var
   quantidade, contador: inteiro
   salario, soma, media: real
inicio
   escreva("Quantos salários deseja informar? ")
   leia(quantidade)

   soma <- 0
   contador <- 1

   enquanto contador <= quantidade faca
      escreva("Digite o salário ", contador, ": ")
      leia(salario)
      soma <- soma + salario
      contador <- contador + 1
   fimenquanto

   media <- soma / quantidade

   escreva("A média dos salários é: ", media:0:2)
fimalgoritmo