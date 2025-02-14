class Piso extends Casa {
    private int nplanta, nbalcones;

    public Piso(int puertas, int ventanas, String color, int nplanta, int nbalcones) {
        super(puertas, ventanas, color);
        this.nplanta = nplanta;
        this.nbalcones = nbalcones;
    }
    public void setNplanta(int x) {
        this.nplanta = x;
    }
    public int getNplanta() {
        return nplanta;
    }
    public void setNbalcones(int x) {
        this.nbalcones = x;
    }
    public int getNbalcones() {
        return nbalcones;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El piso tiene " + this.getQpuertas() + " puertas, " + this.getQventanas() + " ventanas " + this.getColor() + " color." +
                this.nplanta + "número de planta " + this.nbalcones + "número de balcones.");
        System.out.println("Es un piso."  + "\n");
    }

    @Override
    public String toString() {
        return "PISO -> " + super.toString() + "Núm Planta= " + this.nplanta + " , Núm Balcons= " + this.nbalcones  + "\n";
    }
}