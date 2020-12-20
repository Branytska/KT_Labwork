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
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author Nameless
 */
public class Device {
    private String name;
    private boolean power = false;

    public Device() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Input name");
            this.name = in.nextLine();
            
            System.out.println("Input power: 1 - On, 0 - Off");
            int a = in.nextInt();
            if (a == 0){
                this.power = in.nextBoolean();
            }else{
                this.power = true;
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean isPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
}
