package calculadora;

import java.util.Scanner;

public class Adi��o 
{
	
	public static void somar() 
	{
		
		System.out.println("Voc� entrou na opera��o de Adi��o.\n");
		
		Scanner input = new Scanner(System.in);
		
		float x, y, soma;
		
		System.out.print("Por favor digite um n�mero: \n");
		x = input.nextFloat();
		System.out.print("Agora digite outro n�mero para realizar sua soma: \n");
		y = input.nextFloat();
		
		soma = x + y;
		
		System.out.print("O resultado da soma �: " + soma);
		
		input.close();
	}
}