/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.Factory;

import ico.patito.dispositivo.*;

/**
 *
 * @author gabri
 */
public class DispositivoFactory {
    public static Dispositivo createDispositivo(int tipo){
        switch (tipo) {
            case Dispositivo.COMPUTADORA_ESCRITORIO:
                 return new Computadora("DELL", 19, 512, 16, false, true);
            case Dispositivo.COMPUTADORA_ALL_IN_ONE:
                return new Computadora("HP", 22, 1024, 16, true, false);
            case Dispositivo.COMPUTADORA_LAPTOP:
                return new Computadora("APPLE", 16, 512, 16, true, false);
            case Dispositivo.SMARPHONE_ANDROID:
                return new Smartphone("ZTE", 6.08f , 3, 128, true, true);
            case Dispositivo.SMARPHONE_IOS:
                return new Smartphone("IPHONE", 6.7f, 4, 256, false, false);
            case Dispositivo.SMARPHONE_GOOGLE:
                return new Smartphone("PIXEL", 6.4f, 2, 256, true, true);
            case Dispositivo.TABLET_SENCILLA:
                return new Tablet("SAMSUNG", 10.5f, 64, false, false);
            case Dispositivo.TABLET_TECLADO:
                return new Tablet("RCA", 10.0f, 32, false, false);
            case Dispositivo.TABLET_WINDOWS:
                return new Tablet("MICROSOFT SURFACE", 12.3f, 128, true, false);
            default:
                throw new AssertionError();
        }
    }
}
