public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa(1, 3, "Verde");
        Casa casa2 = new Casa(2);
        Adosado adosado1 = new Adosado(1, 4, "rojo", 2, true);
        Piso piso1 = new Piso(2, 4, "Azul", 2, 2);
        Chalet chalet1 = new Chalet(3, 10, "Blanco", 20, "Blanco", 10.0);
        Chalet chalet2 = new Chalet(4, 5, "Violeta", 25, "Negro", 5);

        System.out.println("Mostrar Datos:");
        casa1.mostrarDatos();
        casa2.mostrarDatos();
        adosado1.mostrarDatos();
        piso1.mostrarDatos();
        chalet1.mostrarDatos();
        chalet2.mostrarDatos();

        System.out.println("IMPRIMIR DATOS:");
        System.out.println(casa1);
        System.out.println(casa2);
        System.out.println(adosado1);
        System.out.println(piso1);
        System.out.println(chalet1);
        System.out.println(chalet2);

        /*Pintamos y aumentamos mantener de un adosado y un chalet y imprimimos el resultado para que se vean los cambios realizados*/
        adosado1.pintar("Amarillo");
        chalet1.pintar("Negro", "Negro");
        chalet2.aumentaMantener();

        System.out.println(adosado1);
        System.out.println(chalet1);
        System.out.println(chalet2);
    }
}