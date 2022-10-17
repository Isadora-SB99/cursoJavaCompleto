package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        
        System.out.println("forma tradicional...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }
        
        //mais flexível, podemos concatenar...
        System.out.println("\nLamba #01");
        //se tem só um parametro (nome), não precisa de parenteses
        //novamente, sendo só uma linha de codigo, não precisa de chaves
        aprovados.forEach(nome -> System.out.println(nome +"!!!"));

        //modo mais fixo, só imprime o que está diretamente na lista
        System.out.println("\nMethod Reference #01");
        aprovados.forEach(System.out::println);

        System.out.println("\nLamba #02");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference #02");
        aprovados.forEach(Foreach::meuImprimir);

    }

    static void meuImprimir(String nome){
        System.out.println("Oi! Meu nome é "+nome);
    }
}
