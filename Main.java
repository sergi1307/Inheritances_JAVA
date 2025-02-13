public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa(1, 3, "Verde");
        Casa casa2 = new Casa(2);
        Adosado adosado1 = new Adosado(1, 4, "rojo", 2, true);
        Piso piso1 = new Piso(2, 4, "Azul", 2, 2);
        Chalet chalet1 = new Chalet(3, 10, "Blanco", 20, "Blanco", 10.0);
        Chalet chalet2 = new Chalet(4, 40);

        casa1.mostrarDatos();
        casa2.mostrarDatos();
        System.out.println(casa1);
    }
}