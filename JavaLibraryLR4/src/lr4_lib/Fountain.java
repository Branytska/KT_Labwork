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
public class Fountain extends Device{
    
    private String backlight;
    private String pressure;
    
    public Fountain(String backlight, String pressure){
        super();
        this.backlight = backlight;
        this.pressure = pressure;
    }
    
    public String toString(){
        return "Color: " + backlight + " Water pressure intensity: " + pressure;
    }
    
    public void setBacklight(String backlight){
        this.backlight = backlight;
    }
    
    public void setPressure(String pressure){
        this.pressure = pressure;
    }
    
    public String getBacklight(){
        return backlight;
    }
    
    public String getPressure(){
        return pressure;
    }
    
}
