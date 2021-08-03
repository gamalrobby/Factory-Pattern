
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Demo {
    public static void main(String[] args) {
        int pilihan;
        Scanner scanner = new Scanner(System.in);
        CameraFactory cameraFactory = new CameraFactory();
        Camera camera;

        System.out.println("Silahkan pilih Tipe Camera dengan memasukkan nomor : ");
        System.out.println("1. Analog");
        System.out.println("2. Instan");
        System.out.println("3. DSLR");
        System.out.print("Pilihan anda : ");
        pilihan = scanner.nextInt();
        while (pilihan < 1 || pilihan > 3) {
            System.out.println("Harap pilih nomor yang ada!");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. DSLR");
            System.out.print("Pilihan anda : ");
            pilihan = scanner.nextInt();
        }
        if (pilihan == 1)
            camera = cameraFactory.getCamera("Analog");
        else if (pilihan == 2)
            camera = cameraFactory.getCamera("Instan");
        else
            camera = cameraFactory.getCamera("DSLR");
           
        camera.modelCamera();
        camera.hargaCamera();
    }
}
