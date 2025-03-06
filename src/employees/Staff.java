package employees;

public class Staff {

    private int staffId;
    private String name;
    private Double salary;

    public Staff(int staffId, String name, Double salary) {
        this.staffId = staffId;
        this.name = name;
        this.salary = salary;
    }

    public int getStaffId() { return staffId; }
    public void setStaffId(int staffId) { this.staffId = staffId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

}
