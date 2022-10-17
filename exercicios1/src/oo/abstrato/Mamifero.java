package oo.abstrato;

public abstract class Mamifero extends Animal {


    @Override
    public final String mover() {
        return "saindo do lugar";
    }


    public abstract String mamar();
    
}
