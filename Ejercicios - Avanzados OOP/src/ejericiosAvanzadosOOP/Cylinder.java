// Ejercicio 8
package ejericiosAvanzadosOOP;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = (2*Math.PI * this.getRadius() * this.height) + (2*Math.PI*this.radius*this.radius);
        return area;
    }

    public double getVolume(){
        return this.getArea()*this.height;
    }

}
