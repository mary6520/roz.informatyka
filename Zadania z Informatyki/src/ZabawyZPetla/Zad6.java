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
//Napisz program, który wypisuje liczby z przedzia³u (a,b), gdzie a i b podane jest przez u¿ytkownika. 
//Zwróæ uwagê na to, ¿e przedzia³ jest obustronnie otwarty.