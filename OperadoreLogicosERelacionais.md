
---

# 🧠 Operadores Lógicos em Java x Portugol

| Operador Java   | Nome do Operador | Equivalente em Portugol | Descrição                                                                 |
| --------------- | ---------------- | ----------------------- | --------------------------------------------------------------------------|
| `&&`            | (AND)            | `e` ou `e também`       | Retorna `true` se **ambas** as condições forem verdadeiras                |
|`\|\|`           | (OR)             | `ou`                    | Retorna `true` se **uma ou ambas** as condições forem verdadeiras         |
| `!`             | (NOT)            | `não`                   | Inverte o valor lógico da expressão (true vira false, e vice-versa)       |
| `^`             | (XOR)            | *(sem equivalente)*     | Retorna `true` **somente se** uma das condições for verdadeira (não ambas)|


---

## ✅ Explicações Didáticas

### `&&` (E lógico)

* **Java:** Executa o bloco **somente se ambas** as condições forem verdadeiras.
* **Portugol:** Usa-se `e` ou `e também`.

```java
if (idade > 18 && renda > 2000) {
    System.out.println("Aprovado!");
}
```

```portugol
se (idade > 18 e renda > 2000) então
    escreva("Aprovado!")
fimse
```

---

### `||` (OU lógico)

* **Java:** Executa o bloco se **pelo menos uma** das condições for verdadeira.
* **Portugol:** Usa-se `ou`.

```java
if (idade < 12 || idade > 60) {
    System.out.println("Meia-entrada");
}
```

```portugol
se (idade < 12 ou idade > 60) então
    escreva("Meia-entrada")
fimse
```

---

### `!` (Negação lógica)

* **Java:** Inverte o valor lógico da condição.
* **Portugol:** Usa-se `não`.

```java
if (!(senha.equals("admin"))) {
    System.out.println("Acesso negado.");
}
```

```portugol
se (não (senha = "admin")) então
    escreva("Acesso negado.")
fimse
```

---

### `^` (OU exclusivo - XOR)

* **Java:** Apenas uma das condições deve ser verdadeira, **não ambas**.
* **Portugol:** Não tem operador lógico XOR diretamente.

```java
if (temCartao ^ temDinheiro) {
    System.out.println("Pode pagar com uma das formas");
}
```

> **Nota:** Em Portugol, o comportamento de XOR pode ser simulado com uma lógica composta:

```portugol
se ((temCartao e não temDinheiro) ou (não temCartao e temDinheiro)) então
    escreva("Pode pagar com uma das formas")
fimse
```

---

## 📌 Dica Rápida para Lógica

| Valor A | Valor B | A && B | A \|\| B | A ^ B |
| ------- | ------- | ------ | -------- | ----- |
| true    | true    | true   | true     | false |
| true    | false   | false  | true     | true  |
| false   | true    | false  | true     | true  |
| false   | false   | false  | false    | false |

---

Se quiser, posso gerar uma versão em **PDF ou HTML** para impressão ou estudo offline.
Quer também um exercício prático para treinar operadores lógicos com `if`, `else` e laços?


---

## 🧮 Tabela-Verdade – Operadores Lógicos

### 🔗 Operador `&&` / `e`

| A     | B     | A && B (Java) | A e B (Portugol) |
| ----- | ----- | ------------- | ---------------- |
| true  | true  | true          | verdadeiro       |
| true  | false | false         | falso            |
| false | true  | false         | falso            |
| false | false | false         | falso            |

---

### 🔗 Operador `||` / `ou`

| A        | B        | A \|\| B (Java)| A ou B (Portugol) |
|----------|----------|----------------|-------------------|
| true     | true     | true           | verdadeiro        |
| true     | false    | true           | verdadeiro        |
| false    | true     | true           | verdadeiro        |
| false    | false    | false          | falso             |

---

### 🔄 Operador `!` / `não`

| A     | !A (Java) | não A (Portugol) |
| ----- | --------- | ---------------- |
| true  | false     | falso            |
| false | true      | verdadeiro       |

---

## ✅ Operadores Relacionais – Java x Portugol

| Operador Java | Equivalente em Portugol | Descrição                                                 |
| ------------- | ----------------------- | --------------------------------------------------------- |
| `==`          | `=`                     | Se dois valores são **iguais**.                           |
| `!=`          | `<>`                    | Se dois valores são **diferentes**.                       |
| `>`           | `>`                     | Se o valor da esquerda é **maior** que o da direita.      |
| `<`           | `<`                     | Se o valor da esquerda é **menor** que o da direita.      |
| `>=`          | `>=`                    | Se o valor da esquerda é **maior ou igual** ao da direita.|
| `<=`          | `<=`                    | Se o valor da esquerda é **menor ou igual** ao da direita.|

---