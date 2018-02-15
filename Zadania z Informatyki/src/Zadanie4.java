import java.util.Scanner;
public class Zadanie4 {

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
//U�ytkownik wprowadza liczb� i w wyniku otrzymuje jej silni�.
//Uwzgl�dni�, �e:SILNIA � iloczyn kolejnych liczb naturalnych 1 � 2 � � � n, oznaczany symbolem n!
//czyli �e s� to liczby naturalne (wi�ksze lub r�wne zero) oraz to, �e 0! = 1;
