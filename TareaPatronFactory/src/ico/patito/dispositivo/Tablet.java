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
public class Tablet implements Dispositivo{
    private String marca;
    private float pulgadasPantalla;
    private int cantidadAlmacenamiento;
    private boolean tienePencil;
    private boolean cargaInalambrica;

    public Tablet() {
    }

    public Tablet(String marca, float pulgadasPantalla, int cantidadAlmacenamiento, boolean tienePencil, boolean cargaInalambrica) {
        this.marca = marca;
        this.pulgadasPantalla = pulgadasPantalla;
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
        this.tienePencil = tienePencil;
        this.cargaInalambrica = cargaInalambrica;
    }

    public boolean isCargaInalambrica() {
        return cargaInalambrica;
    }

    public void setCargaInalambrica(boolean cargaInalambrica) {
        this.cargaInalambrica = cargaInalambrica;
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

    public boolean isTienePencil() {
        return tienePencil;
    }

    public void setTienePencil(boolean tienePencil) {
        this.tienePencil = tienePencil;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marca=" + marca + ", pulgadasPantalla=" + pulgadasPantalla + ", cantidadAlmacenamiento=" + cantidadAlmacenamiento + ", tienePencil=" + tienePencil + ", cargaInalambrica=" + cargaInalambrica + '}';
    }
    
    
}
