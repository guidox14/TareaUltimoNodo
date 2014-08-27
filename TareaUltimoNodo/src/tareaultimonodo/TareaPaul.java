/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareaultimonodo;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class TareaPaul {
        public static void main(String [] args)
    {
       /* ListaDobleNueva listaDobleNueva = new ListaDobleNueva();
        listaDobleNueva.ImprimirListaDobleNueva();
        listaDobleNueva.AgregarNodoInicioNuevo("4");
        listaDobleNueva.AgregarNodoInicioNuevo("2");
       // listaDobleNueva.AgregarNodoInicioNuevo("2");
        listaDobleNueva.AgregarNodoFinal("5"); 
        //listaDobleNueva.AgregarNodoFinal("3"); 
        listaDobleNueva.EliminarNodoInicio();
       // listaDobleNueva.EliminarNodoInicio();
       // listaDobleNueva.EliminarNodoInicio();
       // listaDobleNueva.EliminarNodoInicio();
        listaDobleNueva.EliminaNodoFinal();
        listaDobleNueva.ImprimirListaDobleNueva();*/
        
        PilaPaul PilaPrueba = new PilaPaul();
        PilaPrueba.PushPila("1");
        PilaPrueba.PushPila("12");
        PilaPrueba.PushPila("5");
        PilaPrueba.PopPila();
        PilaPrueba.PopPila();
        
        
     /*   Colas ColaPrueba = new Colas();
        ColaPrueba.OfferCola("6");
        ColaPrueba.OfferCola("2");
        ColaPrueba.PollCola();
        ColaPrueba.PollCola();*/
         
    }

}

/*
 * Crea un nodo doble
*/
class NuevoNodoDoblePaul {
    
    public NuevoNodoDoblePaul Siguiente;
    public NuevoNodoDoblePaul Anterior;
    public Object Dato;
    
    //Constructor vacío
    public NuevoNodoDoblePaul()
    {
        Siguiente = null;
        Anterior = null;
        Dato = null;
      
    }
    
    //Constructor que define el objecto del nodo solamente
    public NuevoNodoDoblePaul(Object dato)
    {
        Dato = dato;
        Siguiente = null;
        Anterior = null;
    }

    //Constructor que define el objetodel nodo y el nodo siguiente
    public NuevoNodoDoblePaul(Object dato, NuevoNodoDoblePaul siguiente)
    {
        Siguiente = siguiente;
        Dato = dato;   
        Anterior = null;
    }
}

/*
 * Clase que tiene los métodos de la lista doble
*/
class ListaDobleNuevaPaul {
    
    public NuevoNodoDoblePaul PrimerNodo;
    public NuevoNodoDoblePaul UltimoNodo;
    
    //Constructor Vacío
    public ListaDobleNuevaPaul()
    {
        PrimerNodo = null;
        UltimoNodo = null;
    }
    
    //Imprime toda la lista
    public void ImprimirListaDobleNueva()
    {
        
     
       if(PrimerNodo == null)
        {
            System.err.println("La lista esta vacia");
        }
        else
        {
            NuevoNodoDoblePaul tmp = PrimerNodo;
            while(tmp != null) //¿Por qué pregunta por nulo, si puede preguntar por último nodo?
            {
                JOptionPane.showMessageDialog(null,"elementos en la lista:  " + tmp.Dato);
                tmp = tmp.Siguiente;
            }
           /* NodoDoble ultimo = UltimoNodo;
            while (PrimerNodo.Siguiente == null)
            {
                System.out.println(ultimo.Dato);
                ultimo = ultimo.Siguiente;
        }*/
            }
        }
    
    
    //Agrega un nodo al inicio de la lista
    public void AgregarNodoInicioNuevo(Object dato)
    {

        if(PrimerNodo == null)
        {
            PrimerNodo = new NuevoNodoDoblePaul(dato);
            UltimoNodo = PrimerNodo;
            JOptionPane.showMessageDialog(null, "Primer Nodo y Ultimo Nodo tienen asignado el dato de: "+ dato);
        }
        else
        {
            NuevoNodoDoblePaul tmp = new NuevoNodoDoblePaul(dato);
            tmp.Siguiente = PrimerNodo;
            PrimerNodo.Anterior = tmp;
            PrimerNodo = tmp;
            JOptionPane.showMessageDialog(null, "Ahora Primer Nodo tiene el dato: "+ dato);
            
        }
    }
    
  
    //Agrega un nodo al final de la lista
    public void AgregarNodoFinal(Object dato)
    {
        if(UltimoNodo == null)
        {
            UltimoNodo = new NuevoNodoDoblePaul(dato);
            PrimerNodo = UltimoNodo;
        }
        else
        {
            NuevoNodoDoblePaul tmp = new NuevoNodoDoblePaul(); //No asignó aquí el valor de 'dato'
            UltimoNodo.Siguiente = tmp;
            tmp.Anterior = UltimoNodo;
            UltimoNodo = tmp;
            JOptionPane.showMessageDialog(null, "El nodo final tiene el valor ahora de : "+ dato);
        }
    }
    
    
    
    
       //Elimina un nodo al inicio de la lista
     public void EliminarNodoInicio()
    {
        
    if(PrimerNodo !=null) {
        
            PrimerNodo = PrimerNodo.Siguiente;
            PrimerNodo.Anterior= null;
            JOptionPane.showMessageDialog(null, "Primer Nodo se elimino ahora tiene el dato del nodo siguiente en la lista ");
            
    }
            
            else{
        
                   JOptionPane.showMessageDialog(null, "La lista esta vacia");
                    
                    }      
        
        
    }
    
    
     //Elimina un nodo al final de la lista
    
