package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Numfunc, horasTrab;
		double salarioHora, salario;
		
		//ENTRADA
		Numfunc = sc.nextInt();
		horasTrab = sc.nextInt();
		salarioHora = sc.nextDouble();
		
		//PROCESSAMENTO
		salario = salarioHora * horasTrab;
		
		//SAÍDA
		System.out.printf("NUMBER = %s %nSALARY = U$ %.2f", Numfunc, salario);
		
		sc.close();
		
	}

}
