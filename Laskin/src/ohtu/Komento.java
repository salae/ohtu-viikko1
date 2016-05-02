/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author Anu
 */
public class Komento {
    protected final Sovelluslogiikka sovellus; 
    protected final JTextField tuloskentta; 
    protected final JTextField syotekentta; 
    
    public Komento(Sovelluslogiikka sovellus,JTextField tuloskentta,JTextField syotekentta){
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }    
    
    
    public void suorita(){}
    public void peru(){}
}
