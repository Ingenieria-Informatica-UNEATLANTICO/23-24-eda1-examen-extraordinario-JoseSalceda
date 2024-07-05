package src;

class Cocinero extends Empleado {
    private HamburguesaManager hamburguesaManager;

    public Cocinero(HamburguesaManager hamburguesaManager) {
        this.hamburguesaManager = hamburguesaManager;
    }

    public void prepararHamburguesa() {
        final int NUMERO_EXTRAS = 4;
        Carne laCarne = new Res("poco hecha");
        Pan panSuperior = new Brioche();
        Pan panInferior = new Brioche();

        hamburguesaManager.crearHamburguesa(panSuperior, panInferior, laCarne, NUMERO_EXTRAS);
        int index = hamburguesaManager.obtenerCantidadHamburguesas() - 1;

        hamburguesaManager.agregarExtraAHamburguesa(index, new Cheddar());
        hamburguesaManager.agregarExtraAHamburguesa(index, new Ketchup("poco"));
        hamburguesaManager.agregarExtraAHamburguesa(index, new Mayonesa("mucho"));
        hamburguesaManager.agregarExtraAHamburguesa(index, new Huevo());

        this.tieneHamburguesa = true;
    }

    public Hamburguesa entregar() {
        this.tieneHamburguesa = false;
        return hamburguesaManager.obtenerHamburguesa(hamburguesaManager.obtenerCantidadHamburguesas() - 1);
    }
}
