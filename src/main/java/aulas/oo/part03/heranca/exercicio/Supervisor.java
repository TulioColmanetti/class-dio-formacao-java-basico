package aulas.oo.part03.heranca.exercicio;

public class Supervisor extends Funcionario {

    public Supervisor(String nome, double salario) {
        super(nome, salario);
    }

    public double calculaImposto(){
        return this.getSalario() * (0.05/100);
    }
}
