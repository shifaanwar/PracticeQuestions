package practice;

import java.util.*;
public class Median
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int i,j;
int rows =sc.nextInt();
int cols =sc.nextInt();
int arr[][]=new int[rows][cols];
for(i=0;i<arr.length;i++)
{
for(j=0;j<arr[0].length;j++)
{
arr[i][j]=sc.nextInt();
}
}
int oneNew[]= oneDimensional(arr);
findMedian(oneNew);
}
public static void findMedian(int oned[])
{
//int n = oned.length;
Arrays.sort(oned);
int median=oned[(oned.length)/2]; 
System.out.println("Median is "+median);
}
public static int[] oneDimensional(int arr[][])
{
int n= arr.length;
int m=arr[0].length;
int one[]=new int[m*n];
for(int row=0;row<arr.length;row++)
{
for(int col=0;col<arr[0].length;col++)
{
one[row+(col*arr.length)]=arr[row][col];
}
}
return one;
}
}
