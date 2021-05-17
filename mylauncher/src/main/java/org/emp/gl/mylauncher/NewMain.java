/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package org.emp.gl.mylauncher;
import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.actiondo.Action;
import org.emp.gl.timer.service.TimerChangeListener;
import org.emp.gl.timer.service.TimerService;
import org.emp.gl.timer.service.impl.withdelegation.TimerServiceImplWithDelegation;
import org.emp.gl.mywatch.MyWatch;
import org.emp.gl.uiclock.ClockGUI;
import org.emp.gl.uiclock.ConfigurationGUI;
import org.emp.gl.uiclock.IGui;


public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lookup.getInstance().register(
                        TimerService.class, 
                        new TimerServiceImplWithDelegation());

        TimerService timer = Lookup.getInstance().getService(TimerService.class);
        
        ClockGUI guiTimer = 
                new ClockGUI();
      
        
        ConfigurationGUI configurationGUI=
                new ConfigurationGUI();
        
        Lookup.
                getInstance().
                register( ConfigurationGUI.class,configurationGUI);
      
        
        
        Lookup.
                getInstance().
                register(
                        TimerChangeListener.class, 
                        guiTimer);
        
        Lookup.
                getInstance().
                register(
                        IGui.class, 
                        guiTimer);     
        
        TimerChangeListener guiObserver = 
                (TimerChangeListener) 
                Lookup.
                        getInstance().
                        getService(
                                TimerChangeListener.class);

        timer.
                addTimeChangeListener(
                        guiObserver);
        
        MyWatch myWatch =
                new MyWatch();
        
        Lookup.
                getInstance().
                register( 
                        Action.class , 
                        myWatch);
        
    }
    
}
