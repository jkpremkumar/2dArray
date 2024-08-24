import java.util.*;
class HelloWorld {
    public static void snake(int[][] arr){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=arr[i].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int row=scan.nextInt();
       int col=scan.nextInt();
       int[][] arr=new int[row][col];
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               arr[i][j]=scan.nextInt();
           }
       }
       snake(arr);
    }
}