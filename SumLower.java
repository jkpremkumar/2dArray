import java.util.*;
public class Main{
  public static void sumLower(int[][] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
        if(i>=j){
        sum+=arr[i][j];
        }
      }
    }
    System.out.println(sum);
  }
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int[][] arr=new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j]=scan.nextInt();
      }
    }
    sumLower(arr);
  }
}