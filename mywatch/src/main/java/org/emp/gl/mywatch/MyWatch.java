/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.mywatch;

import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.actiondo.Action;
import org.emp.gl.timer.service.impl.withdelegation.TimerServiceImplWithDelegation;
import org.emp.gl.uiclock.IGui;

/**
 *
 * @author Emmimoun
 */
public class MyWatch extends TimerServiceImplWithDelegation implements Action {

    public EtatDeControleurDeMontre etat = new EtatNormal(this);

    // TODO code application logic here
    public void setEtat(EtatDeControleurDeMontre s) {
        this.etat = s;
    }

    @Override
    public void doModeAction() {

        etat.doModeEtat();
    }

    @Override
    public void doIncrementAction() {
        etat.doIncrementAction();
        
    }  
    
    @Override
    public void doDecrementAction() {
       etat.doDecrementAction();
    }

    @Override
    public void doConfigAction() {
        etat.doConfigEtat();
    }

    @Override
    public int getMinutes() {
        return super.getMinutes();
    }

    @Override
    public int getHeures() {
        return super.getHeures();
    }

    @Override
    public int getSecondes() {
        return super.getSecondes();
    }

    @Override
    public int getDixiemeDeSeconde() {
        return super.getDixiemeDeSeconde();
    }

}
