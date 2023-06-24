/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorautomotriz;

/**
 *
 * @author wiltsson
 */
public class Vehiculo {
    private Vehiculo next;
    private int ID;
    private int prioridad;
    
    public Vehiculo(int ID, int prioridad) {
        this.ID = ID;
        this.prioridad = prioridad;
    }
    
    public Vehiculo getNext() {
        return next;
    }

    public void setNext(Vehiculo next) {
        this.next = next;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    
}
