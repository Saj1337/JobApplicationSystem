package jobApps;

import java.util.Scanner;

public class EasyScanner
{
	public static int nextInt() //integer
	{
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	
	public static double nextDouble() //double
	{
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		return d;
	}
	
	public static String nextString() //string
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}
	
	public static char nextChar() //character
	{
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		return c;
	}
}
