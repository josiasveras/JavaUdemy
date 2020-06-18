package ex06;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaTriRet, areaCirc, areaTrap, areaQuad, areaRet;
		
		//ENTRADA
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		//PROCESSAMENTO
		areaTriRet = a * c / 2;
		areaCirc = Math.pow(c, 2) * 3.14159;
		areaTrap = (((a + b) * c) / 2);
		areaQuad = b * b;
		areaRet = a * b;
		
		//SAÍDA
		System.out.printf("TRIANGULO: %.3f %n", areaTriRet);
		System.out.printf("CIRCULO: %.3f %n", areaCirc);
		System.out.printf("TRAPEZIO: %.3f %n", areaTrap);
		System.out.printf("QUADRADO: %.3f %n", areaQuad);
		System.out.printf("RETANGULO: %.3f %n", areaRet);
		
		sc.close();
		
	}

}
