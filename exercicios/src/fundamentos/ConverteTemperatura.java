package fundamentos;

public class ConverteTemperatura {
	public static void main (String[] args) {
		double fahrenheit = 98.6;
		
		final double diferenca = 32;
		final double multiplicador = 5.0 / 9.0;
		
		double celsius = (fahrenheit - diferenca) * multiplicador;
		
		System.out.println(fahrenheit + "°F = " + celsius + "°C");
		
		fahrenheit = 86.0;
		celsius = (fahrenheit - diferenca) * multiplicador;
		System.out.println(fahrenheit + "°F = " + celsius + "°C");
		
		fahrenheit = 150.0;
		celsius = (fahrenheit - diferenca) * multiplicador;
		System.out.println(fahrenheit + "°F = " + celsius + "°C");
		
	}
}
