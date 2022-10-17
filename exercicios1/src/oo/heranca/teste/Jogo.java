package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Jogador monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Jogador heroi = new Heroi(10,11);
        /*
        heroi.x = 10;
        heroi.y = 11;
        */
        
        System.out.println("monstro tem: "+monstro.vida+" vidas");
        System.out.println("heroi tem: "+heroi.vida+" vidas");

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("monstro tem: "+monstro.vida+" vidas");
        System.out.println("heroi tem: "+heroi.vida+" vidas");
        
        
    }
}
