package ss7_bai_tap;

public class Cylinder extends Circle {
    private int chieuCao = 5;

    public Cylinder() {
    }

    public Cylinder(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getVolume() {
        return Math.PI * Math.pow(this.getRadius(), 2) * chieuCao;
    }

    @Override
    public String toString() {
        return " Cylinder  " +
                " mau = " + getColor() +
                " chieuCao =" + chieuCao +
                " ban kinh = " + super.getRadius() +
                " the tich = " + getVolume();

    }


}
