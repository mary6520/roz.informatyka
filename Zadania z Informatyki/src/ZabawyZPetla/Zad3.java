package ZabawyZPetla;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Podaj n:");
		int n = s.nextInt();

		for(int i=n; i>=0; i--)
		{
			System.out.print(i +", ");
		}
	}

}
//Napisz program, który wypisuje liczby od n do 0 gdzie n to liczba ca³kowita. 
//Ma je wypisaæ po przecinku.