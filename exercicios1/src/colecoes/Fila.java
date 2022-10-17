package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        /*
         * Os dois metodos adicionam itens na fila
         * quando fila tem limite de tamanho:
         * .add cria exceção
         * .offer retorna true ou false caso consiga, ou não, adicionar o item na fila
         * como a fila não tem limite, não dará problema
        */
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println("a fila é composta por: "+ fila);

        /*
         * Os dois metodos mostram o primeiro item da fila.
         * caso a fila esteja vazia:
         * .peek retorna null
         * .element cria exceção
         */
        System.out.println(fila.peek()+" está na primeira posição");
        //System.out.println(fila.peek()+" está na primeira posição");
        System.out.println(fila.element()+" está na primeira posição");
        //System.out.println(fila.element()+" está na primeira posição");
        System.out.println("----------------------------------");
        System.out.println("a fila é composta por: "+ fila);

        //fila.clear();//limpa a fila
        //fila.size();//mostra o tamanho
        //fila.isEmpty();//retorna true ou false, caso esteja, ou não, vazia
        //fila.contains(item);//true ou false...
        System.out.println("----------------------------------");

        /*
         * Os dois metodos removem itens da fila
         * .pool remove o item da fila e retorna o item removido
         * se a fila estiver vazia, retorna null.
         * 
         * .remove também remove o item da fila e retorna o item removido,
         * mas se a fila estiver vazia ele cria exceção
         */
        System.out.println("Removendo: "+fila.poll());
        //System.out.println("a fila é composta por: "+ fila);
        System.out.println("Removendo: "+fila.remove());
        //System.out.println("a fila é composta por: "+ fila);
        System.out.println("Removendo: "+fila.poll());
        //System.out.println("a fila é composta por: "+ fila);
        System.out.println("Removendo: "+fila.poll());
        //System.out.println("a fila é composta por: "+ fila);
        System.out.println("Removendo: "+fila.poll());
        //System.out.println("a fila é composta por: "+ fila);
        System.out.println("Removendo: "+fila.poll());
        //System.out.println("a fila é composta por: "+ fila);
        System.out.println("Removendo: "+fila.poll());
        System.out.println("a fila é composta por: "+ fila);        
        //System.out.println("Removendo: "+fila.remove());

    }
}
