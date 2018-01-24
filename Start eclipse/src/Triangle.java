import java.util.Scanner;

public class Triangle{ 


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		scanner.close();
		
		if ( (a>0) && (b>0) && (c>0)
				&& (a+b>c) && (a+c>b) && (b+c>a) )
		{
			System.out.println("DA SIÊ ZBUDOWAÆ TRÓJK¥T");
		}
		else
		{
			System.out.println("NIE DA SIÊ ZBUDOWAÆ TRÓJK¥TA");

		}

	}
}

