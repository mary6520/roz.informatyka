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
		System.out.print("Podaj p³eæ (m/k): ");
		int b = p.nextInt();

mezczyzna(b,d);
	}


	private static void mezczyzna(int b, int d) {
		int e = 65 - d;
		
		if ( d == 65 || b == 0)
		{
			System.out.print("Mo¿esz iœæ na emeryturê");
		}
		else
			if (d < 65 || b == 0)
			{
				System.out.print("Musisz jeszcze pracowaæ przez " + e + "lat");

			}		
	}
}
//Napisz program, który pyta u¿ytkownika o rok urodzenia i p³eæ. 
//Jeœli jest to mê¿czyzna i ma co najmniej 65 lat lub kobieta maj¹ca co najmniej 60 lat
//to informuje „Mo¿esz iœæ na emeryturê”. 
//Jeœli nie, to pojawia siê komunikat „Musisz jeszcze pracowaæ przez XX lat”
//gdzie XX to odpowiednia wartoœæ.