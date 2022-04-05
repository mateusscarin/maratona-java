package br.com.introducao.arrays;

public class ArraysMultidimensionais01 {

    public static void main(String[] args) {

        int[][] dias = new int[3][3];
        dias[0][0] = 46;
        dias[0][1] = 47;
        dias[0][2] = 48;

        dias[1][0] = 36;
        dias[1][1] = 37;
        dias[1][2] = 38;

        dias[2][0] = 26;
        dias[2][1] = 27;
        dias[2][2] = 28;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
   
    }
}
