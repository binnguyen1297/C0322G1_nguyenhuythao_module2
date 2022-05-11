package ss5_bai_tap;

public class Student {
    private String Name ="John";
    private String clases = "C02";

    public Student(){

    }
    public void Student (String name, String classes){
        this.Name = name;
        this.clases = classes;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

}
