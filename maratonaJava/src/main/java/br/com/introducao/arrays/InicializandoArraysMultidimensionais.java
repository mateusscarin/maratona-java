package br.com.introducao.arrays;

public class InicializandoArraysMultidimensionais {

    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1, 2, 3};
        arrayInt[1] = new int[]{3, 2, 1};
        arrayInt[2] = new int[]{1, 2, 3};

        for (int[] arrBase : arrayInt) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
