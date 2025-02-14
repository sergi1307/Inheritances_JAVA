class Chalet extends Casa {
    private int mjardin;
    private String colorValla;
    private double mantener;

    public Chalet(int puertas, int ventanas, String color, int mj, String cv, double m) {
        super(puertas, ventanas, color);
        this.mjardin = mj;
        this.colorValla = cv;
        this.mantener = m;
    }
    public Chalet(int puertas, int mjardin) {
        super(puertas);
        this.mjardin = mjardin;
    }
    public void aumentaMantener() {
        this.mantener *= 1.02;
    }
    public void setMjardin(int x) {
        this.mjardin = x;
    }
    public int getMjardin() {
        return mjardin;
    }
    public void setColorValla(String s) {
        this.colorValla = s;
    }
    public String getColorValla() {
        return colorValla;
    }
    public void setMantener(double mantener) {
        this.mantener = mantener;
    }
    public double getMantener() {
        return mantener;
    }

    public void mostrarDatos() {
        System.out.println("El chalet tiene " + this.getQpuertas() + " puertas, " + this.getQventanas() + " ventanas " + this.getColor() + " de color." +
                "Y tiene " + this.mjardin + " metros de jardín, " + this.colorValla + " de color de valla " + this.mantener +  " de porcentaje de mantenimiento.");
        System.out.println("Es un adosado."  + "\n");
    }

    @Override
    public String toString() {
        return "\nCantidad de puertas: " + getQpuertas() +"\nCantidad de ventanas: " + getQventanas() +
                "\nColor: " + getColor() + "\nMetros de jardín: " + this.mjardin + "\nColor de valla: " + this.colorValla +
                "\nPorcentaje de mantenimiento: " + this.mantener  + "\n";
    }

    public void pintar(String colorCasa, String colorValla) {
        super.pintar(colorCasa);
        this.colorValla = colorValla;
    }
}