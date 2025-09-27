package br.edu.fatec.factory;

class Square implements Calculable {
    private final double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double calcularArea() {
        return side * side;
    }
}


