package com.company;

public class faceDrawing {
    private String[][] faceFeat;
    public faceDrawing(String[][] faceFeat){
        this.faceFeat= faceFeat;
    }
    public void fill(String str){
        for (int col= 0; col<faceFeat[col].length; col++  ){
            for (int row=0; row<faceFeat.length; row++){
                faceFeat[row][col]= str;
            }
        }
    }

    public void edit(String replace, int row, int col){
        faceFeat[row][col]=replace;
    }

    public String toString{
        String face= "";
        for (int col= 0; col<faceFeat[col].length; col++  ){
            for (int row=0; row<faceFeat.length; row++) {
                face = face + faceFeat[row][col] + " ";
            }
            face= face + /n;
    }
}
