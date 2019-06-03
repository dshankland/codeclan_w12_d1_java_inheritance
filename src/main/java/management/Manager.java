package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String nInumber, double salary, String deptName) {
        super(name, nInumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
