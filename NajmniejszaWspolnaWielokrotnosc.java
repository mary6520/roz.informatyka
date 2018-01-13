import java.util.Scanner;
public class NajmniejszaWspolnaWielokrotnosc {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Podaj pierwszą liczbę: ");
		int a = s.nextInt();

		Scanner n = new Scanner(System.in);
		System.out.print("Podaj drugą liczbę: ");
		int b = n.nextInt();

		int wynic = NWD(a, b);
		
		int wynik = NWW(a, b);
		System.out.print("Najmniejszą wspólną wielokrotnością jest: " + wynik );
	}

	private static int NWD(int a, int b) {
		if (b == 0) return a;
		else
			return NWD(b, a % b);
	}

	private static int NWW(int a, int b) {
		if( a == b ) return a;
		else
			return (a *b)/NWD(a, b) ;
	}



}

