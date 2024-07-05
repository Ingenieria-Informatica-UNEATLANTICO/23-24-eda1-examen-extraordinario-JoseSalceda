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

    private void demostrarFuncionalidad() {
        System.out.println("Demostrando funcionalidad del sistema:");

        for (int i = 0; i < 3; i++) {
            atender();
            System.out.println("Hamburguesa " + (i + 1) + " creada y servida.");
        }

        System.out.println("\nCantidad de hamburguesas: " + hamburguesaManager.obtenerCantidadHamburguesas());

        System.out.println("\nTodas las hamburguesas:");
        Hamburguesa[] todasLasHamburguesas = hamburguesaManager.obtenerTodasLasHamburguesas();
        for (int i = 0; i < todasLasHamburguesas.length; i++) {
            System.out.println("Hamburguesa " + (i + 1) + ": " + todasLasHamburguesas[i].describir());
        }

        if (hamburguesaManager.obtenerCantidadHamburguesas() > 0) {
            Hamburguesa nuevaHamburguesa = new Hamburguesa(new Integral(), new Integral(), new Pollo("bien hecho"), 2);
            hamburguesaManager.actualizarHamburguesa(0, nuevaHamburguesa);
            System.out.println("\nHamburguesa actualizada: " + hamburguesaManager.obtenerHamburguesa(0).describir());
        }

        if (hamburguesaManager.obtenerCantidadHamburguesas() > 0) {
            hamburguesaManager.eliminarHamburguesa(hamburguesaManager.obtenerCantidadHamburguesas() - 1);
            System.out.println("\nÚltima hamburguesa eliminada.");
            System.out.println("Nueva cantidad de hamburguesas: " + hamburguesaManager.obtenerCantidadHamburguesas());
        }
    }

    public static void main(String[] args) {
        Restaurante crustaceoCrujiente = new Restaurante();
        crustaceoCrujiente.atender();
        System.out.println("\n--- Demostración adicional ---\n");
        crustaceoCrujiente.demostrarFuncionalidad();
    }
}
