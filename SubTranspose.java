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
                if(arr.length!=arr1.length){
                    System.out.print("Subtarction cannot performed for rectangular matrix"); 
                    break;
                }
                sum[i][j]=arr[i][j]-arr1[i][j];
                System.out.print(" "+sum[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int  n=scan.nextInt();
        int col=scan.nextInt();
        int[][] arr=new int[n][col];
        int[][] arr1=new int[n][col];
        int[][] sum=new int[n][col];
        for(int i=0;i<n;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        transpose(arr,arr1,sum);
    }
}