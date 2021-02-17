package ClaseTarde;

import java.util.Comparator;

public class QuickSorterImple<T> implements Sorter<T>{
    @Override
    public void Sort(T[] arr, Comparator<T> c) {
        T pivot = arr[arr.length-1];
        int inicio = 0;

        for (int i = inicio; i < arr.length; i++) {
            if (c.compare(arr[i], pivot) > 0) {
                i++;

                T swapTemp = arr[i];
                arr[inicio] = arr[i];
                arr[i] = swapTemp;
            }
        }

        T swapTemp = arr[inicio+1];
        arr[inicio+1] = pivot;
        arr[arr.length-1] = swapTemp;
    }
}
