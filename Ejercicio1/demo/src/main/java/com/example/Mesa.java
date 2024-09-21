package com.example;

public class Mesa extends Mueble {
    public double altura;
    public double longitudSuperficie;

    public Mesa(String tipoMaterial, int peso, String color, double altura, double longitudSuperficie) {
        super(tipoMaterial, peso, color);
        this.altura = altura;
        this.longitudSuperficie = longitudSuperficie;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLongitudSuperficie() {
        return longitudSuperficie;
    }

    public void setLongitudSuperficie(double longitudSuperficie) {
        this.longitudSuperficie = longitudSuperficie;
    }

    public void ponerPlato(){
        System.out.println("El plato esta sobre la mesa");
    }
    
    public void color(){
        System.out.println("El mueble es de color negro");
    }

    public void mostrarInformacion(){
        System.out.println("La altura de la mesa es: " + altura);
        System.out.println("La longitud de la mesa es: " +longitudSuperficie);
        System.out.println("El peso de la mesa es " + peso);

    }

    

}
