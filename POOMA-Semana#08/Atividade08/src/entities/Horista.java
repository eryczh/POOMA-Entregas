package entities;

public class Horista extends Funcionario{

    private double horasTralhadas;
    private double valorHora;

    public Horista (String nome, String departamento, String funcao, double horasTralhadas, double valorHora) {
        super(nome, departamento, funcao);
        this.horasTralhadas = horasTralhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return  horasTralhadas * valorHora;
    }

}
