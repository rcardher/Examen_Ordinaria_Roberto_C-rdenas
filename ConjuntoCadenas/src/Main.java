import ConjuntoCadenas.ConjuntoCadenas;

public class Main {
    public static void main(String[] args) {
        // Creamos un conjunto cadenas con capacidad (1000)
        ConjuntoCadenas conjunto = new ConjuntoCadenas();

        // Añadimos cadenas
        conjunto.anade("manzana");
        conjunto.anade("banana");
        conjunto.anade("cereza");
        conjunto.anade("manzana");
        conjunto.anade("mandarina");
        conjunto.anade("sandía");

        // Mostrar el tamaño
        System.out.println("Tamaño del conjunto: " + conjunto.tamano());

        // Mostramos elementos ordenados
        System.out.println("\nElementos ordenados:");
        conjunto.muestraElementosOrdenados();

        // Buscar subcadena
        String subcadena = "man";
        int inclusiones = conjunto.numeroInclusiones(subcadena);
        System.out.println("\nCadenas que contienen '" + subcadena + "': " + inclusiones);

        // Eliminar las que no contienen la subcadena
        conjunto.eliminaNoInclusiones(subcadena);

        // Mostrar conjunto resultante tras eliminar
        System.out.println("\nConjunto tras eliminar cadenas que NO contienen '" + subcadena + "':");
        conjunto.muestraElementosOrdenados();
    }
}
