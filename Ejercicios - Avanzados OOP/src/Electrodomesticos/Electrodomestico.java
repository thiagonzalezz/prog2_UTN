package Electrodomesticos;

public class Electrodomestico {
    protected float precio;
    protected float peso;
    protected String color;
    protected char consumo;


    private static final char CONSUMO_DEFECTO = 'F';
    private static final float PRECIO_DEFECTO = 100000;
    private static final String COLOR_DEFECTO = "blanco";
    private static final float PESO_DEFECTO = 5;

    private String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};



    // Constructor por defecto
    public Electrodomestico() {
        this.precio = PRECIO_DEFECTO;
        this.color = COLOR_DEFECTO;
        this.consumo = CONSUMO_DEFECTO;
        this.peso = PESO_DEFECTO;
    }
    // Constructor con el precio y peso. El resto por defecto.
    public Electrodomestico(float precio, float peso) {
        this.precio = precio;
        this.peso = peso;
        this.color = COLOR_DEFECTO;
        this.consumo = CONSUMO_DEFECTO;
    }
    // Constructor con todos los atributos
    public Electrodomestico(float precio, String color, char consumo, float peso) {
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }


    public String getColor() {
        return color;
    }



    public char getConsumo() {
        return consumo;
    }



    public float getPeso() {
        return peso;
    }



    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }

    public void comprobarConsumoEnergetico(char letra){
        if (letra>='A' && letra<='F'){
            this.consumo = letra;
        }
        else{
            this.consumo = CONSUMO_DEFECTO;
        }

    }
    // Mediante un for each comparamos el color ingresado con el array de colores
    // Mediante equalsIgnoreCase podemos comparar un String sin importar si esta en mayusculas o minusculas
    // Si es igual, por las dudas lo pasamos a minusculas con toLowerCase
    public void comprobarColor(String color) {
        for (String elemento : colores) {
            if (elemento.toLowerCase().equalsIgnoreCase(color)) {
                this.color = color.toLowerCase();
            } else {
                this.color = COLOR_DEFECTO;
            }
        }
    }
    public void precioFinal(){
        switch(this.consumo){
            case 'A':
                this.precio+=100;
                break;
            case 'B':
                this.precio+=80;
                break;
            case 'C':
                this.precio+=60;
                break;
            case 'D':
                this.precio+=50;
                break;
            case 'E':
                this.precio+=30;
                break;
            case 'F':
                this.precio+=10;
                break;
        }
        if(this.peso>=0 && this.peso<=19){
            this.precio+=10;
        } else if(this.peso>=20 && this.peso<=49){
            this.precio+=50;
        } else if(this.peso>=50 && this.peso<=79){
            this.precio+=80;
        } else if(this.peso>80){
            this.precio+=100;
        }
    }
}
