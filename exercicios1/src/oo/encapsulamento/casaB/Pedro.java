package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    //Ana mae = new Ana(); //como pedro herdou ana, não precisa ter instancia dela

    void testeAcessos(){
        //System.out.println(segredo);//private
        //System.out.println(facoDentroDeCasa);//package
        System.out.println(formaDeFalar);//protected
        System.out.println(todosSabem);//public
    }
}
