package org.example.Ex1;

public class ShortProcessing implements NumericalOperations<Short> {
    @Override
    public Short add(Short a, Short b) {
        return (short) (a + b);
    }

    @Override
    public Short sub(Short a, Short b) {
        return (short) (a - b);
    }

    @Override
    public Short multi(Short a, Short b) {
        return (short) (a * b);
    }

    @Override
    public Short div(Short a, Short b) {
        if (b != 0) {
            return (short) (a / b);
        } else {
            throw new ArithmeticException("На 0 делить нельзя");
        }
    }
}
