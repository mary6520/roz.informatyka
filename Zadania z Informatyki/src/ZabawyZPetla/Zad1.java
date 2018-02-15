package ZabawyZPetla;
import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		System.out.print("Podaj n:");
		int n = s.nextInt();

		for(int i=0; i<=n; i++)
		{
			System.out.println(i +" ");
		}

	}

}
//Napisz program, który wypisuje liczby od 0 do podanego n gdzie n to liczba ca³kowita. 
//Ma je wypisaæ jedn¹ pod drug¹.