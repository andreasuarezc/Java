
package ejercicio1.pkg1;
import javax.swing.JOptionPane;

public class Ejercicio11 {
  
    public static void main(String[] args) {
        int lado;
        lado = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar el lado del cuadrado."));
        int perimetro = lado*4;
        System.out.println("El perímetro del cuadrado es: ");
        System.out.println(perimetro);
        
    }
    
}
