package calculadora;

import java.util.Scanner;

public class Divisão {

	public static void dividir()
	{
		
	System.out.println("Você entrou na operação de divisão.\n");
	
	Scanner input = new Scanner(System.in);
	
	int x, y, divide;
	
	System.out.print("Por favor digite um número: \n");
	x = input.nextInt();
	System.out.print("Agora digite outro número para realizar sua divisão: \n");
	y = input.nextInt();
	
	divide = x/y;
	
	System.out.print("O resultado da divisão é: " + divide);
	
	input.close();
	}
}