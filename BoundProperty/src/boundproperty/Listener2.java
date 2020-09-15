package boundproperty;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beer
 */
public class Listener2 implements PropertyChangeListener{

   @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("live result: "+evt.getNewValue()); 
    }
    
}
