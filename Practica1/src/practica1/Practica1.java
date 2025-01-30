/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Pablo Castro Rojas
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salario=0;
        String variabletemporal="";
        
        variabletemporal=JOptionPane.showInputDialog("Digite su salario:");
        salario=Double.parseDouble(variabletemporal);
        
        double SEM=salario*0.0925;
        double IVM=salario*0.0508;
        double CCSS=SEM+IVM;
        
        JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS el monto de "+CCSS+" por concepto de SEM y IVM");
    }
    
}
