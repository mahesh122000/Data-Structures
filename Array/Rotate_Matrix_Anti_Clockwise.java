class Solution {
    void rotateMatrix(int matrix[][], int n) {
        for(int k=0;k<3;k++)
        {for(int i=0;i<n/2;i++)
        {for(int j=i;j<n-i-1;j++)
        {int t=matrix[i][j];
        matrix[i][j]=matrix[n-j-1][i];
        matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
        matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
        matrix[j][n-i-1]=t;}}}
}}