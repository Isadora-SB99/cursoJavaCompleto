package fundamentos;

public class DesafioLogicos {
    public static void main(String[] args) {
        //trabalho terça (v ou f)
        //trabalho quinta (v ou f)
        /*
         * se os dois trabalhos derem certo, vou comprar TV 50 olegadas pra familia
         * se só um der certo a TV é de 32 polegadas
         * independente da TV, se a familia for no shopping, tomam sorvete juntos;
         * se os dois trabalhos derem errado
         */
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);

    }
}
