package com.example;

public class Sofa extends Mueble{
    public int numeroAsientos;
    protected float precio;
    protected String proveedor;

    public Sofa(String tipoMaterial, int peso, String color, int numeroAsientos, float precio, String proveedor) {
        super(tipoMaterial, peso, color);
        this.numeroAsientos = numeroAsientos;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void acostarse(){
        System.out.println("Te has acosto en el sofa");
    }

    public void mostrarInformacion(){
        System.out.println("Capacidad de personas en el sofa: " + numeroAsientos);
        System.out.println("El precio del sofa es: $" + precio);
        System.out.println("El color del sofa es " + color);
        System.out.println("El proveedor del sofa es: " + proveedor);
    }

    
}
