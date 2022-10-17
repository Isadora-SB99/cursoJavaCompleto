package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Arroz i1 = new Arroz(0.2);
        Comida i2 = new Feijao(0.1);
        Comida i3 = new Arroz(0.3);

        System.out.println(convidado.getPeso());

        convidado.comer(i1);
        convidado.comer(i2);
        convidado.comer(i3);

        System.out.println(convidado.getPeso());

        Comida sobremesa = new Sorvete(0.4);
        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());

    }
}
