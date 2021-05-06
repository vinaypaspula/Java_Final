/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class Employee implements Comparable<Employee> {

    private int empId;
    private String empName;
    private double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public long getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "empId=" + empId + " empName=" + empName + " empSalary=" + empSalary;
    }

    @Override
    public int compareTo(Employee e) {
        if (this.empId > e.empId) {
            return 1;
        }
        if (this.empId < e.empId) {
            return -1;
        } else {
            return 0;
        }
    }

}
