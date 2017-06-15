/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.carPark;

/**
 *
 * @author ruperts pc
 */
public class ExitBarrier {
    
    private Boolean openState = false;
    
    public void open(){
        openState = true;
    }
    
    public void close(){
        openState = false;
    }
    
    public String getstate(){
        if (openState == false)
            return "Closed";
        else
            return "Open";
    }
}
