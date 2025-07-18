package desafio3;

public class Ninja {
    String nome;
    int idade;
    String nivelDificuldade;
    String statusMissao;
    String missao;

    // começaremos a trabalhar com polimorfismo. A classe pai terá a mesm habilidade da classe filho, mas
    //queremos que a habilidade especial dos uchihas se sobresaia sobre as classe em comum uchiha
    public void ataqueEspecial(){
        System.out.println("Meu nome é "+ nome + " e essa é minha habilidade especial" );
    }
}

