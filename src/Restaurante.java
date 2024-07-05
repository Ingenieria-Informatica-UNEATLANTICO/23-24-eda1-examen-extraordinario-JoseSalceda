package src;

class Restaurante {
    private HamburguesaManager hamburguesaManager;

    public Restaurante() {
        this.hamburguesaManager = new HamburguesaManager();
    }

    private void atender() {
        Cocinero bobEsponja = new Cocinero(hamburguesaManager);
        Camarero calamardo = new Camarero();

        bobEsponja.prepararHamburguesa();
        calamardo.recibir(bobEsponja.entregar());
        calamardo.servir();
    }

    public static void main(String[] args) {
        Restaurante crustaceoCrujiente = new Restaurante();
        crustaceoCrujiente.atender();
    }

    public void crearNuevaHamburguesa(Pan panSuperior, Pan panInferior, Carne carne, int numeroExtras) {
        hamburguesaManager.crearHamburguesa(panSuperior, panInferior, carne, numeroExtras);
    }

    public Hamburguesa obtenerHamburguesa(int index) {
        return hamburguesaManager.obtenerHamburguesa(index);
    }

    public void actualizarHamburguesa(int index, Hamburguesa hamburguesa) {
        hamburguesaManager.actualizarHamburguesa(index, hamburguesa);
    }

    public void eliminarHamburguesa(int index) {
        hamburguesaManager.eliminarHamburguesa(index);
    }

    public void mostrarTodasLasHamburguesas() {
        for (Hamburguesa hamburguesa : hamburguesaManager.obtenerTodasLasHamburguesas()) {
            System.out.println(hamburguesa.describir());
            hamburguesa.mostrar();
            System.out.println();
        }
    }
}
