package br.edu.fatec.factory;

public class ShapeFactoryImpl implements ShapeFactory {

    @Override
    public Calculable getShape(ShapeType type, Double[] values) {
        if (type == null) {
            throw new IllegalArgumentException("ShapeType não pode ser nulo");
        }
        switch (type) {
            case SQUARE:
                validate(values, 1);
                return new Square(values[0]);
            default:
                throw new UnsupportedOperationException("Tipo ainda não implementado: " + type);
        }
    }

    private void validate(Double[] values, int expected) {
        if (values == null || values.length != expected) {
            throw new IllegalArgumentException("Quantidade de parâmetros inválida. Esperado: " + expected);
        }
        for (Double v : values) {
            if (v == null || v <= 0) {
                throw new IllegalArgumentException("Valores devem ser positivos");
            }
        }
    }
}


