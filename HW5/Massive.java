// +add         добавляем в массив int в самый конец, расширяя массив
// +contains    проверяем, есть ли int в массиве
// +get         получаем значение по индексу
// +addAll      добавляем массив в массив
// +equals      проверяем, идентичны ли массивы
// +clear       очищаем массив
// +findIndexOf находим индекс элемента массива
// +getSize     получаем размер массива
// +sort        сортировка массива. Необходимо передать boolean ascending. Реализована сортировка по возрастанию и по убыванию

public class Massive {
    private int[] data;

    void add(int i) {
        int length = data.length;
        int[] temp = new int[length + 1];
        System.arraycopy(data, 0, temp, 0, length);
        temp[length] = i;
        data = temp;
    }

    void addAll(int[] addition) {
        int[] temporary = new int[data.length + addition.length];
        System.arraycopy(data, 0, temporary, 0, data.length);
        System.arraycopy(addition, 0, temporary, data.length, addition.length);
        data = temporary;
    }

    void clear() {
        data = new int[0];
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
        i = data[i];
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

    void sort(boolean ascending) {
        int[] temp = new int[data.length];
        System.arraycopy(data,0,temp,0,data.length);
        for (int i = data.length-1; i >= 0; i--) {
            for (int j=0; j<i;j++){
                if (data[j]<data[j+1]) {
                    temp[j]=data[j];
                    temp[j+1]=data[j+1];
                } else {
                    temp[j]=data[j+1];
                    temp[j+1]=data[j];
                }
                //Почему, когда я здесь писал data=temp, программа выдавала массив 1,1,2,2. При дебаггинге выплыло, что
                //в любой момент времени, на любой итерации массивы были полностью идентичны.
                System.arraycopy(temp,0,data,0,data.length);
            }
        }
        if (!ascending) {
            for (int i=0; i<data.length;i++) {
                data[i]=temp[data.length-1-i];
            }
        }
    }

    int[] getData() {
        return data;
    }

    void setData(int[] data) {
        this.data = data;
    }
}

