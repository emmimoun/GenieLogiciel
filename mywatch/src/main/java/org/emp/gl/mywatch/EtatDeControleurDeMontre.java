/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.mywatch;

/**
 *
 * @author Emmimoun
 */
public abstract class EtatDeControleurDeMontre {

    MyWatch theWatch;

    public void doModeEtat() {}
    
    public void doIncrementAction(){}
    public void doDecrementAction(){}
    public void doConfigEtat() {}

    // TODO code application logic here
    public EtatDeControleurDeMontre(MyWatch theWatch) {
            this.theWatch = theWatch;
    }

}
