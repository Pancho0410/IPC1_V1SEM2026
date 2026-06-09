
package principal;


public class Insercion {
    
    public static void main(String[] args) {
        int[] numeros = {8,4,7,5,3};
        
        System.out.println("------------------------------ARREGLO INICIAL---------------------------------");
        for(int i = 0;i<numeros.length;i++){
            System.out.println("Valor en la posicion "+ i +": "+numeros[i]);
        }
        
        System.out.println("------------------------------ARREGLO ORDENADO--------------------------------");
        
        for(int i=1;i<numeros.length;i++){
            int actual = numeros[i];
            int j = i - 1;
            while(j>=0 && (numeros[j]>actual)){
                numeros[j+1]= numeros[j];
                j--;
            }
            numeros[j+1]=actual;
        }
        
        for(int i = 0;i<numeros.length;i++){
            System.out.println("Valor en la posicion "+ i +": "+numeros[i]);
        }
        
    }
    
}
