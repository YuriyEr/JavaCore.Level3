package Lesson01_Generic.Task_03;

import Lesson01_Generic.Task_03.FruitsAndBox.Apple;
import Lesson01_Generic.Task_03.FruitsAndBox.Box;
import Lesson01_Generic.Task_03.FruitsAndBox.Orange;

import java.util.ArrayList;
import java.util.Collections;

public class GO {
    public static void main(String[] args) {
        // проверка выполнения задания
        Box boxAppleOne = new Box( new ArrayList(Collections.nCopies(10, new Apple())));
        Box boxAppleTwo = new Box( new ArrayList(Collections.nCopies(10, new Apple())));

        Box boxOrangeOne = new Box( new ArrayList(Collections.nCopies(10, new Orange())));
        Box boxOrangeTwo = new Box( new ArrayList(Collections.nCopies(10, new Orange())));

        // проверка подсчета веса
        System.out.println("Вес boxAppleOne " + boxAppleOne.getWeight());
        System.out.println("Вес boxOrangeOne " + boxOrangeOne.getWeight());

        // проверка метода сравнения веса
        System.out.println("Вес boxAppleOne равен boxOrangeOne: " + boxAppleOne.compare(boxOrangeOne));
        System.out.println("Вес boxAppleOne равен boxAppleTwo: " + boxAppleOne.compare(boxAppleTwo));

        //проверка добавления в коробку только фруктов этойже группы
        boxAppleOne.addFruit(new Apple());
        boxAppleOne.addFruit(new Orange());

        // проверка метода пересыпания
        boxAppleOne.PourOutFromThis(boxAppleTwo);
        System.out.println(boxAppleOne.getBox().size());
        System.out.println(boxAppleTwo.getBox().size());
        boxAppleOne.PourOutFromThis(boxOrangeOne);

    }
}
