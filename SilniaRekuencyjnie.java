import java.util.Scanner;
public class SilniaRekuencyjnie {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Podaj n do liczenia silni");
		int n = s.nextInt();
		int wynik = silnia(n);
		System.out.print("Silnia wynosi: " + wynik);
	}

	private static int silnia(int n) {
		if ( n == 0 ) return 1;
		else
			return n*silnia( n -1 );
	}

}
