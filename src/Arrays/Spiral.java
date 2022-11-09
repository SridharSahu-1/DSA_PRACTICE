package Arrays;

public class Spiral {
    /*
    Print a given matrix in spiral form
Given a 2D array, print it in spiral form.
Examples:
Input:
{{1, 2, 3, 4},
{5, 6, 7, 8},
{9, 10, 11, 12},
{13, 14, 15, 16 }}

Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
     */
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16 }};
        int w=0;
        int x=arr.length-1;
        int y=0;
        int z=arr[0].length-1;
        while(w<=x && y<=z){
            for(int i=0;i<=z;i++){
                System.out.print(arr[w][i]+" ");
            }
            for(int i=w+1;i<=x;i++){
                System.out.print(arr[i][z]+" ");
            }
            if(w+1 <=x){
                for(int i=z-1;i>=y;i--){
                    System.out.print(arr[x][i]+" ");
                }
            }
            if(y+1 <=z){
                for(int i=x-1;i>=w;i--){
                    System.out.print(arr[i][y]+" ");
                }
            }
        w++;
        x--;
        y++;
        z--;
        }
    }
}
