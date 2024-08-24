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
        highestrow(arr);
    }
    public static void highestrow(int[][] arr){
        int maxzeros=-1;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int zerocount=0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    zerocount++;
                }
            }
            if(zerocount>maxzeros||(zerocount==maxzeros && i>index)){
                    maxzeros=zerocount;
                    index=i;
                }
            }
        System.out.println(index);
    }
}