package StrangerThings.Controller;

import StrangerThings.Models.*;

public class GestionaEntidad {
    public int getNumeroObjetos(EntidadStrangerThings[] entidades){
        int contador = 0;
        for (int i = 0; i < entidades.length; i++) {
            if (entidades[i] != null && entidades[i] instanceof CriaturaUpsideDown) {
                contador++;
            }
        }
        return contador;
    }

    static void main(String[] args) {
        EntidadStrangerThings[] entidades = new EntidadStrangerThings[10];

        //Creo objetos
        EntidadStrangerThings humano1 = new Humano("Roberto", true);
        EntidadStrangerThings humano2 = new Humano("Antonio", 30, false);

        EntidadStrangerThings hawkins1 = new MiembroGrupoHawkins("Pepa", false, true);
        EntidadStrangerThings hawkins2 = new MiembroGrupoHawkins("Sole", 40, true, false);

        EntidadStrangerThings enjambre1 = new CriaturaEnjambre("wawajs", 0.4, 2);
        EntidadStrangerThings enjambre2 = new CriaturaEnjambre("se me ha acabado la inspiracion", 25, 0.9, 4);

        EntidadStrangerThings depredador1 = new Depredador("Lobo con sida", 1, true);
        EntidadStrangerThings depredador2 = new Depredador("Bicho que seguro es raro", 50, 0.4, false);

        //Añado a la tabla
        entidades[0] = humano1;
        entidades[1] = humano2;
        entidades[2] = hawkins1;
        entidades[3] = hawkins2;
        entidades[4] = enjambre1;
        entidades[5] = enjambre2;
        entidades[6] = depredador1;
        entidades[7] = depredador2;

        //Recorro tabla
        System.out.println("--------Recorro tabla---------");
        for (int i = 0; i < entidades.length; i++) {
            if (entidades[i] != null){
                System.out.println(entidades[i].toString());
            }
        }

        //Recorro tabla para método calcularDannoPotencial
        System.out.println("---------Recorro para metodo----------");
        for (int i = 0; i < entidades.length; i++) {
            if (entidades[i] != null) {
                System.out.println(entidades[i].calcularDannoPotencial(3));
            }
        }

        //Recorrido para un objeto de un tipo en concreto
        System.out.println("------------Objeto tipo concreto--------------");
        for (int i = 0; i < entidades.length; i++) {
            if (entidades[i] != null && entidades[i] instanceof MiembroGrupoHawkins){
                boolean tienePoder = ((MiembroGrupoHawkins) entidades[i]).isTienePoderPsiquico();
                if (tienePoder){
                    System.out.println("¡Usa sus poderes para defenderse del Upside Down");
                }
                else {
                    System.out.println("no tiene poderes");
                }
            }
        }

        //Pruebo el getNumeroObjetos
        GestionaEntidad ge = new GestionaEntidad();
        int contadorCriaturas = ge.getNumeroObjetos(entidades);
        System.out.println(contadorCriaturas);


    }
}
