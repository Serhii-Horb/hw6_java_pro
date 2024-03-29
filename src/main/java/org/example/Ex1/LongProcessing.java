package org.example.Ex1;

public class LongProcessing implements NumericalOperations<Long> {
    @Override
    public Long add(Long a, Long b) {
        return a + b;
    }

    @Override
    public Long sub(Long a, Long b) {
        return a - b;
    }

    @Override
    public Long multi(Long a, Long b) {
        return a * b;
    }

    @Override
    public Long div(Long a, Long b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("На 0 делить нельзя");
        }
    }
}
