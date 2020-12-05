package Lesson01_Generic.Task_03.FruitsAndBox;

import java.util.ArrayList;
import java.util.Collections;

public class Box<T extends Fruit> {
    //    c. Для хранения фруктов внутри коробки можете использовать ArrayList;
    private ArrayList<T> box;

    public Box(ArrayList<T> box) {
        this.box = box;
    }

    //    g. Не забываем про метод добавления фрукта в коробку
    public <M extends T> void addFruit(M... fruit) {
        Collections.addAll(this.box, fruit);
        System.out.println("Фрукт добавлен");
    }

    // метод получения фрукта
    public ArrayList<? extends T> getBox() {
        return box;
    }

    //    d. Сделать метод getWeight()
    public float getWeight() {
        if (box.isEmpty()) {
            System.out.println("Ящик пуст");
            return 0;
        }
        return box.size() * box.get(0).getMyWeightPerOne();
    }

    //    e. Внутри класса коробка сделать метод compare,
    public boolean compare(Box otherBox) {
        if (this.getWeight() == otherBox.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    //    f. Написать метод, который позволяет пересыпать фрукты
    public void PourOutFromThis(Box otherBox) {
        if (box.isEmpty()) {
            System.out.println("Ящик из которого пересыпаем - пуст");
            return;
        }
        if (otherBox.box.getClass().getName() == this.box.getClass().getName()) {
            otherBox.getBox().addAll(this.getBox());
            this.box.clear();
        } else {
            System.out.println("Фрукты в ящиках не совпадают по типу");
            return;
        }
    }
}
