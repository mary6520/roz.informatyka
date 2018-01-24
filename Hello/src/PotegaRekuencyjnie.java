import java.util.Scanner;

public class PotegaRekuencyjnie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.print("Podaj n do liczenia potegi: ");
		int n = s.nextInt();
		
		Scanner a = new Scanner (System.in);
		System.out.print("Podaj p do podstawy potegi: ");
		int p = a.nextInt();
		int wynik = potega(n, p);
		System.out.println("Potêga wynosi: " + wynik );
	}

	private static int potega(int n, int p) {
		// TODO Auto-generated method stub
		if( p == 0 ) return 1;
		else 
			return n*potega( n, p - 1 );
	}


}
