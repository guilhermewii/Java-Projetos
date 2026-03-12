# ProjetoFuncionarios

Projeto simples em Java para representar diferentes tipos de funcionários usando **classe abstrata**.

## Classes

### `Funcionario`
Classe abstrata com:
- `nome`
- `salarioBase`
- método abstrato `calcularSalarioFinal()`
- método `exibirDados()`

### `Gerente`
Recebe bônus e soma ao salário base.

### `Desenvolvedor`
Recebe adicional de projeto e soma ao salário base.

### `Estagiario`
Recebe apenas o salário base.

### `Main`
Classe principal com exemplos de uso.

## Como executar

Dentro da pasta `src`, rode:

```bash
javac *.java
java Main
```
