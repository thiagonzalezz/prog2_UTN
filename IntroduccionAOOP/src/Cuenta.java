//Crea una clase llamada Cuenta que tendra los siguientes atributos:
//    1. titular y cantidad (puede tener decimales). Crear sus metodos get y set
//    2. Crear dos constructores que permitan crear una cuenta para un titular y la cantidad
//Tendra dos metodos especiales:
//    1. ingresar (double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa,
//no se hara nada
//    2. retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan
//es negativa, la cantidad de la cuenta pasa a ser 0
public class Cuenta {
    private String titular;
    private double cantidad;


    // Constructor
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }


    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        if (cantidad > 0){
            this.cantidad += cantidad;
        }
    }


    public void retirar(double cantidad){
        this.cantidad -= cantidad;
        if (this.cantidad < 0){
            this.cantidad = 0;
        }
    }
}
