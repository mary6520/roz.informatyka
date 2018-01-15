import java.util.Scanner;
public class AlgorytmEuklidesa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Podaj a do liczenia: ");
		int a = s.nextInt();

		Scanner n = new Scanner (System.in);
		System.out.print("Podaj b do liczenia: ");
		int b = n.nextInt();

		int wynik = NWD(a, b);
		System.out.print("Największy wspólny dzielnik wynosi: " + wynik);
	}

	private static int NWD(int a, int b) {
		// TODO Auto-generated method stub
		if (b == 0) return a;
		else
			return NWD(b, a % b);
	}


}
