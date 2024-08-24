import java.util.*;
class HelloWorld {
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
        boolean flag=true;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]!=arr[j][i]){
                    flag=false;
                    break;
                }
            }
        }
        if(flag==true){
            System.out.println("Symmetric");
        }
        else{
            System.out.println("Not Symmetric");
        }
    }
}