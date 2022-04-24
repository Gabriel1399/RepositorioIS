/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.Factory;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TestDispositivoFactory {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        System.out.println("¿Que tipo de dispositivo quiere conocer?");
        System.out.println(Dispositivo.COMPUTADORA_ESCRITORIO+". Computadora de escritorio");
        System.out.println(Dispositivo.COMPUTADORA_ALL_IN_ONE+". Computadora All In One");
        System.out.println(Dispositivo.COMPUTADORA_LAPTOP+". Laptop");
        System.out.println(Dispositivo.SMARPHONE_ANDROID+". Celular Android");
        System.out.println(Dispositivo.SMARPHONE_IOS+". Celular de Apple");
        System.out.println(Dispositivo.SMARPHONE_GOOGLE+". Celular de Google");
        System.out.println(Dispositivo.TABLET_SENCILLA+". Tablet Sencilla");
        System.out.println(Dispositivo.TABLET_TECLADO+". Tablet con teclado");
        System.out.println(Dispositivo.TABLET_WINDOWS+". Tablet con Windows");
        
        try {
            System.out.print("\nElige el numero: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un numero");
        }
        Dispositivo disp = DispositivoFactory.createDispositivo(eleccion);
        System.out.println(disp.toString());
    }
}
