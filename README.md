# Projetos Java

Este pacote contém **2 projetos simples em Java**.

## Projetos incluídos

### 1. ProjetoAgenda
Sistema básico de agenda de contatos com:
- classe `Contato`
- classe `Agenda`
- adição de contatos
- remoção de contatos
- listagem de contatos

### 2. ProjetoFuncionarios
Sistema simples de funcionários usando **classe abstrata** com:
- classe abstrata `Funcionario`
- classes `Gerente`, `Desenvolvedor` e `Estagiario`
- cálculo de salário final em cada tipo de funcionário

## Estrutura das pastas

```bash
java_projetos/
├── README.md
├── ProjetoAgenda/
│   └── src/
│       ├── Agenda.java
│       ├── Contato.java
│       └── Main.java
└── ProjetoFuncionarios/
    └── src/
        ├── Desenvolvedor.java
        ├── Estagiario.java
        ├── Funcionario.java
        ├── Gerente.java
        └── Main.java
```

## Como executar

### ProjetoAgenda
Entre na pasta `src` e compile os arquivos:

```bash
javac *.java
java Main
```

### ProjetoFuncionarios
Entre na pasta `src` e compile os arquivos:

```bash
javac *.java
java Main
```

## Objetivo

Os códigos foram feitos de forma **mais simples e direta**, sem usar tecnologias desnecessárias, para ficar fácil de entender, copiar, estudar e entregar.

## Observações

- Os dois projetos usam apenas **Java básico**.
- Os exemplos já estão prontos no `Main`.
- Você pode alterar nomes, salários, contatos e demais dados sem problema.

