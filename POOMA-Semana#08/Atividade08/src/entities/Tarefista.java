package entities;

public class Tarefista extends Funcionario{
    private int quantidadeTarefas;
    private double valorTarefas;

    public Tarefista(String nome, String departamento, String funcao, int quantidadeTarefas, double valorTarefas) {
        super(nome, departamento, funcao);
        this.quantidadeTarefas = quantidadeTarefas;
        this.valorTarefas = valorTarefas;
    }

    @Override
    public double calcularSalario() {
        return quantidadeTarefas * valorTarefas;
    }
}
