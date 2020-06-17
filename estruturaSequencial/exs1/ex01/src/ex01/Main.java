package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, soma;
		
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		a = sc.nextInt();
		b = sc.nextInt();
		
		//PROCESSAMENTO
		soma = a + b;
		
		//SAÍDA
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}

}
