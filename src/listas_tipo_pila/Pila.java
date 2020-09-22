/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_tipo_pila;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class Pila {
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista ="";
    
    public Pila(){
        UltimoValorIngresado = null;
        tamano = 0;
    }
    /// metodo para saber si la pila esta vacia 
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
    //// metodo para insertar un nodo en la pila 
    public void InsertarNodo(int nodo){
        Nodo nuevoNodo = new Nodo(nodo);
        nuevoNodo.siguente = UltimoValorIngresado;
        UltimoValorIngresado = nuevoNodo;
        tamano++;
    }
    // Metodo para eliminar un nodo de la pila 
    public int EliminarNodo(){
        int Auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguente;
        tamano--;
        return Auxiliar;
    }
    //metodo para conocer cual es el ultimo valor ingresado 
    public int MostrarUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }
    // metodo para conocer el tañano de la pila 
    public int TamanoPila (){
        return tamano;
    }
    //metodo para vaciar la pila 
    public void VaciarPila(){
        while(!PilaVacia()){
            EliminarNodo();
        }
    }
    // metodo para elininar contenido la pil 
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        
        while (recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
    
}
