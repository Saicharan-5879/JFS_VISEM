import java.util.*;
class printNum
{
	public static int print(int n)
	{
		if(n<=0) return 0;
		
		return n%10+print(n/10);
	}
	public static void main(String args[])
	{
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int a = print(n);
		System.out.print(a);
	}
}
		