    public void EliminaNodoFinal()
    {
       
        if(UltimoNodo == null){
            
            JOptionPane.showMessageDialog(null, "La lista esta vacia");     
        }
        else{
            
             UltimoNodo = UltimoNodo.Anterior;
             UltimoNodo.Siguiente = null;
           JOptionPane.showMessageDialog(null, "Se a borrado el nodo final"); 
        }
    }
     }
/*

ESTA ES LA CLASE CON LOS METODOS PARA CONVERTIR A PILAS
ULTIMO EN ENTRAR PRIMERO EN SALIR

*/


    class PilaPaul {
        
    NodoDoble ObjetoTope;   
    Object Valor;

    
    
   //METODO PARA INTRODUCIR DATOS A UNA PILA

    public void PushPila (Object Valor){ //¿Por qué en este método tiene que llamar a Valor con mayúscula, si ya hay un Valor con mayúscula como variable global
     
   if (ObjetoTope == null){
       
       ObjetoTope = new NodoDoble(Valor);
       JOptionPane.showMessageDialog(null, "El valor de inicio de la lista es de: "+Valor);
   }
   else {
       
     NodoDoble item = new NodoDoble(Valor);
     ObjetoTope = item.Siguiente; //?E
     item.Siguiente = ObjetoTope;
     ObjetoTope = item;
     JOptionPane.showMessageDialog(null, " Se agregado un elemento a la lista");
   }
        
        
        
    }
    
    //ELIMINAR ULTIMO DATO DE LA PILA
    
    public void PopPila (){
        
        if (ObjetoTope == null){
            
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        
        else{
            
            ObjetoTope.Siguiente = ObjetoTope; //?
            ObjetoTope.Anterior = null;
            JOptionPane.showMessageDialog(null, "Se ha borrado el Ultimo  elemento en lista " );
            
        }
    }
     }


// ESTA LA CLASE CON EL CODIGO PARA COLAS
//PRIMERO EN ENTRAR PRIMERO EN SALIR


  class ColasPaul {
        
    NodoDoble ObjetoTope; 
    NodoDoble ObjetoFinal;
    Object Valor;
    
    
  
    public void OfferCola (Object Valor){
     
   if (ObjetoTope == null){
       
       ObjetoTope = new NodoDoble(Valor);
       ObjetoFinal = ObjetoTope;
       JOptionPane.showMessageDialog(null, "El valor de inicio de la lista es de: "+Valor);
   }
   else {
       
     NodoDoble item = new NodoDoble(Valor);
     ObjetoTope = item.Siguiente; //?
     item.Anterior = ObjetoTope; //¿.Anterior?
     ObjetoTope = item;
    /* NodoDoble NuevoNodo = ObjetoTope;
     while (NuevoNodo.Siguiente != null){
         
         NuevoNodo = ObjetoFinal;
     }*/
     JOptionPane.showMessageDialog(null, "Se agregado un elemento al inicio de la lista "+ Valor);
   }
        
        
        
    }
    
  
    public void PollCola (){
        
        if (ObjetoFinal == null){
            
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        
        else{
            
          ObjetoFinal = ObjetoFinal.Anterior;
          ObjetoFinal.Siguiente = null;
            
            JOptionPane.showMessageDialog(null, " El Ultimo elemento en la lista ha sido eliminado");
            
        }
    }

    }
