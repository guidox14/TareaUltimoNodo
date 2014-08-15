/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareaultimonodo;

/**
 *
 * @author Adrian
 */
public class TareaVeronicaYMaFernanda {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* ListaDoble listaDoblePrueba = new ListaDoble();
        listaDoblePrueba.ImprimirListaDoble();
        listaDoblePrueba.AgregarNodofhhgzInicio("2");
        listaDoblePrueba.AgregarNodoInicio("1");
        listaDoblePrueba.AgregarNodoFinal("5");
        listaDoblePrueba.AgregarNodoPos("2", 2);
        listaDoblePrueba.AgregarNodoPos("4", 3);
        listaDoblePrueba.ImprimirListaDoble();*/
    }
    
}

    /*
 * Crea un nodo doble
*/
class NodoDoble {
    public NodoDoble Siguiente;
    public NodoDoble Anterior;
    public Object Dato;
    
    //Constructor vacÃ­o
    public NodoDoble()
    {
        Siguiente = null;
        Anterior = null;
        Dato = null;
    }
    
    //Constructor que define el objecto del nodo solamente
    public NodoDoble(Object dato)
    {
        Dato = dato;
        Siguiente = null;
        Anterior = null;
    }

    //Constructor que define el objetodel nodo y el nodo siguiente
    public NodoDoble(Object dato, NodoDoble siguiente)
    {
        Siguiente = siguiente;
        Dato = dato;
        Anterior = null;
    }

        private NodoDoble getSiguiente() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setSiguiente(NodoDoble siguiente) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

/*
 * Clase que tiene los mÃ©todos de la lista doble
*/
class ListaDoble {
    public NodoDoble PrimerNodo;
    public NodoDoble UltimoNodo;
    private int LargoLista;
    private NodoDoble dato; //¿QUÉ HACEN LAS VARIABLES DATO, PRINCIPIO, EXTREMO?
    public NodoDoble principio;
    public NodoDoble extremo;
       
    
    //Constructor VacÃ­o
    public ListaDoble()
    {
        PrimerNodo = null;
        principio = null;
          extremo = null;
    }
    
    //Imprime toda la lista
    public void ImprimirListaDoble()
    {
        if(PrimerNodo == null)
        {
            System.out.println("La lista estÃ¡ vacÃ­a");
        }
        else
        {
            NodoDoble tmp = PrimerNodo;
            while(tmp!=null) //¿PARA QUÉ HACER UN WHILE QUE LLEGUE HASTA NULO, SI SE TIENE ULTIMONODO?
            {
                System.out.println(tmp.Dato);
                tmp = tmp.Siguiente;
            }
        }
    }
    
    //Agrega un nodo al inicio de la lista
    public void AgregarNodoFinal(Object Dato)
    {
        NodoDoble nuevo;
        nuevo = new NodoDoble();
        nuevo.Dato = dato;
        nuevo.Siguiente = null;
        
        if(PrimerNodo == null)
        { //¿DONDE SE UTILIZA AQUÍ ÚLTIMONODO?
            PrimerNodo = new NodoDoble(dato);
            NodoDoble principio = nuevo;
            NodoDoble extremo = nuevo;
        }
        else
        {
            extremo.Siguiente = nuevo;
            extremo = nuevo;
        } 
        
    }
 
    public void eliminarNodoInicio(Object Dato)
    {
        if(PrimerNodo == dato)
        {
            PrimerNodo = new NodoDoble(null);
            Object información = principio.Dato;
            principio = null;
            extremo = null;
        }
        else
        {
            System.out.print("ERROR: Lista vacía");
        }
    }
}

        
         