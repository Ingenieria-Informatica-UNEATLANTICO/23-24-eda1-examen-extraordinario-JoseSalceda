package src;

import java.util.ArrayList;
import java.util.List;

public class HamburguesaManager {
    private List<Hamburguesa> hamburguesas;

    public HamburguesaManager() {
        this.hamburguesas = new ArrayList<>();
    }

    // Crear
    public void crearHamburguesa(Pan panSuperior, Pan panInferior, Carne carne, int numeroExtras) {
        Hamburguesa nuevaHamburguesa = new Hamburguesa(panSuperior, panInferior, carne, numeroExtras);
        hamburguesas.add(nuevaHamburguesa);
    }

    // Leer
    public Hamburguesa obtenerHamburguesa(int index) {
        if (index >= 0 && index < hamburguesas.size()) {
            return hamburguesas.get(index);
        }
        return null;
    }

    public List<Hamburguesa> obtenerTodasLasHamburguesas() {
        return new ArrayList<>(hamburguesas);
    }

    // Actualizar
    public void actualizarHamburguesa(int index, Hamburguesa hamburguesa) {
        if (index >= 0 && index < hamburguesas.size()) {
            hamburguesas.set(index, hamburguesa);
        }
    }

    // Eliminar
    public void eliminarHamburguesa(int index) {
        if (index >= 0 && index < hamburguesas.size()) {
            hamburguesas.remove(index);
        }
    }

    // Métodos adicionales
    public void agregarExtraAHamburguesa(int index, Extra extra) {
        if (index >= 0 && index < hamburguesas.size()) {
            hamburguesas.get(index).agregarExtra(extra);
        }
    }

    public int obtenerCantidadHamburguesas() {
        return hamburguesas.size();
    }
}