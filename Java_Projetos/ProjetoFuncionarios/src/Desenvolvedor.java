public class Desenvolvedor extends Funcionario {
    private double adicionalProjeto;

    public Desenvolvedor(String nome, double salarioBase, double adicionalProjeto) {
        super(nome, salarioBase);
        this.adicionalProjeto = adicionalProjeto;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + adicionalProjeto;
    }
}
