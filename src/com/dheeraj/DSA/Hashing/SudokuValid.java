package com.dheeraj.DSA.Hashing;

import java.util.HashMap;

public class SudokuValid {
    public static void main(String[] args) {

    }
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Integer> []rows = new HashMap[9];
        HashMap<Integer,Integer>[]cols = new HashMap[9];
        HashMap<Integer,Integer> []boxes = new HashMap[9];
        for(int i=0;i<9;i++){
            rows[i] = new HashMap<Integer,Integer>();
            cols[i] = new HashMap<Integer,Integer>();
            boxes[i] = new HashMap<Integer,Integer>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num = board[i][j];
                int boxIndex = (i/3)*3+ j/3;
                if(num !='.'){
                    int n = (int)num;
                    rows[i].put(n,rows[i].getOrDefault(n,0)+1);
                    cols[j].put(n,cols[j].getOrDefault(n,0)+1);
                    boxes[boxIndex].put(n,boxes[boxIndex].getOrDefault(n,0)+1);

                    if(rows[i].get(n)>1 || cols[j].get(n)>1 || boxes[boxIndex].get(n)>1){
                        return false;
                    }
                }

            }
        }
        return true;
    }

}
