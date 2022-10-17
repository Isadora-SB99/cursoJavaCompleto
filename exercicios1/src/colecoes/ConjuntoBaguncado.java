package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto);
        System.out.println("tamanho é: "+conjunto.size());

        conjunto.add("Teste");
        System.out.println(conjunto);
        //System.out.println("tamanho é: "+conjunto.size());

        System.out.println("a remoção foi: "+conjunto.remove("teste"));
        System.out.println(conjunto.remove('x'));
        System.out.println(conjunto);
        System.out.println("tamanho é: "+conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println();

        HashSet nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);
        System.out.println();
        //conjunto.addAll(nums); //uniao entre dois conjuntos
        conjunto.retainAll(nums); //intersecção entre dois conjuntos
        System.out.println(conjunto);

        conjunto.clear(); //limpa o conjunto
        System.out.println(conjunto);
    }
}
