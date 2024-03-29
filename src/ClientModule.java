public class ClientModule {
    public static void main(String args[]){
        Employee peggy = new Employee(1,"Suzzy","accoutnig",true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.XML);
    }
    public static void hireNewEmployee(Employee employee){
        EmployeeDAO employeeDoo = new EmployeeDAO();
        employeeDoo.saveEmployee(employee);
    }
    public void terminateEmployee(Employee employee){
        EmployeeDAO employeeDoo = new EmployeeDAO();
        employeeDoo.deleteEmployee(employee);
    }
    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }

}
