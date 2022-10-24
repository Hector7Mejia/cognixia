public class EmployeeMain {

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setEmpName("John");
        emp.setCity("London");

        System.out.println("Employee data " + emp.getCity() + " " + emp.getEmpName());
    }
}
