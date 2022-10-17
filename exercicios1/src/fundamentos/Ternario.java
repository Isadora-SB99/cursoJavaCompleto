package fundamentos;

public class Ternario {
    public static void main(String[] args) {
        //alterando a media, altera o resultado
        double media = 3.6;
        String resultadoParcial = media>=5.0 ? "em recuperação" : "reprovado";
        String resultadoFinal = media>= 7.0 ? "aprovado" : resultadoParcial;
        System.out.println("A media é: "+media+". o aluno está: "+resultadoFinal);

        //alterando a nota, altera o resultado
        double nota = 2.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado);

    }
}
