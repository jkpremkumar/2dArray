import java.util.*;
public class Main{
  public static void main(String argss[]){
    Scanner scan=new Scanner(System.in);
    int row=scan.nextInt();
    int column=scan.nextInt();
    int[][] a=new int[row][column];
    int[][] b=new int[row][column];
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        a[i][j]=scan.nextInt();
        b[i][j]=scan.nextInt();
      }
    }
  if(matrixIdentical(a,b)){
    System.out.print("HOMOGENEOUS");
  }
  else{
    System.out.println("NOT HOMOGENEOUS");
    }
  }
}
  public static boolean matrixIdentical(int[][] a,int[][] b){
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++){
        if(a[i][j]!=b[i][j]){
          return false;
        }
      }
    }
    return true;
  }