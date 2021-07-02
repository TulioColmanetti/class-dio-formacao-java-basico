package aulas.oo.part03.heranca.exercicio;

public class Atendente extends Funcionario {

    public Atendente(String nome, double salario) {
        super(nome, salario);
    }

    public double calculaImposto(){
        return this.getSalario() * (0.01/100);
    }
}
