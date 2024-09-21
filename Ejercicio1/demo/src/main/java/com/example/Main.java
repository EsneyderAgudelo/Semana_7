package com.example;

public class Main {
    public static void main(String[] args) {
        Mesa miMesa = new Mesa("Madera", 10, "Negro", 100, 130);
        miMesa.ponerPlato();
        miMesa.setAltura(120);
        miMesa.setColor("Blanco");
        miMesa.mover();
        miMesa.color();



        Silla miSilla = new Silla(4, "Madera", "Liso", 5, "Negro");
        miSilla.sentarse();


        Sofa miSofa = new Sofa("Terciopelo", 40, "Gris", 4, 700000, "Dekasa");
        miSofa.acostarse();
    }
}