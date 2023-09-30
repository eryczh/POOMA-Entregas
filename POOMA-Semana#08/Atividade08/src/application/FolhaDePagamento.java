package application;

import entities.Funcionario;
import entities.Horista;
import entities.Mensalista;
import entities.Tarefista;

import java.util.Locale;
import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.println("Informe o departamento do funcionário: ");
        String departamento = sc.nextLine();
        System.out.println("Informe a função do funcionário: ");
        String funcao = sc.nextLine();

        System.out.println("Escolha o tipo de vínculo empregatício (1- Tarefista, 2 - Horista, 3 - Mensalista):");
        int tipoVinculo = sc.nextInt();

        Funcionario funcionario = null;

        switch (tipoVinculo) {
            case 1:
                System.out.println("Informa a quantidade de tarefas realizadas: ");
                int quantidadeTarefas = sc.nextInt();
                System.out.println("Informa o valor da tarefa: ");
                double valorTarefa = sc.nextDouble();
                funcionario = new Tarefista(nome, departamento, funcao, quantidadeTarefas, valorTarefa);
                break;
            case 2:
                System.out.println("Informa a quantidade de Horas trabalhadas: ");
                double horasTrabalhadas = sc.nextDouble();
                System.out.println("Informe o valor da hora: ");
                double valorHora = sc.nextDouble();
                funcionario = new Horista(nome, departamento, funcao, horasTrabalhadas, valorHora);
                break;
            case 3:
                System.out.println("Informa o salário mensal fixo: ");
                double salarioFixo = sc.nextDouble();
                funcionario = new Mensalista(nome, departamento, funcao, salarioFixo);
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        }

        if (funcao != null) {
            System.out.println("\nComprovante de pagamento: ");
            System.out.println("Nome : " + funcionario.getNome());
            System.out.println("Departamento: " + funcionario.getDepartamento());
            System.out.println("Função: " + funcionario.getFuncao());
            System.out.printf("Salário: %.2f", funcionario.calcularSalario());
        }

        sc.close();
    }
}