package Electrodomesticos;

import Electrodomesticos.Electrodomestico;

public class prueba {
    public static void main(String[] args){
        Electrodomestico electro = new Electrodomestico(564,"GRIS", 'C', 654 );
        System.out.println(electro.getColor());
        System.out.println(electro.getConsumo());

    }
}
