/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */

package com.mycompany.excepcionesej2;

/**
 *
 * @author Mile
 */
public class ExcepcionesEj2 {

    public static void main(String[] args) {
        int[] lista = {1, 4, 7, 9};
        
        try{
            System.out.println(lista[4]);
            
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El indice no existe");
        }
        
    }
}
