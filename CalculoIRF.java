package alura;

import java.util.Locale;
import java.util.Scanner;

public class CalculoIRF {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu salário: ");
		
		double salario = sc.nextDouble();
		double impostoTotal;
		double imposto;
		double teste;
		
		if ( salario <= 2000.0) {
			System.out.println("Isento");
		}else if (salario >= 2000.01 && salario <=3000.0) {
			imposto = 1000 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
			
		}else if (salario <=4500.0) {
			imposto = (1000 * 0.08) + ((salario - 3000.0) * 0.18);
			System.out.printf("R$ %.2f%n", imposto);
			
		}else if (salario > 4500.0) {
			
			imposto = ((1000 * 0.08) + ((4500 - 3000.01) * 0.18));
			imposto += ((salario - 4500.0) * 0.28);
			
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		
	sc.close();	
	}
}
