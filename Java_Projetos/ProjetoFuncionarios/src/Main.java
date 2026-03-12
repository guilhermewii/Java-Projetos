public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Juliana", 5000.0, 2000.0);
        Funcionario desenvolvedor = new Desenvolvedor("Rafael", 4000.0, 1200.0);
        Funcionario estagiario = new Estagiario("Lucas", 1500.0);

        System.out.println("=== DADOS DOS FUNCIONÁRIOS ===");
        gerente.exibirDados();
        System.out.println("-----------------------");
        desenvolvedor.exibirDados();
        System.out.println("-----------------------");
        estagiario.exibirDados();
    }
}
