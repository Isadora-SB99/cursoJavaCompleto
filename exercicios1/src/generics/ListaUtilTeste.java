package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS","PHP","Java","C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("SEM USAR GENERICS...");
        String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem1);
        
        int ultimoNumero1 = (int) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero1);
        

        System.out.println("USANDO GENERICS...");
        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem2);

        int ultimoNumero2 = ListaUtil.getUltimo2(nums);
        System.out.println(ultimoNumero2);
    }
}
