package desafio3;

public class Uchiha extends Ninja {
    String habilidadeEspecial;
//utilizamos o override para sobreescrever, base do polimofirsmo é uma anotação
    @Override
    public void ataqueEspecial() {
        System.out.println("meu nome é "+ nome +" e essa minha habilidade especial uchiha!");
    }
}
