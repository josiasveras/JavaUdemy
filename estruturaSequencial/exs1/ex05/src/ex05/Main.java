package ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2, qtdPecas1, qtdPecas2;
		double valorUniPeca1, valorUniPeca2, valorTotal;
		
		//ENTRADA
		codPeca1 = sc.nextInt();
		qtdPecas1 = sc.nextInt();
		valorUniPeca1 = sc.nextDouble();
		
		codPeca2 = sc.nextInt();
		qtdPecas2 = sc.nextInt();
		valorUniPeca2 = sc.nextDouble();
		
		//PROCESSAMENTO
		valorTotal = (qtdPecas1 * valorUniPeca1) + (qtdPecas2 * valorUniPeca2);
		
		//SAÍDA
		System.out.printf("VALOR A PAGAR: %.2f", valorTotal);
		
		sc.close();
	}

}
