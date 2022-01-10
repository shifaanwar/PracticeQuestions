package practice;

import java.util.Scanner;

public class UpperLowerTriangle {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i,j;
int rows = sc.nextInt();
int cols = sc.nextInt();
int arr[][]= new int[rows][cols];
for(i=0;i<arr.length;i++)
{
for(j=0;j<arr[0].length;j++)
{
 arr[i][j]=sc.nextInt();
}
}
System.out.println("Upper Triangular Matrix :");
UpperTriangulardisplay(arr);
System.out.println("Lower Triangular Matrix :");
LowerTriangulardisplay(arr);
}
public static void UpperTriangulardisplay(int arr[][])
{
for(int row=0;row<arr.length;row++)
{
for(int col=0;col<arr[0].length;col++)
{
if(row>=col)
System.out.print(arr[row][col]+" ");
else
System.out.print("0"+" ");
}
System.out.println();
}
}
public static void LowerTriangulardisplay(int arr[][])
{
for(int row=0;row<arr.length;row++)
{
for(int col=0;col<arr[0].length;col++)
{
if(row<=col)
System.out.print(arr[row][col]+" ");
else
System.out.print("0"+" ");
}
System.out.println();
}
}
}
