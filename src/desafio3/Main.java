package desafio3;

public class Main {
    public static void main(String[] args) {

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.nivelDificuldade = "Alta";
        Sasuke.statusMissao = "incompleta";
        Sasuke.habilidadeEspecial = "chidori";
        Sasuke.ataqueEspecial();

        uzumaki naruto = new uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.ModoSabioAtivado();
        naruto.ataqueEspecial();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Uzumaki Hyuga";
        boruto.idade = 12;
        boruto.AtivarJougan();
        boruto.AtivarOKarma();

        Senju Hashirama = new Senju();
        Hashirama.nome = "Hashirama";
        Hashirama.idade = 18;
        Hashirama.sabedoriaHokage();



    }
}
