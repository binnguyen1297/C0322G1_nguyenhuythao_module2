package ss6_bai_tap;

public class Students extends AccessModifier {
    private String Name ="John";
    private String clases = "C02";

    public Students(){

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

    @Override
    public String toString() {
        return "Students{" +
                "Name='" + Name + '\'' +
                ", clases='" + clases + '\'' +
                '}';
    }
}

