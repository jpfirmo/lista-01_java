package teste01java;

import java.util.Scanner;

public class FPB_q8 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("digite o valor da conta:");
		
		double valortotal = entrada.nextDouble();
		double valorsemcentavos = (int) (valortotal)/3;
		
		double valorjoão = valorsemcentavos;
		double valorcarlos = valorsemcentavos;
		double valorpaulo = valortotal - valorcarlos - valorjoão;
		
		System.out.println("valor que joão deve pagar:" + (int) valorjoão + "r$");
		System.out.println("valor que carlos deve pagar:" + (int) valorcarlos + "r$");
		System.out.println("valor que paulo deve pagar:" + valorpaulo + "r$");
		
		
    
		
		
		
		
		
		
		
		
		
	}
}
