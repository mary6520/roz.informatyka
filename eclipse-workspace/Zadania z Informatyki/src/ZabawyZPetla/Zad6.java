package ZabawyZPetla;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Podaj a:");
		int a = s.nextInt();

		Scanner p = new Scanner (System.in);
		System.out.print("Podaj b:");
		int b = p.nextInt();

		for(int i=a+1; i<b; i++)
		{
			System.out.print(i +", ");
		}
	}

}
