package teste01java;

import java.util.Scanner;

public class FPB_q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("pães vendidos:");
		int paes = entrada.nextInt();
		System.out.println("broas vendidas:");
		int broas = entrada.nextInt();
		
		double valorpães = paes * 0.12;
		double valorbroas = broas * 1.50;
		double valortotal = valorpães + valorbroas;
		double valordapoupança = valortotal * 0.1;
		System.out.println("valor dos pães vendidos:" + valorpães);
		System.out.println("valor das broas vendidas:" + valorbroas);
		System.out.println("valor total da venda de pães e broas:" + valortotal);
		System.out.println("valor da poupança:" + valordapoupança);
		
		
		
		
		
		
		
		
	}

}
