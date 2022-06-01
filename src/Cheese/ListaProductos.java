/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;


public class ListaProductos {

    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;


    
    private int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    private boolean check_null(String campo){
    
        if (campo.replace(" ","") == "")  return true; else return false;
    }
    /**
     * 
     * @param prod, este basicamente es una isntanciacion del objeto producto con todas las propiedades que este contiene
     * @return si encuentra un producto con el mismo codigo devuelve un valor nulo, en caso de no existir otro proucto con este coodigo devuelve el producto 
     */
    public Producto addProducto(Producto prod) {
        
        if((prod.getcode()=="")||(prod.getcode()==null)){
            //En caso de que cadena vacia o nula
             return null;
        }
       
        else if (listaP.containsKey(prod.getcode())) {
            // System.out.println("Producto con código duplicado");
            return null;
        }
        n++;
        this.setN(n);
        listaP.put(prod.getcode(), prod);
        return prod;
    }
    /**
     * 
     * @param codigo, es el String identificador del producto 
     * @return producto eliminado
     */
    public Producto eliminarProducto(String codigo) { 
        if(codigo==null||codigo==""){
            //En caso del que el codigo sea nulo o este vacio
            return null;
        }
        
        Producto prod = buscarProducto(codigo);
        if (prod != null) {
        listaP.remove(codigo);
        n--;
        this.setN(n);
        }
        return prod;
    }
    /**
     * 
     * @param codigo, al igual que en eliminar es el String que identifica al producto
     * @return en caso de no encontrar el codigo devuelve nulo y en caso de encontralo devuelve el codigo introducido
     */

    public Producto buscarProducto(String codigo) { 
        if(codigo==null||codigo==""){
            //En caso del que el codigo sea nulo o este vacio
            return null;
        }
        Producto prod = null;
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }
    /**
     * 
     * @return delvuelve la lista de productos añadidos
     */
    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    /**
     * 
     * @return devuelve la cantidad de productos totales almacenados en la variable n 
     */
    public int totalProductos(){
            return this.getN();
    }
}
