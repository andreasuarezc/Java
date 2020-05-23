
package ejercicio2_2;

import javax.swing.JOptionPane;

public class Ejercicio2_2 {

    
    public static void main(String[] args) {
       float nota1 =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingesar la primer nota"));
       float nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar la segunda nota"));
       float nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar la tercera nota"));
       float promedio = (nota1+nota2+nota3)/3;
       if(promedio>=7){
           System.out.println("PROMOCIONADO");
       }
    }
    
}
