package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    /*
     * duas funcoes lambdas pra fazer dois filtros diferentes
     * usar um map no final
     * 
     */
    public static void main(String[] args) {

        Fruta f1 = new Fruta("maçã", 2.5, false);
        Fruta f2 = new Fruta("banana", 2.0, true);
        Fruta f3 = new Fruta("morango", 18.0, true);
        Fruta f4 = new Fruta("uva", 9.8, false);
        Fruta f5 = new Fruta("pera", 5.99, true);
        Fruta f6 = new Fruta("jaca", 48.0, false);
        Fruta f7 = new Fruta("laranja", 3.8, true);
        /*
         * se o valor da fruta for <=10, o cliente vai levar aquela fruta
         * imprime as frutas que o cliente levou
         */

        List<Fruta> frutas = Arrays.asList(f1, f2, f3, f4, f5, f6, f7);
        
        //verifica se a fruta está na epoca
        Predicate<Fruta> ehEpoca = e -> e.estaNaEpoca==true;
        
        //verifica se a fruta é barata
        Predicate<Fruta> ehBarata = c -> c.precoPorKilo<=10;

        //puxa o nome das frutas que o cliente vai comprar
        Function<Fruta, String> vaiComprar  = n -> "O cliente vai comprar "+ n.nome;

        frutas.stream().filter(ehEpoca).filter(ehBarata).map(vaiComprar).forEach(System.out::println);

    }
}
