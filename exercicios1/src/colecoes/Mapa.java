package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    
    public static void main(String[] args) {
        // estrutura chave-valor
        Map<Integer,String> usuarios = new HashMap<Integer,String>();
        usuarios.put(1, "Roberto");//adiciona se não existir e subistitui caso já exista
        usuarios.put(2, "Ana");
        usuarios.put(3, "Bruna");
        usuarios.put(4, "Rafaela");
        System.out.println("map: "+usuarios);

        System.out.println("--------------------------------");

        usuarios.put(1, "Ricardo");
        System.out.println("map: "+usuarios);
        
        System.out.println("--------------------------------");
        System.out.println("chaves: "+usuarios.keySet());

        System.out.println("--------------------------------");
        System.out.println("valores: "+usuarios.values());

        System.out.println("--------------------------------");
        System.out.println("chaves e valor "+usuarios.entrySet());

        System.out.println("contem a chave? "+usuarios.containsKey(2));
        System.out.println("contem o valor? "+usuarios.containsValue("Ricardo"));

        System.out.println("mostra usuario pela chave procurada: "+usuarios.get(3));
        System.out.println("--------------------------------");

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }
        System.out.println("--------------------------------");
        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }
        System.out.println("--------------------------------");
        for (Entry<Integer,String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey()+" -> ");
            System.out.println(registro.getValue()+";");
        }

    }
}
