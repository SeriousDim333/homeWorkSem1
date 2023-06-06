//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков (Set).
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//отвечающие фильтру. Критерии фильтрации можно хранить в Map или в Сет. Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - цвет
//2 - бренд

package Sem6;

public class Laptop {
    Brand brand;
    Color color;

    public Laptop(Brand brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand=" + brand +
                ", color=" + color +
                '}';
    }

}
