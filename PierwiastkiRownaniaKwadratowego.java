import java.util.Scanner;
public class PierwiastkiRownaniaKwadratowego {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Podaj pierwszą liczbę: ");
		int a = s.nextInt();

		Scanner n = new Scanner(System.in);
		System.out.print("Podaj pierwszą liczbę: ");
		int b = n.nextInt();

		Scanner p = new Scanner(System.in);
		System.out.print("Podaj pierwszą liczbę: ");
		int c = p.nextInt();

		double delta;

		if(a==0)
		{
			System.out.println("To nie jest funkcja kwadratowa");
		}
		else
		{
			delta=b*b-4*a*c;
			
			if (delta<0)
			{
				System.out.println("Brak rozwiązań.");
			}
			
			if(delta==0)
			{
				System.out.println("Równanie ma 1 pierwiastek, x1 = " + (-b/(2*a)) );
			}
			
			if(delta>0)
			{
				System.out.println("x1 = " + (-b-Math.sqrt(delta))/(2*a) );
				System.out.println("x2 = " + (-b+Math.sqrt(delta))/(2*a) );
			}
		}
	}

}

