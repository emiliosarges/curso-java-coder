package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		//Trabalho na terca  trabTerca (V ou F)
		//Trabalho na quinta trabQuinta (V ou F)
		
		//Se trabTerca e TrabQuinta derem certo => Comprar TV 50 Pol
		//Se trabTerca ou exclusivo trabQuinta => Comrpa tv 32 Pol
		
		//Se TrabTeca e TrabQuinta || TrabTerca Ou ou TrabQuinta => Comprar Sorvete para comemorar
		
		Boolean trabalho1 = true;
		Boolean trabalho2 = true;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("O trabalho de terça deu certo? Digite 1 para sim ou 0 para não: ");
		int resposta1 = teclado.nextInt();
		
		if (resposta1 == 1) {
			trabalho1 = true;
		}  else {
			trabalho1 = false;
		};
		
		System.out.print("O trabalho de Quinta deu certo? Digite 1 para sim e 0 para não: ");
		int resposta2 = teclado.nextInt();
		
		if (resposta2 == 1) {
			trabalho2 = true;
		} else {
			trabalho2 = false;
		};
		
		teclado.close();
		
		System.out.println("Trabalho de terça deu certo? " + trabalho1.toString().replace("true", "sim").replace("false", "não"));
		System.out.println("Trabalho de quinta deu certo? " + trabalho2.toString().replace("true", "sim").replace("false", "não"));
		
		if (trabalho1 && trabalho2) {
			System.out.println("Os dois trabalhos deram certo. Vamos comprar a TV de 50\" e tomar sorvete");
		}
		
		if (trabalho1 ^ trabalho2) {
			System.out.println("Apenas um trabalho deu certo, vamos comprar a TV de 32\" e tomar sorvete");
		}
		
		if ((!trabalho1 && !trabalho2)) {
			System.out.println("Nenhum trabalho deu certo, não vamos comprar TV e nem tomar sorvete");
		}
		
	}

}
