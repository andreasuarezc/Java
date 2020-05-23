
package ejercicio4_10;

import javax.swing.JOptionPane;

public class Ejercicio4_10 {

    
    public static void main(String[] args) {
        
        int count = 0;
        int suma1 = 0;
        int suma2 = 0;
        int gastoTotal = 0;
        
        while (count>=0){
            
            int sueldo = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar el salario del empleado"));
            
            if (sueldo>300){
                suma1=suma1+1;
            }else if (sueldo>=100){
                suma2=suma2+1;
            }
            System.out.println
        ("La cantidad de empleados que cobra más de 300 es:");
            System.out.println(suma1);
            System.out.println
        ("La cantidad de empleados que cobra entre 100 a 300 es:");
            System.out.println(suma2);
            
            gastoTotal = gastoTotal+sueldo;
            System.out.println
        ("El gasto Total de la empresa el sueldo del personal es:");
            System.out.println(gastoTotal);
        }
               
    }
    
}
