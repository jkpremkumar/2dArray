import java.util.*;
public class Main{
  public static boolean checkSparse(int[][] arr,int result){
    int count=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if(arr[i][j]==0){
          count++;
          }
      }
    }
    if(count>=result){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int row=scan.nextInt();
    int col=scan.nextInt();
    int result=row*col/2;
    int[][] arr=new int[row][col];
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        arr[i][j]=scan.nextInt();
      }
    }
    if(checkSparse(arr,result)){
      System.out.println("Sparse Matrix");
    }
    else{
      System.out.println("Not a Sparse Matrix");
    }
  }
}