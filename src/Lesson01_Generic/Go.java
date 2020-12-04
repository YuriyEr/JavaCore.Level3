package Lesson01_Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Go {
    public static void main(String[] args) {
        // задание 1
        System.out.println("проверка первого задания (метода changeElement)");
        ArrayList<String> arrOne = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ArrayList<Integer> arrTwo = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        changeElement(arrOne, 0, 5);
        System.out.println(arrOne);
        changeElement(arrOne, 0, 2);
        System.out.println(arrOne);
        changeElement(arrTwo, 0, 2);
        System.out.println(arrTwo);
        System.out.println("*****\n");

        // задание 2
        System.out.println("проверка второго задания (метода castToArrayList)");
        ArrayList<Integer> arr = castToArrayList(new Integer[]{1,2,3,4,5});
        System.out.println(arr);
        System.out.println("Тип нового класса: " + arr.getClass().getSimpleName());

    }

    // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    private static <T> void changeElement(ArrayList<T> array, int numFirst, int numSecond) {
        final int size = array.size();
        if (numFirst > size || numSecond > size || array.isEmpty()) return;
        final T firstElement = array.get(numFirst);
        array.set(numFirst, array.get(numSecond));
        array.set(numSecond, firstElement);
    }

    // 2. Написать метод, который преобразует массив в ArrayList;
    private static <T> ArrayList<T> castToArrayList (T[] array){
        ArrayList<T> newArr = new ArrayList<>();
        Collections.addAll(newArr, array);
        return newArr;
    }


}
