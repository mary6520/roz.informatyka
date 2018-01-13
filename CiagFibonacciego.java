import java.util.Scanner;
public class CiagFibonacciego {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Podaj, który wyraz ciagu Fibonacciego obliczyć: ");
		int n = s.nextInt();
		
		int wynik = fib(n);
		System.out.println("ty wyraz ciagu Fibonacciego: " + fib(n));

	}

	private static int fib(int n) {

		if ( n == 0) return 0;
		else 
			if ( n == 1 ) return 1;
			else
				return fib(n-1)+fib(n-2);
	}

}
