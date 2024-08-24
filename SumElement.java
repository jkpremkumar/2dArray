import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int row=scan.nextInt();
    int column=scan.nextInt();
    int[][] arr=new int[row][column];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<column;j++)
      {
        arr[i][j]=scan.nextInt();
      }
    }
    Sumelement(arr);
  }
  public static void Sumelement(int[][] arr)
  {
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        sum+=arr[i][j];
      }
    }
    System.out.print("Sum of All Elements of the Matrix is "+sum);
  }
}