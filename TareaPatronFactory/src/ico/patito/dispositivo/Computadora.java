/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.patito.dispositivo;

import ico.fes.Factory.Dispositivo;

/**
 *
 * @author gabri
 */
public class Computadora implements Dispositivo{
    private String marca;
    private float pulgadasPantalla;
    private int cantidadAlmacenamiento;
    private int cantidadRAM;
    private boolean tieneCamara;
    private boolean tarjetaVideoDedicada;

    public Computadora() {
    }

    public Computadora(String marca, float pulgadasPantalla, int cantidadAlmacenamiento, int cantidadRAM, boolean tieneCamara, boolean tarjetaVideoDedicada) {
        this.marca = marca;
        this.pulgadasPantalla = pulgadasPantalla;
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
        this.cantidadRAM = cantidadRAM;
        this.tieneCamara = tieneCamara;
        this.tarjetaVideoDedicada = tarjetaVideoDedicada;
    }

    public boolean isTarjetaVideoDedicada() {
        return tarjetaVideoDedicada;
    }

    public void setTarjetaVideoDedicada(boolean tarjetaVideoDedicada) {
        this.tarjetaVideoDedicada = tarjetaVideoDedicada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    public void setPulgadasPantalla(float pulgadasPantalla) {
        this.pulgadasPantalla = pulgadasPantalla;
    }

    public int getCantidadAlmacenamiento() {
        return cantidadAlmacenamiento;
    }

    public void setCantidadAlmacenamiento(int cantidadAlmacenamiento) {
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
    }

    public int getCantidadRAM() {
        return cantidadRAM;
    }

    public void setCantidadRAM(int cantidadRAM) {
        this.cantidadRAM = cantidadRAM;
    }

    public boolean isTieneCamara() {
        return tieneCamara;
    }

    public void setTieneCamara(boolean tieneCamara) {
        this.tieneCamara = tieneCamara;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", pulgadasPantalla=" + pulgadasPantalla + ", cantidadAlmacenamiento=" + cantidadAlmacenamiento + ", cantidadRAM=" + cantidadRAM + ", tieneCamara=" + tieneCamara + ", tarjetaVideoDedicada=" + tarjetaVideoDedicada + '}';
    }
    
}
