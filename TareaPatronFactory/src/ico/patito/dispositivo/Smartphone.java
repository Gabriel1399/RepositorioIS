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
public class Smartphone implements Dispositivo{
    private String marca;
    private float pulgadasPantalla;
    private int numeroCamaras;
    private int cantidadAlmacenamiento;
    private boolean esAndroid;
    private boolean tieneCargador;

    public Smartphone() {
    }

    public Smartphone(String marca, float pulgadasPantalla, int numeroCamaras, int cantidadAlmacenamiento, boolean esAndroid, boolean tieneCargador) {
        this.marca = marca;
        this.pulgadasPantalla = pulgadasPantalla;
        this.numeroCamaras = numeroCamaras;
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
        this.esAndroid = esAndroid;
        this.tieneCargador = tieneCargador;
    }

    public boolean isTieneCargador() {
        return tieneCargador;
    }

    public void setTieneCargador(boolean tieneCargador) {
        this.tieneCargador = tieneCargador;
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

    public int getNumeroCamaras() {
        return numeroCamaras;
    }

    public void setNumeroCamaras(int numeroCamaras) {
        this.numeroCamaras = numeroCamaras;
    }

    public int getCantidadAlmacenamiento() {
        return cantidadAlmacenamiento;
    }

    public void setCantidadAlmacenamiento(int cantidadAlmacenamiento) {
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
    }

    public boolean isEsAndroid() {
        return esAndroid;
    }

    public void setEsAndroid(boolean esAndroid) {
        this.esAndroid = esAndroid;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", pulgadasPantalla=" + pulgadasPantalla + ", numeroCamaras=" + numeroCamaras + ", cantidadAlmacenamiento=" + cantidadAlmacenamiento + ", esAndroid=" + esAndroid + ", tieneCargador=" + tieneCargador + '}';
    }
    
    
}
