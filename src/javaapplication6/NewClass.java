/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication6;

/**
 *
 * @author Toni
 */
public class NewClass {

    public NewClass() {
    }
    
    private String teksti = "alkuarvo";

    /**
     * Get the value of teksti
     *
     * @return the value of teksti
     */
    public String getTeksti() {
        return teksti;
    }

    /**
     * Set the value of teksti
     *
     * @param teksti new value of teksti
     */
    public void setTeksti(String teksti) {
        this.teksti = teksti;
    }

    private int luku = 0;

    /**
     * Get the value of luku
     *
     * @return the value of luku
     */
    public int getLuku() {
        return luku;
    }

    /**
     * Set the value of luku
     *
     * @param luku new value of luku
     */
    public void setLuku(int luku) {
        this.luku = luku;
    }

    public int laske()
    {
        return luku;
    }
    
    public int laske(int toinen)
    {
        return luku+toinen;
    }
    
}
