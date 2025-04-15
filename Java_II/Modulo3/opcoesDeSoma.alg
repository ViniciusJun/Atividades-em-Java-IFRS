algoritmo "opcoesDeSoma"
// Autor: ViniciusJun
// Função: Soma ou multiplica por dois.
// Data: 15/04/2025

Var
   opcao, num1, num2, resultado: inteiro

Inicio
   EscrevaL("Menu de opções:")
   EscrevaL("1. Somar dois números.")
   EscrevaL("2. Número ao quadrado.")
   EscrevaL("Digite a opção desejada: ")
   Leia(opcao)

   Escolha (opcao)
      Caso 1:
         Escreva("Digite o primeiro número: ")
         Leia(num1)
         Escreva("Digite o segundo número: ")
         Leia(num2)
         resultado <- num1 + num2
         Escreva("A soma é: ", resultado)
         Pare

      Caso 2:
         Escreva("Digite o número: ")
         Leia(num1)
         resultado <- num1 * num1
         Escreva("O quadrado do número é: ", resultado)
         Pare

      OutroCaso:
         Escreva("Opção inválida.")
         
   FimEscolha

FimAlgoritmo
