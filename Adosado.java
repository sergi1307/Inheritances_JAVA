class Adosado extends Casa {
    private int qcocheras;
    private boolean patio;

    public Adosado(int puertas, int ventanas, String color, int qcocheras, Boolean patio) {
        super(puertas, ventanas, color);
        this.qcocheras = qcocheras;
        this.patio = patio;
    }
    public void setQcocheras(int x) {
        this.qcocheras = x;
    }
    public int getQcocheras() {
        return qcocheras;
    }
    public void setPatio(boolean p) {
        this.patio = p;
    }
    public boolean getPatio() {
        return patio;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El adosado tiene " + this.getQpuertas() + " puertas, " + this.getQventanas() + " ventanas " + this.getColor() + " de color." +
                "Y tiene " + this.qcocheras + " cocheras. Tiene patio? " + this.patio +  "\n");
        System.out.println("Es un adosado.\n");
    }

    @Override
    public String toString() {
        return "Adosado:\nCantidad de puertas: " + getQpuertas() +"\nCantidad de ventanas: " + getQventanas() +
                "\nColor: " + getColor() + "\nCocheras: " + this.qcocheras + "\nPatio: " + this.patio  + "\n";
    }
}