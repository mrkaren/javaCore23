package homework.employeemanagement.storage;

import homework.employeemanagement.exception.EmployeeNotFoundException;
import homework.employeemanagement.model.Company;
import homework.employeemanagement.model.Employee;
import homework.employeemanagement.util.StorageSerializeUtil;

import java.io.Serializable;

public class EmployeeStorage implements Serializable {

    private Employee[] employees = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
        StorageSerializeUtil.serializeEmployeeStorage(this);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }

    public Employee getById(String employeeId) throws EmployeeNotFoundException {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId().equals(employeeId)) {
                return employees[i];
            }
        }
        throw new EmployeeNotFoundException("Employee with " + employeeId + " does not exists!");
    }

    public void searchEmployeesByCompany(Company companyFromStorage) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equals(companyFromStorage)) {
                System.out.println(employees[i]);
            }
        }
    }

    public void deleteById(String companyId) {
        int indexById = getIndexById(companyId);
        if (indexById == -1) {
            System.out.println("Employee does not exists!");
            return;
        }
        for (int i = indexById + 1; i < size; i++) {
            employees[i - 1] = employees[i];
        }
        size--;
        StorageSerializeUtil.serializeEmployeeStorage(this);
    }

    private int getIndexById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId().equals(companyId)) {
                return i;
            }
        }
        return -1;
    }
}
