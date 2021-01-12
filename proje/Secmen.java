/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

/**
 *
 * @author akpin
 */
public class Secmen extends Kisi {
    long Tc;

    public Secmen(long Tc, String adi,String soyadi) {
        this.Tc = Tc;
        super.adi= adi;
        super.soyadi= soyadi;
        
    }
    
}
