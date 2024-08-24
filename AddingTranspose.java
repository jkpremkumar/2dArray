 import java.util.*;
class HelloWorld {
    public static void transpose(int[][] arr,int[][] arr1,int[][] sum){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr1[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum[i][j]=arr[i][j]+arr1[i][j];
                System.out.print(" "+sum[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int  n=scan.nextInt();
        int[][] arr=new int[n][n];
        int[][] arr1=new int[n][n];
        int[][] sum=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        transpose(arr,arr1,sum);
    }
}