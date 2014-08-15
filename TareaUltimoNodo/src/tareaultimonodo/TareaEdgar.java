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
public class TareaEdgar {
     public static void main(String [] args)
    {
        DobleNueva listaDoble = new DobleNueva();
        listaDoble.ImprimirLista();
        listaDoble.AgregarNodoDeInicio("4");
        listaDoble.AgregarNodoDeInicio("2");
        listaDoble.AgregarNodoFinal("5"); 
        listaDoble.EliminarNodoInicial();
        listaDoble.EliminarNodoFinal();
        listaDoble.ImprimirLista();
  
    }
}

class NuevoNodoDoble {
    
    public NuevoNodoDoble Siguiente; // 'NodoDoble' ya no existe en este proyecto
    public NuevoNodoDoble Anterior;
    public Object Dato;
    
    //Constructor vacío
    public NuevoNodoDoble()
    {
        Siguiente = null;
        Anterior = null;
        Dato = null;
      
    }
    
    //Constructor que define el objecto del nodo solamente
    public NuevoNodoDoble(Object dato)
    {
        Dato = dato;
        Siguiente = null;
        Anterior = null;
    }

    //Constructor que define el objetodel nodo y el nodo siguiente
    public NuevoNodoDoble(Object dato, NuevoNodoDoble siguiente)
    {
        Siguiente = siguiente;
        Dato = dato;   
        Anterior = null;
    }
}

/*
 * Se crea la lista doble
*/
class DobleNueva {
    
    public NuevoNodoDoble primerNodo;
    public NuevoNodoDoble nodoFinal;
    
    //Constructor Vacío
    public DobleNueva()
    {
        primerNodo = null;
        nodoFinal = null;
    }
    
    //Imprime toda la lista
    public void ImprimirLista()
    {
       if(primerNodo == null)
        {
            System.err.println("La lista esta vacia \n");
        }
        else
        {
            NuevoNodoDoble tmp = primerNodo;
            while(tmp != null) // ¿POR QUÉ HASTA NULL, SI YA LA LISTA TIENE UN ÚLTIMO NODO?
            {
                System.err.println ("Datos de la lista:  " + tmp.Dato + "\n"); //¿POR QUÉ UN SYSTEM.ERR, SI ERA UN SYSTEM.PRINTLN?
                tmp = tmp.Siguiente;
            }
            }
        }
    
    
    //Se agrega el primer nodo
    
    public void AgregarNodoDeInicio(Object dato)
    {
        if(primerNodo == null)
        {
            primerNodo = new NuevoNodoDoble(dato);
            nodoFinal = primerNodo;
           //System.out.print( "Primer nodo: "+ dato);
        }
        else
        { //¿QUÉ PASÓ CON ÚLTIMO NODO AQUÍ?
            NuevoNodoDoble Nodotmp = new NuevoNodoDoble(dato);
            Nodotmp.Siguiente = primerNodo;
            primerNodo.Anterior = Nodotmp;
            primerNodo = Nodotmp;
            System.out.print( "Dato del primer nodo: "+ dato+ "\n");
        }
    }
    
  
    //Agregar nodo al final de las lista 
    public void AgregarNodoFinal(Object valor)
    {
        if(nodoFinal == null)
        {
            nodoFinal = new NuevoNodoDoble(valor);
            primerNodo = nodoFinal;
        }
        else
        {
            NuevoNodoDoble tmp = new NuevoNodoDoble();
            nodoFinal.Siguiente = tmp;
            tmp.Anterior = nodoFinal;
            nodoFinal = tmp;
           System.out.print("Dato del nodo final: "+ valor + "\n");
        }
    }
    
       //Eliminar el primer nodo 
     public void EliminarNodoInicial()
    {  
         if(primerNodo == null) {
             System.out.print("La lista se encuentra vacía \n");
         }
         else if(primerNodo !=null) {
            primerNodo = primerNodo.Siguiente;
            primerNodo.Anterior= null;
            System.out.print("Se elimina el nodo inicial \n");  
    }     else{
             System.out.print("La lista se encuentra vacia \n");
    }           
    }
   
     //Elimina el nodo final de la lista
    
    public void EliminarNodoFinal()
    {
        if(nodoFinal == null){
            System.out.print("La lista se encuentra vacía \n");   
        }
        else{
             nodoFinal = nodoFinal.Anterior;
             nodoFinal.Siguiente = null;
           System.out.print( "Se borró el nodo final \n"); 
        }
    }
  }

/////////////////////////////////////////////////

//Código Pilas


/**
 *
 * @author Edgar
 */
class Pila {
    
        public static void main(String[] ar) {
            
        Pila pila=new Pila();
        pila.push(10);
        pila.push(40);
        pila.push(3);
        pila.imprimir();
        System.out.println("Salida de Pila pop: "+pila.pop());
        pila.imprimir();        
    }
        
    class Nodo {
        int info;
        Nodo siguiente;
    }
	
    private Nodo nodo;
    
    public Pila () {
        nodo=null;
    }
    
    public void push(int x) {
    	Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        if (nodo==null)
        {
            nuevo.siguiente = null;
            nodo = nuevo;
        }
        else
        {
            nuevo.siguiente = nodo;
            nodo = nuevo;
        }
    }
    
    public int pop ()
    {
        if (nodo!=null)
        {
            int informacion = nodo.info;
            nodo = nodo.siguiente;
            return informacion;
        }
        else
        {
            return Integer.MAX_VALUE;
        }
    }
    
    public void imprimir() {
        Nodo nodoinicial=nodo;
        System.out.println("Lista de elementos: ");
        while (nodoinicial!=null) {
            System.out.print(nodoinicial.info+" - ");
            nodoinicial=nodoinicial.siguiente;
        }
        System.out.println();
    }
    

}

////////////////////

//Colas


/**
 *
 * @author Edgar
 */
class Cola {
    
      public static void main(String[] ar) {
        Cola cola=new Cola();
        cola.offerCola(5);
        cola.offerCola(10);
        cola.offerCola(50);
        cola.imprimir();
        System.out.println("Salida de la cola: "+cola.pollCola());
        cola.imprimir();        
    }
      
    class Nodo {
        int dato;
        Nodo siguiente;
    }
    
   private Nodo primerNodo,ultimoNodo;
    
    Cola() {
        primerNodo=null;
        ultimoNodo=null;
    }
    
    public boolean condicion (){
        if (primerNodo == null)
            return true;
        else
            return false;
    }

    public void offerCola (int info)
    {
        Nodo nodo;
        nodo = new Nodo ();
        nodo.dato = info;
        nodo.siguiente = null;
        if (condicion ()) {
            primerNodo = nodo;
            ultimoNodo = nodo;
        } else {
            ultimoNodo.siguiente = nodo;
            ultimoNodo = nodo;
        }
    }

    public int pollCola ()
    {
        if (!condicion ())
        {
            int informacion = primerNodo.dato;
            if (primerNodo == ultimoNodo){
                primerNodo = null;
                ultimoNodo = null;
            } else {
                primerNodo = primerNodo.siguiente;
            }
            return informacion;
        } else
            return Integer.MAX_VALUE;
    }

    public void imprimir() {
        Nodo nodo=primerNodo;
        System.out.println("Listado de elementos de la cola");
        while (nodo!=null) {
            System.out.print(nodo.dato+" - ");
            nodo=nodo.siguiente;
        }
        System.out.println();
    }
        
  
}
