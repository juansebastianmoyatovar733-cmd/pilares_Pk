public abstract class Electrodomestico {
    protected String marca;
    protected boolean encendido;

    public Electrodomestico(String marca) {
        this.marca = marca;
        this.encendido = false;
    }

    // Metodos concretos - comunes a todos
    public void encender() {
        encendido = true;
        System.out.println(marca + " esta encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println(marca + " esta apagado.");
    }

    // Metodo abstracto - cada hija lo implementa
    public abstract void funcionPrincipal();
}
