import java.util.Scanner;

public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("podaj liczbe wierszy");
		System.out.println("podaj liczbe bloków");
		

		scanner.close();
		
		for(int i = 0; i < 10; i++)
		{
			for(int j=0; j < 8; j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
