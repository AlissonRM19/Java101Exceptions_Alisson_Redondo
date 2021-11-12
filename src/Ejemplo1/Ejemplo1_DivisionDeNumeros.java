package Ejemplo1;

import javax.swing.*;

public class Ejemplo1_DivisionDeNumeros {
    private static boolean error;
    public static void main(String[] args) {

       int x, y;

       error = false;
       try{
           x = Integer. parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero", "Solicitando Datos", 3));
           y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero ", "Solicitando Datos", 3));

           if (y==0){
               throw new ArithmeticException("Error ");

           }else {
               JOptionPane.showMessageDialog(null, "La division de "+ x + "/"+ y + "es" + (x/y),"Mostrando resultado", 1);

           }

       } catch (ArithmeticException ar) {
           System.out.println(ar.getMessage() + "No se puede dividir entre cero");
           error = true;

       }catch(Exception e){
           System.out.println(e.getMessage()+"Error");
           error = true;
       }
       finally {
           if (error== true)
               System.out.println("Hubo una excepción al ejecutar el código");
           else
               System.out.println("El código se ejecutó satisfactoriamente");

       }
    }
}
