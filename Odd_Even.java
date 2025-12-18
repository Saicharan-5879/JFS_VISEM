import java.util.*;
class Odd_Even
{
	public static void main(String args[])
	{
		int []arr = {12,27,7,4,6,2,3,5,1,16};
					Arrays.sort(arr);

		int n = arr.length;
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				odd.add(arr[i]);
			}
			if(arr[i]%2==0)
			{
				even.add(arr[i]);
			}
		}
		odd.addAll(even);
			System.out.println(odd);
	}
}
		
		