/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsipperpus;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Lenovo
 */
public class TombolClick {
    
    
    
    public boolean keyEvent(KeyEvent key){
        boolean cek = false;
        if (key.getKeyCode() == KeyEvent.VK_ENTER) {
            cek=true;
        }
        return cek;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
