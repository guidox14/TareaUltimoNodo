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
public class TareaEdgarV2 {
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
