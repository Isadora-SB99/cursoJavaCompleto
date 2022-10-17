package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        System.out.println("é par "+isPar.test(22));
        System.out.println("tem 3 digitos "+ isTresDigitos.test(36));

        System.out.println("é par E tem 3 digitos "+isPar.and(isTresDigitos).test(122));
        System.out.println("é par OU tem 3 digitos "+isPar.or(isTresDigitos).test(123));
        
    }
}
