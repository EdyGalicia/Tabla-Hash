/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotablahash;

/**
 *
 * @author edysu
 */
public class TablaHash {

    static final int tamTabla = 10;
    private int numElementos;
    private double factorCarga;
    private locaciones[] tabla;

    public TablaHash() {
        tabla = new locaciones[tamTabla];
        for (int j = 0; j < tamTabla; j++) {
            tabla[j] = null;
        }
        numElementos = 0;
        factorCarga = 0.0;
    }
    
    public void insertar(locaciones n){
        int posicion;
        posicion = direccion(n.getCategoria());
        tabla[posicion] = n;
        numElementos++;
        factorCarga = (double) (numElementos) / tamTabla;
        if (factorCarga > 0.5) {
            System.out.println("\n!! Factor de carga supera el 50%.!!"
                    + " Conviene aumentar el tamaño.");
        }
    }
    
    public void mostrarTabla(){
        for (int i = 0; i < tamTabla; i++) {
            if(tabla[i] == null){
                System.out.println(i+".");
            }else{
                tabla[i].imprimirObjeto();
            }
        }
    }
    
    public int direccion(String clave) {
        int p, i = 0, cte;
        int ascii = obtenerAscii(clave);
        p = hash(ascii);
        cte = (int)p;
        while (tabla[(int)p] != null) {//si no esta desocupada
            i++;
            System.out.println("Entre al while "+i);
            p = cte + i * i;
            
            //p = p % tamTabla;
            p = hash(p);
        }
        return (int)p;
    }

    public int hash(int x) {//debe recibir el ascii de una
        double R = 0.201602520;
        double d;
        d = (double) (R * x);//primer paso, ascii * constante
        System.out.println("1ro "+d);
        d = d - parteEntera(d);//segundo paso, obtener la parte decimal
        System.out.println("2ro "+d);
        d = parteEntera(tamTabla * d);//tercer paso, multiplicar por el tamanio y truncar el resultado
        System.out.println("3ro "+d);
        System.out.println("Esta mierda es: " + (int) d);
        return (int) d;
    }
    

    public int obtenerAscii(String cadena) {
        int valor = 0;
        for (int i = 0; i < cadena.length(); i++) {
            valor = valor + (int) cadena.charAt(i);
        }
        System.out.println("El ascii es: "+valor);
        return valor;
    }

    public double parteEntera(double numero) {
        double parteDecimal = numero % 1;
        double parteEntera = numero - parteDecimal;
        //System.out.println("Parte decimal:"+parteDecimal);
        //System.out.println("Parte entera:"+parteEntera);
        return parteEntera;
    }

}

//    public int direccion(String clave) {
//        int p, i = 0, cte;
//        int ascii = obtenerAscii(clave);
//        p = hash(ascii);
//        cte = p;
//        while (tabla[p] != null) {//si no esta desocupada
//            i++;
//            System.out.println("Entre al while "+i);
//            p = cte + i * i;
//            
//            p = p % tamTabla;
//        }
//        return p;
//    }