package ConjuntoCadenas;
import java.util.Arrays;

public class ConjuntoCadenas {
    private String[] conjunto;
    private int contador;

    // Constructor por defecto
    public ConjuntoCadenas() {
        this.conjunto = new String[1000];
        this.contador = 0;
    }

    // Constructor con tamaño específico
    public ConjuntoCadenas(int max) {
        this.conjunto = new String[max];
        this.contador = 0;
    }

    // Añadir cadena si no existe aún
    public void anade(String nuevoElemento) {
        if (!contiene(nuevoElemento)) {
            if (contador < conjunto.length) {
                conjunto[contador++] = nuevoElemento;
            } else {
                System.out.println("Conjunto lleno,No se puede añadir más elementos.");
            }
        }
    }

    // Tamaño actual
    public int tamano() {
        return contador;
    }

    // Mostrar todos los elementos ordenados
    public void muestraElementosOrdenados() {
        String[] copia = Arrays.copyOf(conjunto, contador);
        Arrays.sort(copia);
        for (String s : copia) {
            System.out.println(s);
        }
    }

    // Contar cuántos elementos contienen una subcadena
    public int numeroInclusiones(String subcadena) {
        int cuenta = 0;
        for (int i = 0; i < contador; i++) {
            if (conjunto[i].contains(subcadena)) {
                cuenta++;
            }
        }
        return cuenta;
    }

    // Eliminar los que NO contienen la subcadena
    public void eliminaNoInclusiones(String subcadena) {
        int nuevoContador = 0;
        for (int i = 0; i < contador; i++) {
            if (conjunto[i].contains(subcadena)) {
                conjunto[nuevoContador++] = conjunto[i];
            }
        }
        contador = nuevoContador;
        for (int i = contador; i < conjunto.length; i++) {
            conjunto[i] = null;
        }
    }

    // Método auxiliar para verificar si ya existe
    private boolean contiene(String cadena) {
        for (int i = 0; i < contador; i++) {
            if (conjunto[i].equals(cadena)) {
                return true;
            }
        }
        return false;
    }
}






