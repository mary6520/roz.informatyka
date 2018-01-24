import java.util.Scanner;

public class Taclice {

	private static void wczytaj(int[] a) {
		Scanner s = new Scanner(System.in);

		for(int i = 0; i<a.length; i++)

		{
			System.out.print("Podaj liczbê np " + i + ": ");
			a[i] = s.nextInt();
		}

	}//koniec wczytaj

	private static void wypisz(int[] a) {

		for(int i = 0; i< a.length; i++)

		{
			System.out.println("Liczba np " + i + "wynosi: " + a[i]);
		}
	}// koniec wypisz

	private static void zwiekszaj(int[] a, int ile) {

		for(int i = 0; i<a.length; i++)

		{
			a[i] = a[i] + ile;
		}
		
	}//koniec zwiêkszaj

	private static void wczytajIle(int ile) {
		System.out.print("O ile mam zwiêkszyæ: ");
		Scanner s = new Scanner(System.in);
		ile = s.nextInt();
	}
	public static void main(String[] args) {

		int[] a= new int [5];

		int ile = 12;
		wczytaj(a);
		zwiekszaj(a, ile);
		wypisz (a);

	}

}
