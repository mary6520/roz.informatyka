package ZabawyZPetla;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Podaj n:");
		int n = s.nextInt();

		for(int i=0; i<=n; i++)
		{
			System.out.print(i +", ");
		}
	}

}
//Napisz program, kt�ry wypisuje liczby od 0 do podanego n gdzie n to liczba ca�kowita. 
//Ma je wypisa� po przecinku (czyli 0,1, 2, 3, �, n).