
package principal;

import java.util.ArrayList;

public class ListasDinamicas {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Francisco");
        nombres.add("Ana");
        nombres.add("Rafael");
        nombres.add("Jose");
        nombres.add("Maria");
        System.out.println(nombres.size());
        for(int i=0;i<nombres.size();i++){
            System.out.println("El valor en el indice "+ i +", es: "+nombres.get(i));
        }
        System.out.println("------------SE ELIMINO UN REGISTRO DE LA LISTA DINAMICA");
        nombres.remove(4);
        System.out.println(nombres.size());
        for(int i=0;i<nombres.size();i++){
            System.out.println("El valor en el indice "+ i +", es: "+nombres.get(i));
        }
        nombres.clear();
        boolean vacia = nombres.isEmpty();
        
        if(vacia){
            System.out.println("LA LISTA ESTA VACIA");
        } else {
            System.out.println("LA LISTA CONTIENE DATOS");
        }
        
    }
    
}
