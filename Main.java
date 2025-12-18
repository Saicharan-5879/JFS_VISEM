import java.util.*;
class Main
{	
	public static boolean pali_function(String s, int i,int j)
	{
		if(i>=j)
		{
			return true;
		}
		else if(s.charAt(i)!=s.charAt(j))
		{
			return false;
		}
		else
		{
			return pali_function(s,i+1,j-1);
		}
			
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i=0,j=s.length()-1;
		if(pali_function(s,i,j))
		{
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a Palindrome");
		}
    }
}