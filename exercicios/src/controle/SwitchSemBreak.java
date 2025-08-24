package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa = "roxa";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verder":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "amarela":
			System.out.println("Sei o Heian Sandan");
			break;
		default:
			System.out.println("Não sei nada");
		}
		
		System.out.println("FIM!");
	}
	
}
