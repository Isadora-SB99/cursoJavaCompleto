package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        //Consumer<Integer> println = System.out::println;

        System.out.println("## Stream.of usando os valores literais...");
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n\n");
        langs.forEach(print);

        String[] maisLangs = {"Python ","Lisp ","Perl ", "Go\n\n"};

        System.out.println("## Stream.of passando um array...");
        Stream.of(maisLangs).forEach(print);

        System.out.println("## Arrays.stream passando um array...");
        Arrays.stream(maisLangs).forEach(print);

        System.out.println("## arrays.stream passando um array "
        +"e limitando quais vão ser impressos");
        Arrays.stream(maisLangs, 1, 2).forEach(print);

        System.out.println("## usando lista, chama o nome da lista.stream");
        List<String> outrasLangs = Arrays.asList("C ","PHP ","Kotling\n\n");
        outrasLangs.stream().forEach(print);

        System.out.println("## usando o nome da lista.parallelStream"
        +" (abre um stream paralelo, não imprime necessariamente na ordem que está a lista)");
        outrasLangs.parallelStream().forEach(print);

        System.out.println("## stream.generate, gera uma stream potencialmente infinita que não tem ordem");
        //Stream.generate(() -> "oi ").forEach(print);
        System.out.println("## stream.iterate, gera uma stream potencialmente infinita, porem ordenada");
        //Stream.iterate(0, n -> n+1).forEach(println);
    }
}
