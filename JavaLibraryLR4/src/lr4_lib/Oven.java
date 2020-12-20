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
public class Oven extends Device{
    private Integer temp;
    private Integer time;
    
    public Oven(Integer temp, Integer time){
        super();
        this.temp = temp;
        this.time = time;
    }
    
    public String toString(){
        return "Temp: " + temp + " Time: " + time;
    }
    
    public void setTemp(Integer temp){
        this.temp = temp;
    }
    
    public void setTime(Integer time){
        this.time = time;
    }
    
    public Integer getTemp(){
        return temp;
    }
    
    public Integer getTime(){
        return time;
    }
}
