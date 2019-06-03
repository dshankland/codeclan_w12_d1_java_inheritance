package staff;

public abstract class Employee {

    private String name;
    private String nInumber;
    private double salary;

    public Employee(String name, String nInumber, double salary) {
        this.name = name;
        this.nInumber = nInumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if ((name == null) || (name == "")) throw new IllegalArgumentException("NAME CANNOT BE NULL!!");
        this.name = name;
    }

    public String getnInumber() {
        return this.nInumber;
    }

    public void setnInumber(String nInumber) {
        this.nInumber = nInumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise) {
        if (raise < 0) throw new IllegalArgumentException("RAISE CANNOT BE NEGATIVE!!");
        this.salary += raise;
    }

    public double payBonus() {
        return this.salary / 100;
    }
}
