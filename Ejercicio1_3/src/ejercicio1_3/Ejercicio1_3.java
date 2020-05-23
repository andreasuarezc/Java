
package ejercicio1_3;

import javax.swing.JOptionPane;

public class Ejercicio1_3 {

    
    public static void main(String[] args) {
        
       float horasTrabajadas =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar la cantidad de horas trabajados por el operarior en el mes"));
       float valorHora = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el valor de la hora de trabajo"));
       
       float sueldoMensual = horasTrabajadas*valorHora;
       
        System.out.println("El sueldo mensual del operario es:");
        System.out.println(sueldoMensual);
    }
    
}
