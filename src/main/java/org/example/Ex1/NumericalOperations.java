package org.example.Ex1;

public interface NumericalOperations<T extends Number> {
    T add(T a, T b);

    T sub(T a, T b);

    T multi(T a, T b);

    T div(T a, T b);
}
