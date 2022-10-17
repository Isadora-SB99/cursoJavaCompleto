package fundamentos;

public class TiposPrimitivos {
    /*
    valores numericos inteiros; a diferença entre eles é a capacidade
     * byte: 1bytes
     * short: 2bytes
     * int: 4bytes
     * long: 8bytes
    
     valores numericos quebrados
     * float: 4bytes
     * double: 8bytes
    
     valores não numericos
     *char: caractere entre aspas simples = 1 letra
     * boolean: false ou true
    */
    public static void main(String[] args) {
        // Informações do funcionario
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
        //o "L" do final informa o prog que o numero é um long
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
    }
}
