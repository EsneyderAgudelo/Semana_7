package com.example;

public class Silla extends Mueble {
    public int numeroPatas;
    protected String textura;

    public Silla(int numeroPatas, String tipoMaterial, String textura, int peso, String color) {
        super(tipoMaterial,peso,color);
        this.numeroPatas = numeroPatas;
        this.tipoMaterial = tipoMaterial;
        this.textura = textura;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public void sentarse(){
        System.out.println("Te has sentando en la silla");
    }

    public void mostrarInformacion(){
        System.out.println("Numero de patas " + numeroPatas);
        System.out.println("Tipo de textura: " + textura);
        System.out.println(" El color es: " + color);
        System.out.println("El material de la silla es: " + tipoMaterial);
    }

}
