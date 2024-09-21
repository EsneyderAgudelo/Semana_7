package com.example;

public class Mueble {
    public String tipoMaterial;
    public int peso;
    protected String color;

    public Mueble(String tipoMaterial, int peso, String color) {
        this.tipoMaterial = tipoMaterial;
        this.peso = peso;
        this.color = color;}

    public String getMaterial() {
        return tipoMaterial;
    }

    public void setMaterial(String material) {
        this.tipoMaterial = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mover(){
        System.out.println("El mueble se esta moviendo");
    }
    
    public void mostrarInformacion(){
        System.out.println("El tipo de material es: " + tipoMaterial);
        System.out.println("El peso es: " + peso);
        System.out.println("El color es: " + color);
    }
}
