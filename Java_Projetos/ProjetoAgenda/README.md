# ProjetoAgenda

Projeto simples em Java para cadastrar contatos em uma agenda.

## Classes

### `Contato`
Possui os atributos:
- `nome`
- `telefone`
- `email`

Também possui:
- construtor
- métodos get e set
- método para exibir os dados do contato

### `Agenda`
Possui um `ArrayList<Contato>` e métodos para:
- adicionar contato
- remover contato pelo nome
- listar todos os contatos

### `Main`
Classe principal usada para testar o funcionamento do sistema.

## Como executar

Dentro da pasta `src`, rode:

```bash
javac *.java
java Main
```
