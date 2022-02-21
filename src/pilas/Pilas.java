
package pilas;

import java.util.Stack;

public class Pilas {


    public static void main(String[] args) {
      
        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println(pila);
        
        pila.push(50);
        pila.push(30);
        pila.push(90);
        pila.push(26);
        pila.push(46);
        pila.push(96);
        
        
        System.out.println("IMPRIMIR LA PILA LIFO: " +pila);
        
        System.out.println("IMPRIMIR PRIMER ELEMENTO: "+pila.firstElement());
        
        System.out.println("IMPRIMIR ULTIMO ELEMENTO: "+pila.lastElement());
        
        System.out.println("IMPRIMIR TAMAÑO DE LA PILA: "+pila.size());
        
        System.out.println("BUSCAR INDICE DEL ELEMENTO: "+pila.search(90));
        
        System.out.println("REMOVER PRIMER ELEMENTO: "+pila.remove(0));
        
        System.out.println("REMOVER ULTIMO ELEMENTO: "+pila.remove(3));
        
        pila.push(37);
        pila.push(67);
        pila.push(77);
        
        System.out.println("REMOVER PRIMER ELEMENTO: "+pila.remove(0));
        System.out.println("REMOVER SEGUNDO ELEMENTO: "+pila.remove(1));
        
        
        System.out.println("IMPRIMIR LA PILA FIFO");
       
        while (pila.empty()==false){
              System.out.println(pila.pop());
              }

        
       System.out.println("IMPRIMIR LA PILA FIFO");
       
       while (pila.empty()==false){
              System.out.println(pila.pop());
       }
        
       System.out.println("ELIMINAR TODOS LOS ELEMENTOS");
       
       pila.removeAllElements();
       
         while (pila.empty()==false){
              System.out.println(pila.pop());
              }
       
             
    }
    
}
