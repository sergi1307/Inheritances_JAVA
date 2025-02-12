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
