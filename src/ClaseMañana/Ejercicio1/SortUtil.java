package ClaseMañana.Ejercicio1;

public class SortUtil {

    public static <T> Precedable[] Ordenar(Precedable<T>[] arr){
        Precedable[] objCopia = new Precedable[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            int cantidad = arr.length-1;
            for (int j = cantidad; j >= 0; j--) {
                if(arr[i].PrecedeA((T)arr[j]) < 0)
                    cantidad--;
            }

            objCopia[cantidad] = arr[i];
        }
        return objCopia;
    }
}
