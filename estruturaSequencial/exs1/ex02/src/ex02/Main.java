package ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		//ENTRADA
		raio = sc.nextDouble();
		
		//PROCESSAMENTO
		raio = Math.pow(raio, 2.0);
		area = raio * 3.14159;
		
		//SAÍDA
		System.out.printf("%.4f", area);
		
		sc.close();
		
	}

}
