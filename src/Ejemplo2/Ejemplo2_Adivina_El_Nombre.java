package Ejemplo2;

import javax.swing.*;
import java.lang.invoke.StringConcatException;

public class Ejemplo2_Adivina_El_Nombre {

    private static boolean error;

    public static void main(String[] args) {

        String Nombre;
        error = false;
        String Miembro= "Suga";

        try{
            Nombre = new String(JOptionPane.showInputDialog(null, "Ingresa un nombre", "Solicitando Datos", 3));

            if (Miembro.equals(Nombre)){
                JOptionPane.showMessageDialog(null, "Has adivinado, ya que ingresaste el nombre "+ Nombre + " y es igual a " + Miembro ,"Resultado", 1);


            }else {
                    System.out.println("El nombre ingresado "+Nombre+" no es igual a " + Miembro);
                    throw new StringConcatException(" Se presento un error ");
            }

        } catch(Exception e){
            System.out.println(e.getMessage()+" Error detectado");
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
