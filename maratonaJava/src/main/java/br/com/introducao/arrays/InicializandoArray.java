package br.com.introducao.arrays;

public class InicializandoArray {
    
    public static void main(String[] args) {
        
        int numeros[] = {0,1,2,3};
        int numeros2[] = new int[]{3,2,1,0};
        int numeros3[] = {0,1,2};
        
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        for (int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        
        for(int i : numeros3){
            System.out.println(i);
        }
    }
}
