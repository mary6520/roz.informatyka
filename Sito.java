import java.util.Scanner;
public class Sito {

	public static void main(String[] args) {

		int n = spytajIleLiczb();
		
		boolean liczby[] = new boolean[n] ;

		liczSito(liczby);
		
		wypiszLiczbyPierwsze(liczby);


	} // end main
	

	private static int spytajIleLiczb() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Do jakiej liczby? ");
		int n = s.nextInt();		
		return n;
		
	} // end spytaj ile liczb


	private static void liczSito(boolean[] liczby) {

		for(int i = 0; i < liczby.length; i++)
		{
			liczby[i] = true;	
		}
		liczby[0] = false;	
		liczby[1] = false;	

		for(int i = 2; i < liczby.length / 2; i++ )
		{
			if( liczby[i] == true)
			{
				for(int j = i + i ; j < liczby.length; j = j + i)
				{
					liczby[j] = false;
				}
			}
		}

	} // end licz sito

	
	private static void wypiszLiczbyPierwsze(boolean[] liczby ) {

		for (int i = 0; i< liczby.length; i++)
		{
			if(liczby[i] == true)
			{
				System.out.println(i + ": " + liczby[i]);
			}
		}
	} // end wypisz liczby pierwsze


} // end klasy
