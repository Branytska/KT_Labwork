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
public class Door extends Device{
    private boolean state = false;
    
    public Door(boolean state){
        super();
        this.state = state;
    }
    
    public String toString() { 
        String stateDoor;
        if (state == false){
            stateDoor = "close";
        }else{
            stateDoor = "open";
        }
        return "State door = " + stateDoor; 
    }
    
    public boolean getState(){
        return state;
    }    
    
    public boolean setState(boolean state){
        return state;
    }
}
