import java.util.Scanner;
public class Zadanie5 {
	int m = 0;
	int k = 1;
	static int c = 2018;
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Podaj rok urodzenia: ");
		int a = s.nextInt();
		
		int d = c - a;

		Scanner p = new Scanner(System.in);
		System.out.print("Podaj p�e� (m/k): ");
		int b = p.nextInt();

mezczyzna(b,d);
	}


	private static void mezczyzna(int b, int d) {
		int e = 65 - d;
		
		if ( d == 65 || b == 0)
		{
			System.out.print("Mo�esz i�� na emerytur�");
		}
		else
			if (d < 65 || b == 0)
			{
				System.out.print("Musisz jeszcze pracowa� przez " + e + "lat");

			}		
	}
}
//Napisz program, kt�ry pyta u�ytkownika o rok urodzenia i p�e�. 
//Je�li jest to m�czyzna i ma co najmniej 65 lat lub kobieta maj�ca co najmniej 60 lat
//to informuje �Mo�esz i�� na emerytur�. 
//Je�li nie, to pojawia si� komunikat �Musisz jeszcze pracowa� przez XX lat�
//gdzie XX to odpowiednia warto��.