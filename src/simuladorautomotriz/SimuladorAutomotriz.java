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
        
        
       
        Boolean terminar = false;
        while (terminar ==false){
            String Nv11 = colaNv1.PrintCola();
            System.out.println(Nv11);
            IA ia = new IA();
            
            if (colaNv1.esVacia() == false){
                ia.resultado(colaNv1,refuerzo);
            }else{
                if (colaNv2.esVacia() == false){
                    ia.resultado(colaNv2,refuerzo);
                }else{
                    if(colaNv3.esVacia() == false){
                        ia.resultado(colaNv3,refuerzo);
                    }else{
                        System.out.println("Se acabo");
                        terminar = true;
                    }
                }
            }
            

            String Nv1 = refuerzo.PrintCola();
            System.out.println(Nv1);
            
            
            TimeUnit.MILLISECONDS.sleep(2000);
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
