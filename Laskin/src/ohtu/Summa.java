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
public class Summa extends Komento{
    int luku;
    
    public Summa(Sovelluslogiikka sovellus,JTextField tuloskentta,JTextField syotekentta){
       super(sovellus,tuloskentta,syotekentta); 
    }
    
    @Override
    public void suorita() {
        luku = Integer.parseInt(syotekentta.getText());
        sovellus.plus(luku);
        syotekentta.setText("");
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
    }
    
    @Override
    public void peru() {        
        sovellus.miinus(luku);
        syotekentta.setText("");
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
    }    
    
}
