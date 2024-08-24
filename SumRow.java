import java.util.*;
class HelloWorld {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int col=scan.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        sumrowele(arr);
    }
       public static void sumrowele(int[][] arr){
           for(int i=0;i<arr.length;i++){
               int sum=0;
               for(int j=0;j<arr[i].length;j++){
                   sum+=arr[i][j];
               }
               System.out.println(sum);
           }
        }
}