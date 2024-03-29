package org.example.Ex1;

public class FloatProcessing implements NumericalOperations<Float> {
    @Override
    public Float add(Float a, Float b) {
        return a + b;
    }

    @Override
    public Float sub(Float a, Float b) {
        return a - b;
    }

    @Override
    public Float multi(Float a, Float b) {
        return a * b;
    }

    @Override
    public Float div(Float a, Float b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("На 0 делить нельзя");
        }
    }
}
