/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorautomotriz;
import java.util.Random;
/**
 *
 * @author wiltsson
 */
public class IA {
    
    public int[] ganadores = new int[10];
    public volatile int count = 0;
    
    public void resultado(Cola cola, Cola refuerzo){
           Vehiculo vehiculo = cola.Desencolar();
           
           Random random = new Random(); 
           int valor = random.nextInt(100);
           
           if (valor<40){
               //Agarrar id
               ganadores[count] = vehiculo.getID();
               System.out.println("Gano");
               count++;
           }else if(valor >=40 && valor<67){
               cola.Encolar(vehiculo);
               System.out.println("Empato");
           }else{
               System.out.println("Pospuesto");
               refuerzo.Encolar(vehiculo);
               String r = refuerzo.PrintCola();
               System.out.println(r);
               
           }
           
           
    }
    
    
}
