package lambdas;

public class Multiplicar implements Calculo {

    @Override
    public double excecutar(double a, double b) {
        return a*b;
    }
    
}
