package entities;

public class Mensalista extends Funcionario{

    private double salarioFixo;

    public Mensalista (String nome, String departamento, String funcao, double salarioFixo) {
        super(nome, departamento, funcao);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return salarioFixo;
    }
}
