package Ejemplo3;

import javax.swing.*;

public class Ejemplo3_Mago {
    private static boolean error;
    public static void main(String[] args) {

        double Num= Math.floor(Math.random()*6+1);

        int x;

        error = false;

        try{
            x = Integer. parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero", "Mago", 3));

            if (x==0){
                throw new ArithmeticException("Error ");

            }else {
                if (x==Num)
                    JOptionPane.showMessageDialog(null, "Felicidades el numero que ingresaste es "+ x + " Y el numero a adivinar es "+ Num ,"Adivinaste", 1);
                else
                    JOptionPane.showMessageDialog(null, "Lo sientoel numero que ingreso es  "+ x + " Y el numero a adivinar es "+ Num ,"Fallaste", 1);

            }
        } catch (ArithmeticException ar) {
            System.out.println(ar.getMessage() + "No se puede ingresar el numero cero");
            error = true;

        } catch (NumberFormatException nr) {
            System.out.println(nr.getMessage() + " No es posible ingresar letras");
            error=true;

        }finally {
            if (error== true)
                System.out.println("Hubo una excepción al ejecutar el código");
            else
                System.out.println("El código se ejecutó satisfactoriamente");

        }
    }
}
