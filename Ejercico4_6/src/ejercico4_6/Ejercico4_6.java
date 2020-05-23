
package ejercico4_6;

import javax.swing.JOptionPane;

public class Ejercico4_6 {

    
    public static void main(String[] args) {
       
        float sueldo = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Ingresar el sueldo del operario"));
        float antiguedad = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Ingresar los años de antiguedad del operario"));
        
        if (sueldo<500 && antiguedad>=10){
            double aumento = sueldo*0.2;
            double sueldoPagar = (sueldo+aumento);
            System.out.println("El suelo a pagar es:");
            System.out.println(sueldoPagar);
        }else if (sueldo<500 && antiguedad<10){
            double aumento = sueldo*0.05;
            double sueldoPagar = (sueldo+aumento);
            System.out.println("El suelo a pagar es:");
            System.out.println(sueldoPagar);
        }else if (sueldo>=500){
            System.out.println("El suelo a pagar es:");
            System.out.println(sueldo);
        }
    }
    
}
