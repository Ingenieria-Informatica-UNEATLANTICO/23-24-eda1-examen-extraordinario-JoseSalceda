package src;

public class HamburguesaManager {
    private Nodo primero;
    private int cantidad;

    public HamburguesaManager() {
        this.primero = null;
        this.cantidad = 0;
    }

    public void crearHamburguesa(Pan panSuperior, Pan panInferior, Carne carne, int numeroExtras) {
        Hamburguesa nuevaHamburguesa = new Hamburguesa(panSuperior, panInferior, carne, numeroExtras);
        Nodo nuevoNodo = new Nodo(nuevaHamburguesa);
        
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            Nodo actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        cantidad++;
    }

    public Hamburguesa obtenerHamburguesa(int index) {
        if (index < 0 || index >= cantidad) {
            return null;
        }
        Nodo actual = primero;
        for (int i = 0; i < index; i++) {
            actual = actual.siguiente;
        }
        return actual.hamburguesa;
    }

    public void actualizarHamburguesa(int index, Hamburguesa hamburguesa) {
        if (index < 0 || index >= cantidad) {
            return;
        }
        Nodo actual = primero;
        for (int i = 0; i < index; i++) {
            actual = actual.siguiente;
        }
        actual.hamburguesa = hamburguesa;
    }

    public void eliminarHamburguesa(int index) {
        if (index < 0 || index >= cantidad) {
            return;
        }
        if (index == 0) {
            primero = primero.siguiente;
        } else {
            Nodo anterior = primero;
            for (int i = 0; i < index - 1; i++) {
                anterior = anterior.siguiente;
            }
            anterior.siguiente = anterior.siguiente.siguiente;
        }
        cantidad--;
    }

    public void agregarExtraAHamburguesa(int index, Extra extra) {
        Hamburguesa hamburguesa = obtenerHamburguesa(index);
        if (hamburguesa != null) {
            hamburguesa.agregarExtra(extra);
        }
    }

    public int obtenerCantidadHamburguesas() {
        return cantidad;
    }

    public Hamburguesa[] obtenerTodasLasHamburguesas() {
        Hamburguesa[] hamburguesas = new Hamburguesa[cantidad];
        Nodo actual = primero;
        for (int i = 0; i < cantidad; i++) {
            hamburguesas[i] = actual.hamburguesa;
            actual = actual.siguiente;
        }
        return hamburguesas;
    }
}
