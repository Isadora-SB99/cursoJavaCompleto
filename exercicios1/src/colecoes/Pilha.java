package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        
        Deque<String> livros = new ArrayDeque<String>();
        livros.add("O Pequeno Príncipe"); //cria exceção
		livros.push("Don Quixote"); //retorna true ou false?
		livros.push("O Hobbit");

        System.out.println(livros);
        System.out.println(livros.peek());

        System.out.println(livros.poll());//retorna null
        System.out.println(livros);

        livros.push("O diario da princesa");
        System.out.println(livros);
        System.out.println(livros.peek());

        System.out.println(livros.pop());//retorna exceção
        //System.out.println(livros.remove());

        // livros.size();
		// livros.clear();
		// livros.contains();
		// livros.isEmpty();
    }
}
