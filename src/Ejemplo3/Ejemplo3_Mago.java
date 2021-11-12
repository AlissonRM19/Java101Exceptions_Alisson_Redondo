package Ejemplo3;

import javax.swing.*;

/**
 * Clase principal que donde se presenta una ventana para ingresar un número y ver si es igual al que hay en el programa que es generado de forma aleatoria y genera exepciones cuando no es correcta alguna acción.
 *
 * @author Alisson Redondo.
 * @version 1.0
 * @since 12/11/2021
 */

public class Ejemplo3_Mago {
    private static boolean error; //Variable booleana para el error
    public static void main(String[] args) {

        double Num= Math.floor(Math.random()*6+1); //Se crea una variable Num de tipo double donde se generan números aleatorios

        int x; //Se crea una variable de tipo int

        error = false; //La variable error toma el valor de false debido a que en esta parte aun no ha ocurrido ningún error

        try{
            x = Integer. parseInt(JOptionPane.showInputDialog(null, "Ingresa un número", "Mago", 3));

            if (x==0){ //Se realiza la comparación para determinar si el valor ingresado es igual a cero
                throw new ArithmeticException("Error ");//En caso afirmativo se generara una excepción aritmética

            }else { // En caso contrario
                if (x==Num)  //Se realizara una comparación para determinar si el valor ingresado es igual a Num
                    JOptionPane.showMessageDialog(null, "Felicidades el número que ingresaste es "+ x + " Y el número a adivinar es "+ Num ,"Adivinaste", 1);
                else
                    JOptionPane.showMessageDialog(null, "Lo siento el número que ingreso es  "+ x + " Y el número a adivinar es "+ Num ,"Fallaste", 1);

            }
        } catch (ArithmeticException ar) { //Se determina que se genero una excepcion y se muestra por consola
            System.out.println(ar.getMessage() + "No se puede ingresar el número cero");
            error = true; //Ya que se dio una excepción el valor de error cambia a true

        } catch (NumberFormatException nr) {  //Se determina que se genero una excepción debido a que se ingreso una letra en lugar de un  número y se muestra por consola
            System.out.println(nr.getMessage() + " No es posible ingresar letras");
            error=true; //Ya que se dio una excepción el valor de error cambia a true

        }finally {
            if (error== true) //Se valora si el valor de error es true, en caso afirmativo se muestra este mensaje en consola
                System.out.println("Hubo una excepción al ejecutar el código");
            else //En caso negativo se muestra este mensaje en consola
                System.out.println("El código se ejecutó satisfactoriamente");

        }
    }
}
