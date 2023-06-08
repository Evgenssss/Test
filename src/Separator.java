//Задача 8
//Напишите класс Separator.
//
//Добавьте в него поле array и конструктор, инициализирующий его.
//
//Также реализуйте методы even() и odd(), они должны возвращать массив четных или нечетных чисел, отобранных из array.
public class Separator {
    int[] array;
    public Separator (int[] array) {
        this.array = array;
    }
    int[] even() {
        int j = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                j++;
            }
        }
        int[] arrayEven = new int[j];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayEven[k] = array[i];
                k++;
            }
        }
        return arrayEven;
    }
    int[] odd() {
        int j = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                j++;
            }
        }
        int[] arrayOdd = new int[j];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrayOdd[k] = array[i];
                k++;
            }
        }
        return arrayOdd;
    }
}