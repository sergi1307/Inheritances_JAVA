class Adosado extends Casa {
    private int qcocheras;
    private boolean patio;

    public Adosado(int puertas, int ventanas, String color, int qcocheras, Boolean patio) {
        super(puertas, ventanas, color);
        this.qcocheras = qcocheras;
        this.patio = patio;
        System.out.println("Adosado Inicializado.");
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
}