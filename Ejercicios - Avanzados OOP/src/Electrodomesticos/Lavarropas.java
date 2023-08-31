package Electrodomesticos;

public class Lavarropas extends Electrodomestico {
    private float carga;
    private static final float CARGA_DEFECTO = 5;

    public Lavarropas() {
        super();
        this.carga = CARGA_DEFECTO;
    }

    public Lavarropas(float precio, float peso) {
        super(precio, peso);
        this.carga = CARGA_DEFECTO;
    }

    public Lavarropas(float precio, String color, char consumo, float peso, float carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double p = 0;
        super.precioFinal();
        if (this.carga>30) {
            p+=50;
        }
        return p;
        }
    }


