package fundamentos;

public class Wrapper {
    public static void main(String[] args) {
/*
 * a versão com letra minuscula é primitiva; a versão com letra maiuscula é objeto
 */
		Byte b = 100; // byte
        Short s = 1000; //short
		// Integer.parseInt(entrada.next());
		Integer i = 10000; // int
		Long l = 100000L; //long

        //s.

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
		
		
	}
}
