
package ejercicio3_4;

import javax.swing.JOptionPane;

public class Ejercicio3_4 {

    
    public static void main(String[] args) {
        
        float cantidad = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar la cantidad total de preguntas realizadas"));
        float correctas = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar las cantidad de respuestas correctas"));
        float porcentaje = correctas/cantidad;
        
        if (porcentaje>=0.9){
        System.out.println("El empleado obtuvo Nivel Máximo");
    }else if (porcentaje>=0.75){
        System.out.println("El empleado obtuvo Nivel Medio");
    }else if (porcentaje>=0.5){
        System.out.println("El empleado obtuvo Nivel Regular");
    }else{
        System.out.println("El empleado está Fuera de Nivel");
    }
    }
    
}
