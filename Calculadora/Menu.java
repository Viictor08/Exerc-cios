package calculadora;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número (1-4) para escolher sua operação abaixo:");
		System.out.println("1 -> Adição");
		System.out.println("2 -> Subtração");
		System.out.println("3 -> Divisão");
		System.out.println("4 -> Multiplicação\n");
		
		int x = input.nextInt();
		
		switch (x) 
		{
		case 1:
			Adição.somar();
			break;
		case 2:
			Subtração.subtrair();
			break;
		case 3:
			Divisão.dividir();
			break;
		case 4:
			Multiplicação.multiplicar();
			break;
		default:
			System.out.println("Número inválido, tente novamente!");
		}
		input.close();
	}	
}