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
public class Figuras {
    double area;
    double n1,n2;
    public void AreaCirculo(double n1){
        area = Math.PI*Math.pow(n1, 3);} 
    public void AreaCuadrado(double n1){
        area = Math.pow(n1, 2);
    }
    public void AreaTriangulo(double n1, double n2){
        area = (n1 * n2)/2;
    }
    public void AreaRectangulo(double n1, double n2){
        area = n1 * n2;
    }
    public void AreaEsfera (double n1){
        area = 4 * Math.PI * Math.pow(n1, 2);
    }
    public void AreaCubo (double n1){
        area = 6 * Math.pow(n1, 2);
    }
    public void Resultado (){
        String mensaje=String.format("%5.5f", area);
        JOptionPane.showMessageDialog(null,"El resultado es: "+mensaje);
    }
}
