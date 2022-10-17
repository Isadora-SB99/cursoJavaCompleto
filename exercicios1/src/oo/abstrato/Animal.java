package oo.abstrato;
/*
 * classe tem 100% dos metodos implementados
 * interface tem 0% dos metodos implementados
 * abstract é um meio termo, pode ter alguns metodos implementados e outros não
 */
public abstract class Animal {
    
    public String respirar(){
        return "usando oxigênio";
    }

    public abstract String mover();
}
