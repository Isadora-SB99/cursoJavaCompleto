package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
    //hashSet imprime na ordem "que quiser" (SET não tem ordem)
        //Set<String> listaAprovados = new HashSet<String>();
    //treeSet ordena os itens pela ordem de inserção
    //sortedSet (pro treeSet), conjuntos ordenados. que aceita ordenação
        SortedSet<String> listaAprovados = new TreeSet<String>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		// nums.get(1); Não é possível acessar pelo índice
		
		for(int n: nums) {
			System.out.println(n);
		}
    }
}
