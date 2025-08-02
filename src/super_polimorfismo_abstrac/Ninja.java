package super_polimorfismo_abstrac;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;
    String estiloNatureza;

    public Ninja(String nome, String aldeia, int idade, String estiloNatureza){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.estiloNatureza = estiloNatureza;
    }

    public abstract void habilidadeFamiliar();

    public void ataqueFisico(){
        System.out.println("eu estou atacando");
    }

    public void ataqueLongaDistancia(){
        System.out.println("estou atacando a longa distância");
    }

}
