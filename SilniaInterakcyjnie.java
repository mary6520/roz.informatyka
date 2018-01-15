import java.util.Scanner;
public class SilniaInterakcyjnie {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("Podaj n do liczenia silni: ");
		int n = s.nextInt();

		int wynik = silnia(n);
	}

	private static int silnia(int n) {
		if ( n == 0 ) return 1;
		else {
			int wynik = 1;
			for(int i =2; i<=n; i++)
				wynik = wynik *i;
			return wynik;
		}
	}
}
