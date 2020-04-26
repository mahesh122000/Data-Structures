class Sudoku
{
    static boolean SolveSudoku(int a[][])
    {
        int i=0,j=0;
        boolean flag=true;
        one:for(i=0;i<9;i++)
        {for(j=0;j<9;j++)
        {if(a[i][j]==0)
        {flag=false;
        break one;}}}
        if(flag)
        return true;
        for(int k=1;k<=9;k++)
        if(isSafe(a,i,j,k))
        {a[i][j]=k;
        if(SolveSudoku(a))
        return true;
        else
        a[i][j]=0;
        }
        return false; 
    }
    static boolean isSafe(int a[][],int i,int j,int n)
    {
        for(int k=0;k<9;k++)
        {if(a[i][k]==n)
        return false;}
        for(int k=0;k<9;k++)
        {if(a[k][j]==n)
        return false;}
        int x=i-i%3;
        int y=j-j%3;
        for(int p=x;p<x+3;p++)
        {for(int q=y;q<y+3;q++)
        {if(a[p][q]==n)
        return false;}}
        return true;
    }
    static void printGrid (int grid[][])
    {
        for(int i=0;i<9;i++)
        {for(int j=0;j<9;j++)
        System.out.print(grid[i][j]+" ");
        }
    }
}