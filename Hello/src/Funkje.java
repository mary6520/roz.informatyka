
public class Funkje 
{

	public static void napis(String tekst)
	{
		System.out.println("Przyj��em: " + tekst );
	}

	public static void napis()
	{
		System.out.println("Nic mi nie podano");
	}

	public static void napis(String tekst1, String tekst2)
	{
		System.out.println("Przyj��em: " + tekst1 + " oraz " + tekst2);
	}

	public static double policz( double x)
	{
		x = (x + 8.0) / 19;
		return x;
	}

	public static void main(String[] args) 
	{
		double wynik = policz(12);
		System.out.println("Po funkcji policz: " + wynik);

		napis();

		napis("indyk");

		napis("kaczka", "g�ska");
	}

}
