package super_polimorfismo_abstrac;

public class Uzumaki extends Ninja{

    public Uzumaki(String nome, String aldeia, int idade, String estiloNatureza){
        super(nome, aldeia, idade, estiloNatureza);
    }


    public void habilidadeFamiliar() {
        System.out.println("Minha habilidade especial é ter muito chakra");
    }
}
