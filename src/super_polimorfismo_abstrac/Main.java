package super_polimorfismo_abstrac;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki("Naruto", "Aldeia da Folha", 30, "futon");
        Naruto.habilidadeFamiliar();
        Naruto.ataqueLongaDistancia();

        Uchiha Sasuke = new Uchiha( "sasuke", "aldeia da folha", 31, "Katon" );
        Sasuke.habilidadeFamiliar();
        Sasuke.ataqueFisico();
        Sasuke.ataqueLongaDistancia();


    }
}
