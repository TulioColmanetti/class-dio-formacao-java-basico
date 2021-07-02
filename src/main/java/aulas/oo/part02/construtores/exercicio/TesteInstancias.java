package aulas.oo.part02.construtores.exercicio;

public class TesteInstancias {

    public static void main(String[] args){

        Carro carro = new Carro("GM", "Prisma", 2015);

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Variante: " + carro.getVariante());
    }
}
