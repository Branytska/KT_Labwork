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
public class Lamp extends Device{
    public String color;
    
    public Lamp(String color){
        super();
        this.color = color;
    }
    
    public String toString(){
        return "Color lamp: " + color;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
}
