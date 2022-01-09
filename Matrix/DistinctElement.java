import java.util.*;
import java.util.Collections;
import java.util.Scanner;
public class DistinctElement {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int i,j;
	int row = sc.nextInt();
	int arr[][]= new int[row][row];
	for(i=0;i<arr.length;i++)
	{
	for(j=0;j<arr[0].length;j++)
	{
	arr[i][j]=sc.nextInt();
	}
	}
	searchDistinct(arr);
}

public static void searchDistinct(int arr[][])
{
int i,j;
HashMap<Integer,Integer> map= new HashMap<>();
for(j=0;j<arr[0].length;j++)
{
	map.put(arr[0][j], 1);
}
for(i=1;i<arr.length;i++)
{
for(j=0;j<arr[0].length;j++)
{
if(map.containsKey(arr[i][j])&&map.get(arr[i][j])==i)
{
	map.put(arr[i][j],i+1);
}
if(i==arr.length-1&&map.containsKey(arr[i][j])&&map.get(arr[i][j])==arr.length)
{
System.out.println(arr[i][j]);	
}	
}
}
}
}


