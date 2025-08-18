package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1.123453124134; //conversao implicita
		System.out.println(a);
		
		float b = (float) 1.123453124134; // conversao explicita (CAST)
		System.out.println(b);
		
		int c = 240;
		byte d = (byte) c; // explicita
		System.out.println(d);
		
		double e = 1.999;
		int f = (int) e;
		System.out.println(f);
	}

}
