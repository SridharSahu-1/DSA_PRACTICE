package Arrays;

class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
   int sum=0;
          int n = mat.length;
        for(int i=0;i<mat.length;i++){
            sum=sum+mat[i][i]+mat[i][n-1-i];
      }  
    if(n%2==0){
        return sum;
    }
    else{
       sum= sum-mat[n/2][n/2];
    }
       return sum; 
        }
}
