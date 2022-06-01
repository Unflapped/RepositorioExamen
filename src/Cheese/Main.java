/*
*	grupo  :Victor Manuel Gomez Alvarez
*	alumno :1ºGDAM
*	n.exp. :7239
*	fecha  :01/06/2022
        //Version final
 */
package Cheese;

/**
 *
 * @author ___
 */
public class Main {
    
     public static void main(String[] args) {
         Producto P1= new Producto("c1","astuariana",2,20);
         Producto P2= new Producto("c2","gallega",4,10);
         ListaProductos l1=new ListaProductos();
         
         l1.addProducto(P1);
         l1.addProducto(P2);
         //HABIA UN ERROR EN EL ANTERIOR COMMIT
         P1.imprime_etiqueta();
         
    }
}
