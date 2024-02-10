package org.example.Ex1;

public class ByteProcessing implements NumericalOperations<Byte> {
    @Override
    public Byte add(Byte a, Byte b) {
        return (byte) (a + b);
    }

    @Override
    public Byte sub(Byte a, Byte b) {
        return (byte) (a - b);
    }

    @Override
    public Byte multi(Byte a, Byte b) {
        return (byte) (a * b);
    }

    @Override
    public Byte div(Byte a, Byte b) {
        if (b != 0) {
            return (byte) (a / b);
        } else {
            throw new ArithmeticException("На 0 делить нельзя");
        }
    }
}
