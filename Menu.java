package calculadora;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero (1-4) para escolher sua opera��o abaixo:");
		System.out.println("1 -> Adi��o");
		System.out.println("2 -> Subtra��o");
		System.out.println("3 -> Divis�o");
		System.out.println("4 -> Multiplica��o\n");
		
		int x = input.nextInt();
		
		switch (x) 
		{
		case 1:
			Adi��o.somar();
			break;
		case 2:
			Subtra��o.subtrair();
			break;
		case 3:
			Divis�o.dividir();
			break;
		case 4:
			Multiplica��o.multiplicar();
			break;
		default:
			System.out.println("N�mero inv�lido, tente novamente!");
		}
		input.close();
	}	
}