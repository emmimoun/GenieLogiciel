/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.mywatch;

import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.uiclock.ConfigurationGUI;

/**
 *
 * @author Emmimoun
 */
public class EtatNormal extends EtatDeControleurDeMontre {

    // TODO code application logic here
    public EtatNormal(MyWatch theWatch) {
        super(theWatch);
    }

    @Override
    public void doConfigEtat() {
        theWatch.setEtat(new EtatConfigSeconds(theWatch));
        ConfigurationGUI configurationGUI = Lookup.getInstance().getService(ConfigurationGUI.class);
        configurationGUI.etatSetText("Seconds Configuration");
    }
    
}
