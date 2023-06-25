/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladorautomotriz;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author wiltsson
 */
public class SimuladorAutomotriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
       
        
        Cola colaNv1 = new Cola();
        Cola colaNv2 = new Cola();
        Cola colaNv3 = new Cola();
        Cola refuerzo = new Cola();
        
        int count = 0;
        while(count<10){
            Vehiculo vehiculo = new Vehiculo(count+1);
            if (vehiculo.getPrioridad()==1){
                colaNv1.Encolar(vehiculo);
            }else if(vehiculo.getPrioridad()==2){
                colaNv2.Encolar(vehiculo);
            }else{
                colaNv3.Encolar(vehiculo);
            }
            count++;
        }
        
        String Nv11 = colaNv1.PrintCola();
       
        
        while (1==1){
            System.out.println(Nv11);
            IA ia = new IA();
            ia.resultado(colaNv1);

            String Nv1 = colaNv1.PrintCola();
            System.out.println(Nv1);
            String Nv2 = colaNv2.PrintCola();
            System.out.println(Nv2);
            String Nv3 = colaNv3.PrintCola();
            System.out.println(Nv3);
            System.out.println(" ");
            TimeUnit.MILLISECONDS.sleep(2000);
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
