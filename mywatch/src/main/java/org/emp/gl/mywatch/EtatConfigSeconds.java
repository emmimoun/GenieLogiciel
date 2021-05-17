/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.mywatch;

import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.uiclock.ConfigurationGUI;
import org.emp.gl.uiclock.IGui;

/**
 *
 * @author Emmimoun
 */
public class EtatConfigSeconds extends EtatDeControleurDeMontre {

    // TODO code application logic here
    public EtatConfigSeconds(MyWatch theWatch) {
        super(theWatch);
    }

    @Override
    public void doModeEtat() {
        theWatch.setEtat(new EtatConfigMinutes(theWatch));
        ConfigurationGUI configurationGUI = Lookup.getInstance().getService(ConfigurationGUI.class);
        configurationGUI.etatSetText("Minutes Configuration");
    }

    @Override
    public void doConfigEtat() {
        theWatch.setEtat(new EtatNormal(theWatch));
        ConfigurationGUI configurationGUI = Lookup.getInstance().getService(ConfigurationGUI.class);
        configurationGUI.etatSetText("Etat Normale");
    }
    
        @Override
    public  void doIncrementAction()
    {
        IGui myGui = Lookup.getInstance().getService(IGui.class);
        myGui.setSecondePlus(myGui.getSecondePlus()+1);
    }


    @Override
    public void doDecrementAction()
    {
        IGui myGui = Lookup.getInstance().getService(IGui.class);
        myGui.setSecondePlus(myGui.getSecondePlus()-1);
    }


}
