package oo.heranca.desafio;

public class Carro {
    /*
     * velocidade atual;
     * muda velocidade de 5 em 5
     * met acelerar
     * met frear
     */
    public final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual;
    private int delta = 5;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar (){
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else{
            velocidadeAtual += getDelta();
        }
    }

    public void frear (){
        if (velocidadeAtual<=0) {
            System.out.println("O carro já está parado");
        }else{
            velocidadeAtual -= delta;
        }
    }
}
