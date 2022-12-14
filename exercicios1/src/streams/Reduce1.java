package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
        
        BinaryOperator<Integer> soma = (ac, n) -> ac+n;

        Integer total1 = num.stream().reduce(soma).get();
        System.out.println(total1);

        Integer total2 = num.stream().reduce(100, soma);
        System.out.println(total2);

        //resultado foi um Opcional<Integer>...
        num.stream().filter(n -> n>10).reduce(soma).ifPresent(System.out::println);
    }
}
