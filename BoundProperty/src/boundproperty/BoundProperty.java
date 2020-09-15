/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.beans.PropertyChangeListener;
import java.util.Scanner;

/**
 *
 * @author Beer
 */
public class BoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String score=" " ;
        myPropertyBean source=new myPropertyBean();
        Listener1 obj1 = new Listener1();
        Listener2 obj2 =new Listener2();
        source.addPropertyChangeListener(obj1);
        source.addPropertyChangeListener(obj2);
        while(score!=null){
           score = getScore();
           if(score.equals("")) return;
           source.setSorce(score);
        }
    }
    
    public static String getScore() {
        String score;
        Scanner scan = new Scanner(System.in); 
        System.out.print("enter score : ");
        score = scan.nextLine();
        return score;
    }

    
    
}
