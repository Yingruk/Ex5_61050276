/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Beer
 */
public class myPropertyBean implements Serializable {
    
    public static final String SCORE_PROPERTY = "Score";
    
    private String score;
    
    private PropertyChangeSupport propertySupport;
    
    public myPropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getscore() {
        return score;
    }
    
    public void setSorce(String value) {
        String oldValue = score;
        score = value;
        propertySupport.firePropertyChange(SCORE_PROPERTY, oldValue, score);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
