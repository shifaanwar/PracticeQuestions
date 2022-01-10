package practice;
import java.util.Scanner;
public class RotateWhole { //Rotate 180 degree
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 int i,j;
 int rows = sc.nextInt();
 int cols = sc.nextInt();
 int arr[][]=new int[rows][cols];
 for(i=0;i<arr.length;i++)
 {
 for(j=0;j<arr[0].length;j++)
 {
  arr[i][j]=sc.nextInt();
 }
 }
 rotateByRow(arr);
 rotateByCol(arr);
 display(arr);
}
public static void rotateByRow(int arr[][])
{
for(int col=0;col<arr[0].length;col++)
{
int left_index =0;
int right_index=arr.length-1;
while(left_index<right_index)
{
 int temp = arr[left_index][col];
 arr[left_index][col]=arr[right_index][col];
 arr[right_index][col]=temp;
 left_index++;
 right_index--;
}
}
}
public static void rotateByCol(int arr[][])
{
for(int row=0;row<arr.length;row++)
{
int left_index=0;
int right_index=arr[0].length-1;
while(left_index<right_index)
{
int temp = arr[row][left_index];
arr[row][left_index]=arr[row][right_index];
arr[row][right_index]=temp;
left_index++;
right_index--;
}
}
}
public static void display(int arr[][])
{
 for(int row=0;row<arr.length;row++)
 {
 for(int col=0;col<arr[0].length;col++)
 {
  System.out.print(arr[row][col]+" ");
 }
 System.out.println();
 }
}
}
