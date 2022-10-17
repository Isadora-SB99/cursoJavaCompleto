package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Carro civic = new Civic();
        Ferrari ferrari = new Ferrari();
    
        System.out.println("CIVIC:");

        System.out.println(civic.velocidadeAtual);
        civic.acelerar();
        civic.acelerar();
        System.out.println(civic.velocidadeAtual);
        civic.frear();
        System.out.println(civic.velocidadeAtual);
        civic.acelerar();
        System.out.println(civic.velocidadeAtual);
        civic.acelerar();
        System.out.println(civic.velocidadeAtual);
        civic.frear();
        System.out.println(civic.velocidadeAtual);
        civic.frear();
        System.out.println(civic.velocidadeAtual);
        civic.frear();
        System.out.println(civic.velocidadeAtual);
        civic.frear();
        System.out.println(civic.velocidadeAtual);
        
        System.out.println("----------------------------------------------");
        System.out.println("FERRARI");
        System.out.println(ferrari.velocidadeAtual);
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);
            ferrari.frear();
        System.out.println(ferrari.velocidadeAtual);
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);
            ferrari.frear();
        System.out.println(ferrari.velocidadeAtual);
            ferrari.frear();
        System.out.println(ferrari.velocidadeAtual);
            ferrari.frear();
        System.out.println(ferrari.velocidadeAtual);
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);
        
            ferrari.ligarTurbo();
            ferrari.ligarAr();
            System.out.println("velocidade do ar: "+ferrari.velocidadeDoAr());
            ferrari.desligarAr();
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);
        ferrari.desligarTurbo();
            ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);

    }
}
