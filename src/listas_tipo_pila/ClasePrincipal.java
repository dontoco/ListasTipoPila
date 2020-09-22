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
public class ClasePrincipal {

    public static void main(String[] args) {
        int opcion = 0;
        int nodo = 0;

        Pila pila = new Pila();

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opciones\n\n"
                        + "1 .Insertar Un Nodo\n"
                        + "2. Eliminar Un nodo\n"
                        + "3 .¿La fila esta vacia? \n"
                        + "4. ¿Cual es el ultimo valor Ingresado?\n"
                        + "5 .¿Cuantos nodos tiene la pila?\n"
                        + "6. Vaciar la pila\n"
                        + "7 .Mostrar contenido de la pila\n"
                        + "8. Salir.\n\n"));

                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingrese un valor a guardar en el nodo "));
                        pila.InsertarNodo(nodo);
                        
                        break;
                    case 2:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "se ha elinminado un nodo con el valor "
                            +pila.EliminarNodo());
                            
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "la pila esta vacia");
                            
                        }
                        break;
                    case 3:
                        if (pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "la Pila esta vacia ");
                            
                        }else{
                            JOptionPane.showMessageDialog(null, "la pila no esta vacia");
                            
                        }
                        break;
                    case 4:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "el ultimo valor ingresado es "
                                    + pila.MostrarUltimoValorIngresado());
                        }else{
                            JOptionPane.showMessageDialog(null, "la pila esta vacia ");
                        }

                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene " + pila.TamanoPila() + "nodos. ");
                        break;
                    case 6:
                        /// pila es diferente de pila vacia 
                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila");
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila esta vacia");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "la opcion ingresada no es correcta ");
                        break;
                }

            } catch (NumberFormatException e) {

            }
        } while (opcion != 8);

    }

}
