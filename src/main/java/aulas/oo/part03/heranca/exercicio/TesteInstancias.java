package aulas.oo.part03.heranca.exercicio;

public class TesteInstancias {

    public static void main(String[] args){
        Funcionario generico = new Funcionario("Generico", 2000);
        Gerente gerente = new Gerente("Gerente", 10000);
        Supervisor supervisor = new Supervisor("Supervisor", 8000);
        Atendente atendente = new Atendente("Atendente", 1000);

        System.out.println(generico.calculaImposto());
        System.out.println(gerente.calculaImposto());
        System.out.println(supervisor.calculaImposto());
        System.out.println(atendente.calculaImposto());

    }

}
