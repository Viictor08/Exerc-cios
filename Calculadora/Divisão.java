package calculadora;

import java.util.Scanner;

public class Divis�o {

	public static void dividir()
	{
		
	System.out.println("Voc� entrou na opera��o de divis�o.\n");
	
	Scanner input = new Scanner(System.in);
	
	int x, y, divide;
	
	System.out.print("Por favor digite um n�mero: \n");
	x = input.nextInt();
	System.out.print("Agora digite outro n�mero para realizar sua divis�o: \n");
	y = input.nextInt();
	
	divide = x/y;
	
	System.out.print("O resultado da divis�o �: " + divide);
	
	input.close();
	}
}