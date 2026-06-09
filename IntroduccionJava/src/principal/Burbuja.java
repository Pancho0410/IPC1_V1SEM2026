
package principal;


public class Burbuja {
    public static void main(String[] args) {
        int[] numeros = {8,4,7,5,3};
        
        System.out.println("------------------------------ARREGLO INICIAL---------------------------------");
        for(int i = 0;i<numeros.length;i++){
            System.out.println("Valor en la posicion "+ i +": "+numeros[i]);
        }
        
        System.out.println("------------------------------ARREGLO ORDENADO--------------------------------");
        
        for(int i = 0;i<(numeros.length -1);i++){
            for(int j=0;j<(numeros.length -1-i);j++){
                if(numeros[j]<numeros[j+1]){
                    int temporal = numeros[j]; //este valor pasara a la derecha
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temporal;
                }
            }
        }
        
        
        for(int i = 0;i<numeros.length;i++){
            System.out.println("Valor en la posicion "+ i +": "+numeros[i]);
        }
    }
    
}
