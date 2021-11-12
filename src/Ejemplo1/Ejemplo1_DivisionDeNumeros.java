package Ejemplo1;

import javax.swing.*;
/**
 * Clase principal que donde se genera una división de dos valores y genera exepciones cuando no es correcta alguna acción.
 *
 * @author Alisson Redondo.
 * @version 1.0
 * @since 12/11/2021
 */

public class Ejemplo1_DivisionDeNumeros {
    private static boolean error; //Variable booleana para el error
    public static void main(String[] args) {

       int x, y; // Variables que se utilizaran para realizar la división

       error = false; //La variable error toma el valor de false debido a que en esta parte aun no ha ocurrido ningún error
       try{
           x = Integer. parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero", "Solicitando Datos", 3));
           y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero ", "Solicitando Datos", 3));

           if (y==0){ //Se realiza una comparación para determinar si y es igual a cero
               throw new ArithmeticException("Error "); // En caso afirmativo se genera una excepción aritmética

           }else { // En caso contrario se muestra el resultado de la división de los valores ingresados por el usuario
               JOptionPane.showMessageDialog(null, "La división de "+ x + "/"+ y + "es" + (x/y),"Mostrando resultado", 1);

           }

       } catch (ArithmeticException ar) { //Se determina que se genero una excepción y se muestra por consola
           System.out.println(ar.getMessage() + "No se puede dividir entre cero");
           error = true; //Ya que se dio una excepcion el valor de error cambia a true

       }catch(Exception e){ //Aqui se determina cualquier otra excepción que no sea de tipo aritmético y se muestra por consola
           System.out.println(e.getMessage()+"Error");
           error = true; //Ya que se dio una excepción el valor de error cambia a true
       }
       finally {
           if (error== true) //Se valora si el valor de error es true, en caso afirmativo se muestra este mensaje en consola
               System.out.println("Hubo una excepción al ejecutar el código");
           else //En caso negativo se muestra este mensaje en consola
               System.out.println("El código se ejecutó satisfactoriamente");

       }
    }
}
