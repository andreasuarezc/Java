
package ejercicio4_1;

import javax.swing.JOptionPane;

public class Ejercicio4_1 {

    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el día"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el mes"));
        int año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el año"));
        
        if (mes==12){
            System.out.println("La fecha corresponde a Navidad");
        }
    }
    
}
