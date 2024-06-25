class Solution {
    public void setZeroes(int[][] matrix) {
        setZerosWithExtraSpace(matrix);
    }


    public static void setZerosWithExtraSpace(int[][] matrix)
    {
        //this approach uses extra space
        int r=matrix.length;
        int c=matrix[0].length;
        
        int row[]=new int[r];
        int col[]=new int[c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    //here we are setting the corresponding values of row and col as -1 instead of 0, 
                    //because by default all the value of row[] and col[] will be zero.
                    row[i]=-1; 
                    col[j]=-1;
                }
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(row[i]==-1 || col[j]==-1)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }

}
