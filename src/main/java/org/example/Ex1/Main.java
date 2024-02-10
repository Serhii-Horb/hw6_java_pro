package org.example.Ex1;
/* 1. Создайте обобщенный интерфейс для калькулятора, в котором будут объявлен перечень операций, которые умеет делать
ваш калькулятор add, sub, multi и div и реализуйте классы, которые будут включать данный интерфейс для работы с
различными типами данных аргументов. */

public class Main {
    public static void main(String[] args) {
        IntegerProcessing intNum = new IntegerProcessing();
        System.out.println(intNum.add(2, 3));

        DoubleProcessing doubleNum = new DoubleProcessing();
        System.out.println(doubleNum.sub(5.2, 3.7));
    }

}