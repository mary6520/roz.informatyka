import java.util.Scanner;

public class Sumowanie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Podaj ile:");
		int ile = scanner.nextInt();
		
		scanner.close();

		int suma = 0;
		for(int i = 0; i <=ile; i++)
		{
			System.out.print(i +", ");
			suma = suma +i;
		}

	}


}
