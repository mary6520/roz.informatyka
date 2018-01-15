import java.util.Scanner;
public class PotęgaRekuencyjnie {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Podaj n do liczenia potęgi: ");
int n = s.nextInt();

Scanner a = new Scanner (System.in);
System.out.print("Podaj p do podstawy potęgi: ");
int p = a.nextInt();

int wynik = potega(n, p);
System.out.print("Potęga wynosi: " + wynik);
	}

	private static int potega(int n, int p) {
		if( p == 0 ) return 1;
		else
			return n*potega( n, p -1 );
	}

}
