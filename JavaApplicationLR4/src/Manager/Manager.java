/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import lr4_lib.Door;
import lr4_lib.IDevice;
import lr4_lib.Device;
import lr4_lib.Fountain;
import lr4_lib.Lamp;
import lr4_lib.Oven;
import lr4_lib.Window;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nameless
 */
public class Manager implements IDevice{
    ArrayList<Device> arrDevices;
    Scanner in;

    @Override
    public void Add(Device d) {
        arrDevices.add(d);
    }

    public Manager() {
        this.arrDevices = new ArrayList<>();
        this.in = new Scanner(System.in);
    }

    @Override
    public void Delete(int id) {
        arrDevices.remove(id);
    }

    @Override
    public void Change(int id, Device d) {
        arrDevices.set(id, d);
    }
    
    void Show()
    {
        for(int i = 0; i < arrDevices.size(); i++) {   
            System.out.println("Name = " + arrDevices.get(i).getName());
            System.out.println("Power = " + arrDevices.get(i).isPower());
            System.out.println(arrDevices.get(i).toString());
        }        
    }
    
    public void MainMenu() throws InterruptedException
    {
        in = new Scanner(System.in);
        System.out.println("Input number 1 - Add 2 - Remove 3 - Change");
        int num;
        int device;
        num = in.nextInt();
        
        int a = 0;
        int b = 0;
        boolean c = false;
        boolean f = false;
        String e = "";
        
        Device d = null;
        
        switch(num)
        {
            default:
            case 1:                
                System.out.println("Input number 1 - Door 2 - Fountaine 3 - Lamp 4 - Oven 5 - Window");
                device = in.nextInt();
                switch(device)
                {
                    default:
                    case 1:
                        System.out.println("Input state: 0 - Close, 1 - Open");
                        a = in.nextInt();
                        if (a == 0){ c = false; }else{ c = true; }
                        d = new Door(c);
                        Add(d);
                        break;
                    case 2:
                        System.out.println("Input color: 1 - red, 2 - blue, 3 - yellow, 4 - green");
                        a = in.nextInt();
                        switch(a){
                            case 1:
                                e = "red";
                                break;
                            case 2:
                                e = "blue";
                                break;
                            case 3:
                                e = "yellow";
                                break;
                            case 4:
                                e = "green";
                                break;
                            default:
                                System.out.println("Error color");
                                break;
                        }
                        System.out.println("Input pressure water: 1 - low, 2 - medium, 3 - strong");
                        b = in.nextInt();
                        switch(b){
                            case 1:
                                e = "low";
                                break;
                            case 2:
                                e = "medium";
                                break;
                            case 3:
                                e = "strong";
                                break;
                            default:
                                System.out.println("Error pressure");
                                break;
                        }
                        d = new Fountain(e, e);
                        Add(d);
                        break;
                    case 3:
                        System.out.println("Input color: 1 - red, 2 - blue, 3 - yellow, 4 - green");
                        a = in.nextInt();
                        switch(a){
                            case 1:
                                e = "red";
                                break;
                            case 2:
                                e = "blue";
                                break;
                            case 3:
                                e = "yellow";
                                break;
                            case 4:
                                e = "green";
                                break;
                            default:
                                System.out.println("Error color");
                                break;
                        }
                        d = new Lamp(e);
                        Add(d);
                        break;
                    case 4:                        
                        System.out.println("Input temp");
                        a = in.nextInt();
                        System.out.println("Input time");
                        b = in.nextInt();
                        d = new Oven(a, b);
                        Add(d);
                        break;
                    case 5:
                        System.out.println("Input ventilation: 1 - yes, 0 - no");
                        a = in.nextInt();
                        if(a == 1){ c = true; }else{ c = false; }
                        System.out.println("Input blackout: 1 - yes, 0 - no");
                        b = in.nextInt();
                        if(b == 1){ f = true; }else{ f = false; }
                        d = new Window(c, f);
                        Add(d);
                        break;
                }
                break;
            case 2:
                System.out.println("Intput deleting object");
                int delete = in.nextInt();
                Delete(delete);
                break;
            case 3:
                System.out.println("Input number 1 - Door 2 - Fountaine 3 - Lamp 4 - Oven 5 - Window");
                int device1 = in.nextInt();
                
                System.out.println("Input position");
                int pos = in.nextInt();
                
                switch(device1)
                {
                    default:
                    case 1:
                        System.out.println("Input state: 0 - Close, 1 - Open");
                        a = in.nextInt();
                        if (a == 0){ c = false; }else{ c = true; }
                        d = new Door(c);
                        Add(d);
                        break;
                    case 2:
                        System.out.println("Input color: 1 - red, 2 - blue, 3 - yellow, 4 - green");
                        a = in.nextInt();
                        switch(a){
                            case 1:
                                e = "red";
                                break;
                            case 2:
                                e = "blue";
                                break;
                            case 3:
                                e = "yellow";
                                break;
                            case 4:
                                e = "green";
                                break;
                            default:
                                System.out.println("Error color");
                                break;
                        }
                        System.out.println("Input pressure water: 1 - low, 2 - medium, 3 - strong");
                        b = in.nextInt();
                        switch(b){
                            case 1:
                                e = "low";
                                break;
                            case 2:
                                e = "medium";
                                break;
                            case 3:
                                e = "strong";
                                break;
                            default:
                                System.out.println("Error pressure");
                                break;
                        }
                        d = new Fountain(e, e);
                        Add(d);
                        break;
                    case 3:
                        System.out.println("Input color: 1 - red, 2 - blue, 3 - yellow, 4 - green");
                        a = in.nextInt();
                        switch(a){
                            case 1:
                                e = "red";
                                break;
                            case 2:
                                e = "blue";
                                break;
                            case 3:
                                e = "yellow";
                                break;
                            case 4:
                                e = "green";
                                break;
                            default:
                                System.out.println("Error color");
                                break;
                        }
                        d = new Lamp(e);
                        Add(d);
                        break;
                    case 4:                        
                        System.out.println("Input temp");
                        a = in.nextInt();
                        System.out.println("Input time");
                        b = in.nextInt();
                        d = new Oven(a, b);
                        Add(d);
                        break;
                    case 5:
                        System.out.println("Input ventilation: 1 - yes, 0 - no");
                        a = in.nextInt();
                        if(a == 1){ c = true; }else{ c = false; }
                        System.out.println("Input blackout: 1 - yes, 0 - no");
                        b = in.nextInt();
                        if(b == 1){ f = true; }else{ f = false; }
                        d = new Window(c, f);
                        Add(d);
                        break;
                }
                break;
        }
        Show();
    }
}
