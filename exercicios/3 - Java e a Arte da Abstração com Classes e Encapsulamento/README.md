# Módulo 3 — Classes e Encapsulamento

Esta pasta está preparada para minhas soluções sobre abstração, classes, objetos e encapsulamento. Cada programa deverá possuir um menu interativo e uma opção para encerrar a execução.

O [arquivo original com os enunciados](<../3 - Java e a Arte da Abstração com Classes e Encapsulamento.md>) foi mantido sem alterações.

## Progresso

- [ ] Exercício 1 — Conta bancária e cheque especial;
- [ ] Exercício 2 — Controle das funções de um carro;
- [x] [Exercício 3 — Máquina de banho para petshop](<solucoes/exercicio-03-petshop/src/Main.java>).

## Solução do petshop

A aplicação controla uma máquina de banho, respeitando sua capacidade de água e shampoo, a presença de apenas um pet por vez e a necessidade de limpeza quando um animal é retirado ainda sujo.

- [`Main.java`](<solucoes/exercicio-03-petshop/src/Main.java>) — menu e interação com o usuário;
- [`Pet.java`](<solucoes/exercicio-03-petshop/src/Pet.java>) — nome e estado de limpeza do animal;
- [`PetMachine.java`](<solucoes/exercicio-03-petshop/src/PetMachine.java>) — estado, operações e regras da máquina.

## Organização das soluções

```text
solucoes/
├── exercicio-01-conta-bancaria/src/
├── exercicio-02-carro/src/
└── exercicio-03-petshop/src/
    ├── Main.java
    ├── Pet.java
    └── PetMachine.java
```

Cada exercício mantém sua própria pasta `src`. Um exercício pode ter várias classes, mas cada classe pública precisa estar em um arquivo de mesmo nome, sem espaços ou hífens.
