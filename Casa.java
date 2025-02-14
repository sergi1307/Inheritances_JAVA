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
    public Casa(int qp) {
        this.qpuertas = qp;
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

    public void mostrarDatos() {
        System.out.println("NP: " + this.qpuertas);
        if (this.qventanas <= 0) {
            System.out.println("NV: N/A");
        } else {
            System.out.println("NV: " + this.qventanas);
        }
        if (this.color == null) {
            System.out.println("COLOR: N/A");
        } else {
            System.out.println("COLOR: " + this.color);
        }
        System.out.println();
    }
    public String toString() {
        return "Puertas: " + this.qpuertas + "\nVentanas: " + this.qventanas +
                "\nColor: " + this.color  + "\n";
    }

    public void pintar(String color) {
        this.color = color;
    }
}