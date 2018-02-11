package PodanieInformacji;

import java.util.Scanner;

public class Zadanie {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Podaj pierwsz� liczb�:");
		int a = s.nextInt();

		Scanner p = new Scanner (System.in);
		System.out.print("Podaj drug� liczb�:");
		int b = p.nextInt();

		liczbaPierwszaJest(a);

		liczbaDrugaJest(b);

		sprawdzCzy(a, b);

	}

	private static void sprawdzCzy(int a, int b) {
		if(a % b == 0)
		{
			System.out.println("Pierwsza liczba jest podzielna przez drug�");
		}
		
		if(a % b != 0) 
		{
			System.out.println("Pierwsza liczba nie jest podzielna przez drug�");
		}
		
		if(b == 0)
		{
			System.out.println("Nie mo�na dzieli� przez zero");
		}
		
	}

	private static void liczbaDrugaJest(int b) {
		if(b>0)
		{
			System.out.println("Druga liczba jest wi�ksza od zera");
		}

		if(b<0)
		{
			System.out.println("Druga liczba jest mniejsza od zera");
		}
		
		if(b == 0)
		{
			System.out.println("Druga liczba jest r�wna zero");		
		}
	}

	private static void liczbaPierwszaJest(int a) {
		if(a>0)
		{
			System.out.println("Pierwsza liczba jest wi�ksza od zera");
		}

		if(a<0)
		{
			System.out.println("Pierwsza liczba jest mniejsza od zera");
		}
		
		if(a == 0)
		{
			System.out.println("Pierwsza liczba jest r�wna zero");
		}
	}

}
