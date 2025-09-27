package br.ed.fatec.main;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactory;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.ShapeType;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactoryImpl();
        Calculable square = factory.getShape(ShapeType.SQUARE, new Double[]{5.0});
        System.out.println("Área do quadrado (lado=5): " + square.calcularArea());
    }
}


