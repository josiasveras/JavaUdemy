package ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		//ENTRADA
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		//PROCESSAMENTO
		diferenca = ((a * b) - (c * d));
		
		//SAÍDA
		System.out.print(diferenca);
		
		sc.close();
		
	}

}
