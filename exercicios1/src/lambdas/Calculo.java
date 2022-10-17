package lambdas;

@FunctionalInterface
public interface Calculo {
    //metodo abstrato
    double excecutar(double a, double b);
    
    //metodo com implementação padrão
    default String legal(){
        return "legal";
    }

    //por isso não gera problema no uso de lambdas, só uma é abstrata
    static String muitoLegal(){
        return "muito legal";
    }
}
