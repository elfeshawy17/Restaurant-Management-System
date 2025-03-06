package employees;

public class Chef {

    private int id;
    private String name;
    private String[] qualifications;
    private double salary;

    public Chef(int id, String name, String[] qualifications, double salary) {
        this.id = id;
        this.name = name;
        this.qualifications = qualifications;
        this.salary = salary;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name;}

    public String[] getQualifications() { return qualifications; }
    public void setQualifications(String[] qualifications){
        this.qualifications = qualifications;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

}
