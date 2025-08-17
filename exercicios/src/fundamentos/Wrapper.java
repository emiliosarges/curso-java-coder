package fundamentos;

public class Wrapper {

	public static void main(String[] args) {
		
		
		Byte b = 1;      //byte
		Short s = 1000; //short
		Integer i = Integer.parseInt("123"); //int - convertendo uma string para int. 
		Long l = 1000000L; //long
		
		System.out.println(b.doubleValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		System.out.println(b * 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");   //boolean
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
				
	}
}
