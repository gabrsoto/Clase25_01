import ClaseMañana.Ejercicio1.Celular;
import ClaseMañana.Ejercicio1.Persona;
import ClaseMañana.Ejercicio1.Precedable;
import ClaseMañana.Ejercicio1.SortUtil;

public class Main {

    public static void main(String[] args) {

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
}
