/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class CameraFactory {
    public Camera getCamera(String tipeCamera){
        if (tipeCamera.equalsIgnoreCase("Analog"))
            return new Analog();
        else if (tipeCamera.equalsIgnoreCase("Instan"))
            return new Instan();
        else if (tipeCamera.equalsIgnoreCase("DSLR"))
            return new DSLR();
        else
            return null;
    }
}
