package teste01java;

import java.util.Scanner;

public class FPB_q7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("nome:");
		String nome = entrada.next();
		System.out.println("digite sua altura em metros:");
		double altura = entrada.nextDouble();
		System.out.println("digite seu peso em kg");
		double peso = entrada.nextDouble();
		
		double IMC = peso/(altura * altura);
		System.out.println("nome:" + nome);
		System.out.println("peso:" + peso + "kg");
		System.out.println("altura:" + altura + "M");
		System.out.println("IMC:" + IMC);
		
		
		
		
		
		
		
		
	}
}
