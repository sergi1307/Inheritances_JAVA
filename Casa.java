class Casa {
    private int qpuertas, qventanas;
    private String color;

    public Casa() {
        qpuertas = 0;
        qventanas = 0;
        color = "";
    }
    public Casa(int qp, int qf, String col) {
        this.qpuertas = qp;
        this.qventanas = qf;
        this.color = col;
    }

    public void setQpuertas(int x) {
        this.qpuertas = x;
    }
    public int getQpuertas() {
        return qpuertas;
    }
    public void setQventanas(int x) {
        this.qventanas = x;
    }
    public int getQventanas() {
        return qventanas;
    }
    public void setColor(String s) {
        this.color = s;
    }
    public String getColor() {
        return color;
    }
}

class Chalet extends Casa {
    private int mjardin;
    private String colorValla;

    public Chalet(int puertas, int ventanas, String color, int mj, String cv) {
        super(puertas, ventanas, color);
        this.mjardin = mj;
        this.colorValla = cv;
        System.out.println("Chalet inicializado");
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
}