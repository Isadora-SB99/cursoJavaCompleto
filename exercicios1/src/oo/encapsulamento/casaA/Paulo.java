package oo.encapsulamento.casaA;

public class Paulo {
    
    Ana esposa = new Ana();
    
    void testeAcessos(){
        //System.out.println(esposa.segredo);//private
        System.out.println(esposa.facoDentroDeCasa);//package
        System.out.println(esposa.formaDeFalar);//protected
        System.out.println(esposa.todosSabem);//public
    }
}
