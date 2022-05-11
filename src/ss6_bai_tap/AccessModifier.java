package ss6_bai_tap;

public class AccessModifier {
    private double Radius = 1.0;
    private String color = "red";
    private double Area;

    public AccessModifier() {
    }


    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public AccessModifier(double radius, String color) {
        Radius = radius;
        this.color = color;

    }

    public double getArea() {
        this.Area = Math.pow(Radius, 2) * Math.PI;
        return this.Area;
    }

    @Override
    public String toString() {
        return "AccessModifier{" +
                "Radius=" + Radius +
                ", color='" + color + '\'' +
                ", Area=" + getArea() +
                '}';
    }
}