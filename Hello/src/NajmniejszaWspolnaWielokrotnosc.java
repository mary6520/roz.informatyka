import java.util.Scanner;
public class NajmniejszaWspolnaWielokrotnosc {

	public static void main(String[] args) {

		wczytajLiczby();
	}

	private static void wczytajLiczby() {

		Scanner s = new Scanner(System.in);
		System.out.print("Podaj pierwsz¹ liczbê: ");
		int a = s.nextInt();

		Scanner n = new Scanner(System.in);
		System.out.print("Podaj drug¹ liczbê: ");
		int b = n.nextInt();

		int wynic = NWD(a, b);

		int wynik = NWW(a, b);
		System.out.print("Najmniejsz¹ wspóln¹ wielokrotnoœci¹ jest: " + wynik );
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

