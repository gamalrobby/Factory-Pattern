/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Analog implements Camera{
  
    @Override
    public void modelCamera() {
        System.out.println("Model : Nikon F2 (F2SB)");
    }

    @Override
    public void hargaCamera() {
        System.out.println("Harga Sewa : Rp. 35.000/Hari");
    }
    
}
