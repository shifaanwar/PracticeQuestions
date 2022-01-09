import java.util.Scanner;

public class HashFirst {
public static void main(String args[])
{
	    int n,i,result = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of rows");
	    n = sc.nextInt();
	    int arr[]=new int[n];
	    int h[]=new int[6];
	    for(i=0;i<n;i++)
	    {
	      arr[i]=sc.nextInt();
	      h[arr[i]]++;
	    }
	    int max = h[1];
	    for(i=2;i<6;i++)
	    {
	       if(max<h[i])
	       {
	       max=h[i];
	       result=i;
	       }
	    }
	    System.out.println(result);
	}
}
