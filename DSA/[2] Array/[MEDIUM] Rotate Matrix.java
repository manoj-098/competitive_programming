class Solution {
    public void rotate(int[][] matrix) {
        Approach2(matrix);
    }

    public static void Approach2(int[][] matrix)
    {
        //First Transpose the matrix and then reverse it
        int r=matrix.length;
        int c=matrix[0].length;

        //Transpose
        for(int i=0;i<r;i++)
        {
            for(int j=i;j<c;j++) //start from i and not from 0
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r/2;j++)
            {     
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][r-1-j];
                matrix[i][r-1-j]=temp;
            }
        }

    }

    public static void Approach1(int[][] matrix)
    {
                // 00-02
        // 01-12
        // 02-22

        // 10-01
        // 11-11
        // 12-21

        // 20-00
        // 21-10
        // 22-20
        
    //APPROACH - 1
        int r=matrix.length;
        int c=matrix[0].length;
        int [][]temp=new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                temp[j][r-i-1]=matrix[i][j];
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=temp[i][j];
            }
        }
    }
}
