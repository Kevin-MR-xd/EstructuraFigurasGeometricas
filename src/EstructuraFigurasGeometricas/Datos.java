/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraFigurasGeometricas;
import javax.swing.JOptionPane;
/**
 *
 * @author Kevin (EL chistes)
 */
public class Datos {
    public void menu(){
         double n1 = 0,n2 = 0;
         int opcion=0;
         opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona la operacion"
                 + "\n 1. Area del Circulo"
                 + "\n 2. Area del Cuadrado"
                 + "\n 3. Area del Triangulo"
                 + "\n 4. Area del Rectangulo"
                 + "\n 5. Area de la Esfera"
                 + "\n 6. Area del Cubo"
                 + "\n 7. Salir", opcion));
         if (opcion >= 1 && opcion <= 6) {
                    Figuras input = new Figuras();
                    if (opcion == 1) {
                        JOptionPane.showMessageDialog(null,"//Area del Circulo//");
                        n1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio"));
                        input.AreaCirculo(n1);
                    } else if (opcion == 2) {
                        JOptionPane.showMessageDialog(null,"//Area del Cuadrado//");
                        n1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de uno de sus lados"));
                       input.AreaCuadrado(n1);
                    } else if (opcion == 3) {
                        JOptionPane.showMessageDialog(null,"//Area del Triangulo//");
                       n1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base"));
                       n2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
                        input.AreaTriangulo(n1, n2);
                    } else if (opcion == 4) {
                        JOptionPane.showMessageDialog(null,"//Area del Rectangulo//");
                        n1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base"));
                        n2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
                        input.AreaRectangulo(n1, n2);
                    } else if (opcion == 5){
                        JOptionPane.showMessageDialog(null,"//Area de la esfera//");
                        n1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio"));
                        input.AreaEsfera(n1);
                    }else if (opcion == 6){
                        JOptionPane.showMessageDialog(null,"//Area del Cubo//");
                        n1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de una de sus aristas"));
                        input.AreaCubo(n1);
                    }
                    input.Resultado();
                } else if (opcion != 7) {
                    JOptionPane.showMessageDialog(null,"Opción inválida");
                }
    }
            
}
