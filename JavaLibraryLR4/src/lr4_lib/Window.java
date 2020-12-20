/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lr4_lib;

/**
 *
 * @author brani
 */
public class Window extends Device{
    public boolean ventilation;
    public boolean blackout;
    
    public Window(boolean ventilation, boolean blackout){
        super();
        this.ventilation = ventilation;
        this.blackout = blackout;
    }
    
    public String toString(){
        return "Ventilation: " + ventilation + "Blackout" + blackout;
    }
    
    public void setVentilation(boolean ventilation){
        this.ventilation = ventilation;      
    }
    
    public void setBlackout(boolean blackout){
        this.blackout = blackout;
    }
    
    public boolean getVentilation(){
        return ventilation;
    }
    
    public boolean getBlackout(){
        return blackout;
    }
    
}
