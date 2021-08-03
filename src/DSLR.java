/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class DSLR implements Camera{

    @Override
    public void modelCamera() {
        System.out.println("Model : Sony A580");
    }

    @Override
    public void hargaCamera() {
        System.out.println("Harga Sewa : Rp. 50.000/Hari");
    }
    
}
