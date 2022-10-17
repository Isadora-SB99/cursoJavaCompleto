package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import lambdas.Produto;

public class Filter {
    public static void main(String[] args) {
        //FIZ SOZINHA COM BASE NA EXPLICAÇÃO TEÓRICA:
        System.out.println("numeros...");
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);
        lista.stream().filter(n->n>5).forEach(System.out::println);

        System.out.println("\ncompras...");
        List<String> listaCompras = Arrays.asList("batata","arroz","feijão","ovo","carne","maçã");
        listaCompras.stream().filter(c -> c.length()<=4).forEach(System.out::println);

        
        Produto p1 = new Produto("notebook", 3250.99, 0.15);
        Produto p2 = new Produto("caneta", 2.50, 0.1);
        Produto p3 = new Produto("lápis", 1.50, 0.0);
        Produto p4 = new Produto("celular", 1998.99, 0.15);
        System.out.println("\nprodutos...");
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
        produtos.stream().filter(p -> p.preco > 1000).forEach(System.out::println);
        

        //EXEMPLOS COM BASE NA AULA DO CURSO
        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 5.8);
        Aluno a3 = new Aluno("Daniel", 9.8);
        Aluno a4 = new Aluno("Gui", 6.8);
        Aluno a5 = new Aluno("Rebeca", 7.1);
        Aluno a6 = new Aluno("Pedro", 8.8);

        System.out.println("\nAlunos...");
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        //fazendo direto na impressao
        //alunos.stream().filter(a -> a.nota>=7).map(a -> "Parabéns " +a.nome+"! Você foi aprovado(a)").forEach(System.out::println);

        //fazendo tudo separado em variaveis e depois só atribuindo as variáveis
        Predicate<Aluno> aprovado = a -> a.nota>=7;
        Function<Aluno, String> mensagem = a -> "Parabéns " +a.nome+"! Você foi aprovado(a)";
        alunos.stream().filter(aprovado).map(mensagem).forEach(System.out::println);
    
    }
}
