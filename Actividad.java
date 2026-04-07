/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
/**
 *
 * @jannys limas
 */
public class Actividad {
    public static void main(String args[])
    {
        String nombre = JOptionPane.showImputDialog(" Digite su nombre ");
        int edad = Interger.parseInt(JOptionPane.showInputDialog("digite su edad"));
        String texto = "Hola, mi nombre es " + nombre + ", tengo " + edad + " años, y esta es la actividad de la exposición 6.";
        JOptionPane.showMessageDialog(null, texto);
    }
}
