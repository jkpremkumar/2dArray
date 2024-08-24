import java.util.*;
public class Main{
  public static boolean toeplitz(int[][] arr){
    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr[i].length-1;j++){
        if(arr[i][j]!=arr[i+1][j+1]){
          return false;
        }
      }
    }
    return true;
  }
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int row=scan.nextInt();
    int col=scan.nextInt();
    int[][] arr=new int[row][col];
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        arr[i][j]=scan.nextInt();
      }
    }
    if(toeplitz(arr)){
      System.out.println("Toeplitz matrix");
    }
    else{
      System.out.println("Not a Toeplitz matrix");
    }
  }