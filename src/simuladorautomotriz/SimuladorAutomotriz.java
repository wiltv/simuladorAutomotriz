/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladorautomotriz;

/**
 *
 * @author wiltsson
 */
public class SimuladorAutomotriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Vehiculo(1, 1);
        Vehiculo vehiculo2 = new Vehiculo(2,1);
        
        Cola cola = new Cola();
        cola.Encolar(1, 1);
        cola.Encolar(2, 1);
        cola.Encolar(5, 2);
        
        String print = cola.PrintCola();
        System.out.println(print);
        
        
        
        
        
    }
    
}
