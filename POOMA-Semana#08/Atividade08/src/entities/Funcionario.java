package entities;

public abstract class Funcionario {

    private String nome;
    private String departamento;
    private String funcao;

    public Funcionario (String nome, String departamento, String funcao) {
        this.nome = nome;
        this.departamento = departamento;
        this.funcao = funcao;
    }

    public String getNome () {
        return nome;
    }

    public String getDepartamento () {
        return departamento;
    }

    public String getFuncao() {
        return funcao;
    }


    public abstract double calcularSalario();

}
