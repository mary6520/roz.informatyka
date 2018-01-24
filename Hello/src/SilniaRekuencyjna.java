import java.util.Scanner;
public class SilniaRekuencyjna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.print("Podaj n do liczenia silni: ");
		int n = s.nextInt();
		int wynik = silnia(n);
		System.out.println("Silnia wynosi: " + wynik );

	}

	private static int silnia(int n) {
		if( n == 0 ) return 1;
		else return n*silnia( n-1 );

	}
}


