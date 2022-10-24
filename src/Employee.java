public class Employee {
    private int empId;
    private String empName;
    private String city;

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getEmpName() {
        return empName;
    }



    public Employee(int empId, String empName, String city) {
        this.empId = empId;
        this.empName = empName;
        this.city = city;
    }

//    public Employee() {
//        System.out.println("inside default");
//    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
