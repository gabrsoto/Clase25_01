import ClaseMañana.Ejercicio1.Celular;
import ClaseMañana.Ejercicio1.Persona;
import ClaseMañana.Ejercicio1.Precedable;
import ClaseMañana.Ejercicio1.SortUtil;
import ClaseTarde.MiFactory;
import ClaseTarde.Sorter;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

    }

    public static void EjecutarClaseMañana(){

        Precedable[] arr = new Precedable[3];

        Persona objPersona1 = new Persona(), objPersona2 = new Persona(), objPersona3 = new Persona();
        objPersona1.SetDocument(333);
        objPersona2.SetDocument(444);
        objPersona3.SetDocument(555);

        arr[0] = objPersona2;
        arr[1] = objPersona1;
        arr[2] = objPersona3;

        System.out.println("Arreglo de Persona");
        Imprimir(arr, "Arreglo antes de ordenar");
        Precedable[] arrnew1 = SortUtil.Ordenar(arr);
        Imprimir(arrnew1, "Arreglo después de ordenar");
        System.out.println("------");

        Precedable[] arrCelular =  {
                new Celular(33445544,"Pedro"),
                new Celular(44334455, "Juan"),
                new Celular(33445655, "Jorge")
        };
        System.out.println("Arreglo de Celulares");
        Imprimir(arrCelular, "Arreglo antes de imprimir");
        Precedable[] arrnew2 = SortUtil.Ordenar(arrCelular);
        Imprimir(arrnew2, "Arreglo después de imprimir");

    }

    public static void Imprimir(Precedable[] arr, String encabezado){

        System.out.println(encabezado);
        for (Precedable element : arr) {
            System.out.println(element.toString());
        }
        System.out.println("------");
    }

    public static void EjecutarClaseTarde(){
        Sorter<Integer> sr = (Sorter)MiFactory.GetInstance("MiFactory.properties");

        Comparator<Integer> c =  (a,b) ->  (a - b);
        sr.Sort(new Integer [] {1,2,45,43,-1,-5},c);

        Sorter<String> sr2 = (Sorter)MiFactory.GetInstance("MiFactory.properties");

        Comparator<String> c2 =  (a,b) ->  (a.compareTo(b));
        sr2.Sort(new String [] {"dddsas","aaaaaa","aaabbsz","zzzsiirss", "tesgggtear"},c2);


    }
}
