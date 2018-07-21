package com.company;

public class NQueenProblem {

    final int N =4;

    public void PrintSolution(int board[][]){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++)
                System.out.println(" " + board[i][j]
                        + " ");

                System.out.println();

        }
    }

    boolean isSafe(int board[][], int row, int col){

        int i,j;
        /*Check this row on left side*/
        for(i=0; i<col;i++){
            if(board[row][i] ==1)
                return false;
        }
        /*Check upper diagonal on left side*/
        for(i=row, j=col; i>=0 && j>=0; i--, j--){
            if(board[i][j]==1)
                return false;
        }
        /*Check lower diagonal on left side*/
        for(i=row, j=col; j>=0 && i<N; i++, j--){
            if(board[i][j]==1)
                return false;

        }
        return true;
    }
        /*A recursive utility function to solve N*/
    boolean SolveNQUtil(int board[][], int col){
        /*Base case: if all queens are placed*/
        if(col>=N)
        return true;

        /*Consider this column and try placing the queen in all rows one by one. */
        for(int i=0; i<N; i++) {
            if (isSafe(board, i, col)) {

                /*Place the queen is [i][col]*/
                board[i][col] = 1;
                /*Recur to place rest of the queens*/
                if (SolveNQUtil(board, col + 1) == true)
                    return true;
                /*If placing queen in board[i]col] does'nt lead to a solution then remove queen from board[i][col]*/
                board[i][col] = 0;
            }
        }
        /*If the queen cannot be placed in any row in this col, then return false*/
        return false;
    }

    boolean SolveNQ(){

        int  board [][]={{0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };

        if(SolveNQUtil(board, 0)==false){
            System.out.println("Solution does not exists");
            return false;
        }

        PrintSolution(board);
            return true;
    }

    public static void main(String args[]){
        NQueenProblem queen = new NQueenProblem();
        queen.SolveNQ();
    }

}
