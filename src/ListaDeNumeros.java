import java.util.LinkedList;

public class ListaDeNumeros {
    public static void main(String[] args) {
        // LISTA dinámica, NO le especificamos elmentos
        LinkedList<Integer> numeros = new LinkedList<>();

        // Agregamos todos los elementos que queramos
        numeros.add(8);     // Se asigna a la posición 0
        numeros.add(10);    // Se asigna a la posición 1
        numeros.add(5);     // Se asigna a la posición 2
        numeros.add(4);     // Se asigna a la posición 3
        numeros.add(2);     // Se asigna a la posición 4

        // Imprimimos el elemento en la posición 2
        System.out.println("El elemento en la posición 4 es: " + numeros.get(4));

        // Imprimimos el tamaño de la LISTA
        System.out.println("El arreglo tiene " + numeros.size() + " elementos");
    }
}
