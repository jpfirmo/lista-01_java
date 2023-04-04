package teste01java;

import java.util.Scanner;

public class FPBq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("digite um número:");
		double número1 = entrada.nextDouble();
		System.out.println("digite um número:");
		double número2 = entrada.nextDouble();
		
		double adição = número1 + número2;
		double subtração = número1 - número2;
		double multiplicação = número1 * número2;
		double divisão = número1 / número2;
		System.out.println("valor da adição:" + adição);
		System.out.println("valor da subtração:" + subtração);
		System.out.println("valor da multiplicação:" + multiplicação);
		System.out.println("valor da divisão:" + divisão);
		
		
		
		
		
	}

}
