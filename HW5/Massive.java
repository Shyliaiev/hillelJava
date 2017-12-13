// +add         добавляем в массив
// +contains    проверяем, есть ли инт в массиве
// +get         получаем значение по индексу
// +addAll      добавляем массив в массив
// +equals      проверяем, идентичны ли массивы
// +clear       очищаем массив
// +findIndexOf находим индекс элемента массива
// +getSize     получаем размер массива
// sort         сортировка массива

public class Massive {
    private int[] data;

    int[] add(int i) {
        int length = data.length;
        int[] temp = new int[length + 1];
        System.arraycopy(data, 0, temp, 0, length);
        temp[length] = i;
        data = temp;
        return data;
    }

    int[] addAll(int[] addition) {
        int[] temporary = new int[data.length + addition.length];
        System.arraycopy(data, 0, temporary, 0, data.length);
        System.arraycopy(addition, 0, temporary, data.length, addition.length);
        data = temporary;
        return data;
    }

    int[] clear() {
        data = new int[0];
        return data;
    }

    boolean contains(int i) {
        boolean result;
        result = false;
        for (int j : this.data) {
            if (j == i) {
                result = true;
                break;
            }
        }
        return result;
    }

    boolean equal(int[] equalData) {
        boolean result;
        result = true;
        if (data.length != equalData.length) {
            result = false;
            return result;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] != equalData[i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    int findIndexOf(int whatToFind) {
        int i = 0;
        for (int j : data) {
            if (j == whatToFind) {
                break;
            }
            i++;
        }
        return i;
    }

    int get(int i) {
        i = data[i - 1];
        return i;
    }

    int getSize() {
        int i;
        i = 0;
        for (int j : data) {
            i++;
        }
        return i;
    }

    int[] sort(){
        //сортировка перебором
        int[] temp = new int[data.length];

        return data;
    }

    int[] getData() {
        return data;
    }

    void setData(int[] data) {
        this.data = data;
    }

    static String concat(String f, String g, String h) {
        String result;
        result=f+g+h;
        return result;
    }
}

