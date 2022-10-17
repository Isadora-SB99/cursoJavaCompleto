package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", "Souza", -60);
        //p1.idade = -18;//alterar valor da variavel
        p1.setIdade(230);

        System.out.println(p1.getIdade());//ler o valor da variavel
        System.out.println(p1.getNome());

        System.out.println(p1);//toString
    }
}
