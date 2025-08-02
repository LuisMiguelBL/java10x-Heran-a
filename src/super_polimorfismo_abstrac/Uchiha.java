package super_polimorfismo_abstrac;

public class Uchiha extends Ninja{

    public Uchiha(String nome, String aldeia, int idade, String estiloNatureza){
        super(nome,aldeia,idade,estiloNatureza);
    }


    public void habilidadeFamiliar() {
        System.out.println("Minha habilidade especial é o Sharigan");
    }

    @Override
    public void ataqueLongaDistancia() {
        System.out.println("estou atacando a longa distância com uma kunai");
    }
}
