
package ejemplotablahash;


public class EjemploTablaHash {

    

    public static void main(String[] args) {
        TablaHash tb = new TablaHash();
        locaciones l0 = new locaciones(0, "Miraflores", "Cinepolis", 0.2323, 0.2424);
        tb.insertar(l0);
        tb.mostrarTabla();
        
        locaciones l1 = new locaciones(1, "Miraflores", "Dominos", 1.1111, 1.1111);
        tb.insertar(l1);
        tb.mostrarTabla();
        
        locaciones l2 = new locaciones(2, "Miraflores", "Dominos", 2.222, 2.2222);
        tb.insertar(l2);
        tb.mostrarTabla();
        
        locaciones l3 = new locaciones(3, "Miraflores", "Dominos", 3.333, 3.333);
        tb.insertar(l3);
        tb.mostrarTabla();
        
        locaciones l4 = new locaciones(4, "Miraflores", "Dominos", 4.444, 4.444);
        tb.insertar(l4);
        tb.mostrarTabla();
        
        locaciones l5 = new locaciones(5, "Miraflores", "Dominos", 5.555, 5.555);
        tb.insertar(l5);
        tb.mostrarTabla();
        
        locaciones l6 = new locaciones(6, "Miraflores", "Dominos", 6.666, 6.666);
        tb.insertar(l6);
        tb.mostrarTabla();
        
        locaciones l7 = new locaciones(7, "Miraflores", "Dominos", 7.777, 7.777);
        tb.insertar(l7);
        tb.mostrarTabla();
        
        locaciones l8 = new locaciones(8, "Miraflores", "Dominos", 8.888, 8.888);
        tb.insertar(l8);
        tb.mostrarTabla();
        
        locaciones l9 = new locaciones(9, "Miraflores", "Dominos", 9.999, 9.999);
        tb.insertar(l9);
        System.out.println("\n\n TABLA FINAL");
        tb.mostrarTabla();
    }
    
}
