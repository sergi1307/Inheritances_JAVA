class Chalet extends Casa {
    private int mjardin;
    private String colorValla;
    private double mantener;

    public Chalet(int puertas, int ventanas, String color, int mj, String cv, double m) {
        super(puertas, ventanas, color);
        this.mjardin = mj;
        this.colorValla = cv;
        this.mantener = m;
        System.out.println("Chalet inicializado");
    }
    public Chalet(int puertas, int mjardin) {
        super(puertas);
        this.mjardin = mjardin;
    }
    public void aumentaMantener() {
        this.mantener *= 0.02;
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
}