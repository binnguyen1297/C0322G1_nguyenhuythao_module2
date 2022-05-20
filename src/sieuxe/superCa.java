package sieuxe;

public class superCa implements comparable<superCa> {
    private int maxe;
    private String tenxe;
    private String hang;
    private String mau;
    private  String dongco;



    public superCa(int maxe, String tenxe, String hang, String mau, String dongco) {
        this.maxe = maxe;
        this.tenxe = tenxe;
        this.hang = hang;
        this.mau = mau;
        this.dongco = dongco;
    }
    public superCa() {
    }
    public int getMaxe() {
        return maxe;
    }

    public void setMaxe(int maxe) {
        this.maxe = maxe;
    }

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getDongco() {
        return dongco;
    }

    public void setDongco(String dongco) {
        this.dongco = dongco;
    }
}
