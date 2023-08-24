public class ArregloDeNumeros {
    public static void main(String[] args) {
        // ARREGLO de 5 Enteros

        int[] numeros = new int[5];

        // Los números son asignados en desorden
        numeros[2] = 5;
        numeros[0] = 8;
        numeros[1] = 10;
        numeros[3] = 4;
        numeros[4] = 2;

        // Imprimimos el elemento en la posición 3
        System.out.println("El elemento en la posición 3 es: " + numeros[3]);

        // Imprimimos el tamaño del ARREGLO
        System.out.println("El arreglo tiene " + numeros.length + " elementos");
    }
}
