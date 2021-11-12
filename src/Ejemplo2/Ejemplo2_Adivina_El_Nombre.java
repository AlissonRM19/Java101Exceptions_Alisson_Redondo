package Ejemplo2;

import javax.swing.*;
import java.lang.invoke.StringConcatException;
/**
 * Clase principal que donde se presenta una ventana para ingresar un nombre y ver si es igual al que hay en el programa y genera exepciones cuando no es correcta alguna acción.
 *
 * @author Alisson Redondo.
 * @version 1.0
 * @since 12/11/2021
 */
public class Ejemplo2_Adivina_El_Nombre {

    private static boolean error; //Variable booleana para el error

    public static void main(String[] args) {

        String Nombre; //Se crea una variable de tipo string
        error = false; //La variable error toma el valor de false debido a que en esta parte aun no ha ocurrido ningún error
        String Miembro= "Felix";  //Esta variable de tipo string corresponde al nombre que el usuario debera de adivinar

        try {
            Nombre = new String(JOptionPane.showInputDialog(null, "Ingresa un nombre", "Solicitando Datos", 3));

            if (Miembro.equals(Nombre)) { //Se realiza una comparación para determinar si el nombre que ingreso el usuario es igual al nombre que hay en la variable Miembro
                // En caso afirmativo se muestra el un mensaje donde se indica que ha adivinado el nombre
                JOptionPane.showMessageDialog(null, "Has adivinado, ya que ingresaste el nombre " + Nombre + " y ese es el nombre correcto", "Resultado", 1);


            } else {
                System.out.println("El nombre ingresado " + Nombre + " no es igual a " + Miembro);
                throw new StringConcatException(" Se presento un error "); // En caso negativo se genera una excepción
            }
        }catch (StringConcatException sr){ //Se determina que se genero una excepción y se muestra por consola
            System.out.println(sr.getMessage() + "Error");
            error = true; //Ya que se dio una excepción el valor de error cambia a true

        } catch(Exception e){ //Aqui se determina cualquier otra excepción y se muestra por consola
            System.out.println(e.getMessage()+" Error detectado");
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
