public class Employee {
private int id;
private String name, department;
private boolean working;
    public Employee(long id, String name, String department, boolean working) {
        this.id = (int) id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}