package Electrodomesticos;

public class Electrodomestico {
    protected double precio;
    protected float peso;
    protected String color;
    protected char consumo;
    protected int id;
    public static int contador = 0;


    private static final char CONSUMO_DEFECTO = 'F';
    private static final double PRECIO_DEFECTO = 100000;
    private static final String COLOR_DEFECTO = "blanco";
    private static final float PESO_DEFECTO = 5;

    private String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};



    // Constructor por defecto
    public Electrodomestico() {
        this.precio = PRECIO_DEFECTO;
        this.color = COLOR_DEFECTO;
        this.consumo = CONSUMO_DEFECTO;
        this.peso = PESO_DEFECTO;
        this.id = contador++;
    }
    // Constructor con el precio y peso. El resto por defecto.
    public Electrodomestico(double precio, float peso) {
        // Cuando se pone this solo hace referencia o llama directamente
        // al constructor por defecto
        this();
        this.precio = precio;
        this.peso = peso;
        this.color = COLOR_DEFECTO;
        this.consumo = CONSUMO_DEFECTO;
    }
    // Constructor con todos los atributos
    public Electrodomestico(double precio, String color, char consumo, float peso) {
        this();
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    public double getPrecio() {
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
    public double precioFinal(){
        double p = this.precio;
        switch(this.consumo){
            case 'A':
                p+=100;
                break;
            case 'B':
                p+=80;
                break;
            case 'C':
                p+=60;
                break;
            case 'D':
                p+=50;
                break;
            case 'E':
                p+=30;
                break;
            case 'F':
                p+=10;
                break;
        }
        if(this.peso>=0 && this.peso<=19){
            p+=10;
        } else if(this.peso>=20 && this.peso<=49){
            p+=50;
        } else if(this.peso>=50 && this.peso<=79){
            p+=80;
        } else if(this.peso>80){
            p+=100;
        }
        return p;
    }
}
