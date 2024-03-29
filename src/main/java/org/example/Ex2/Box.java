package org.example.Ex2;

/* У вас есть на почте коробка, у которой есть 3 характеристики: высота, длина и ширина. В коробку вы можете положить
 любой объект (главное чтобы он влез по габаритам) и его отправить по почте или получить по почте.
Как Вы думаете, можем ли мы использовать для создания данного класса Generic подход? Если да, попробуйте реализовать
данный класс. */
public class Box<T extends Item> {
    private double height;
    private double length;
    private double width;

    public Box(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // проверяем размер коробки с размером обьекта
    public String checkItem(T tmp) {
        if (getHeight() > tmp.getHeight() && getLength() > tmp.getLength() && getWidth() > tmp.getWidth()) {
            return "Товар влез";
        }
        return "Товар не влез";
    }
}
