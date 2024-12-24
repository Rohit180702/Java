public class Cylinder {
    private Circle base; 
    private double height;

    public Cylinder() {
        base = new Circle(); 
        height = 1.0;
    }

    public Cylinder(double radius) {
        base = new Circle(radius); 
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius); 
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color); 
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    
    public double getRadius() {return base.getRadius();}
    public double getArea() {return base.getArea();}
    public String getColor() {return base.getColor();}

    public void setRadius(double radius) {base.setRadius(radius);}
    public void setHeight(double height) {this.height = height;}
    public void setColor(String color) {base.setColor(color);}

    public double getVolume() { return getArea() * height;}

    @Override
    public String toString() {
        return "Cylinder[height=" + height + ", base=" + base.toString() + "]";
    }
}
