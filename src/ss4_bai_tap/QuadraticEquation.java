package ss4_bai_tap;


public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return ((-b + Math.sqrt(this.getDiscriminant()))) / 2 * a;
    }

    public double getRoot() {
        return (-b / 2 * a);
    }

    public double getRoot2() {
        return ((-b - Math.sqrt(this.getDiscriminant()))) / 2 * a;
    }

    public String Caculator() {
        if (this.getDiscriminant() > 0) {
            return (this.getRoot1() + " " + this.getRoot2());
        } else if (this.getDiscriminant() == 0) {
            return "'" + this.getRoot();
        } else {
            return "The equation has no roots";
        }
    }
}
