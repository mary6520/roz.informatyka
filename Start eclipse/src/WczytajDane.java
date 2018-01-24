import java.util.Scanner;

public class WczytajDane 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Podaj imiê: ");
		String name = scanner.nextLine();
		System.out.print("Podaj wiek: ");
		int wiek = scanner.nextInt();
		

		scanner.close();
		
		
		System.out.println("Witaj, "+name);
		System.out.println("Wiek, "+wiek);
		
		
		



	}

}