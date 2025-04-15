algoritmo "os10PrimeirosFibonacci"
// Autor: ViniciusJun
// Função: Mostra os 10 primeiros valores daseuqencia de Fibonacci.
// Data: 15/04/2025

Var
   a, b, proximo, contador: inteiro

Inicio
   a <- 1
   b <- 1
   contador <- 2
   escreva(a, ", ", b, ", ")

   Repita
      proximo <- a + b
      Escreva(proximo, ", ")
      a <- b
      b <- proximo
      contador <- contador + 1
   Ate contador = 10

FimAlgoritmo