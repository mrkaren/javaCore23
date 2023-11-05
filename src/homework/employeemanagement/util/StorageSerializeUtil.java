package homework.employeemanagement.util;

import homework.employeemanagement.storage.CompanyStorage;
import homework.employeemanagement.storage.EmployeeStorage;

import java.io.*;

public abstract class StorageSerializeUtil {

    private static final String COMPANY_FILE_PATH = "/Users/karen/Data/lessons/java2023-24/javaCore/javaCore/src/homework/employeemanagement/data/companyStorage.dat";
    private static final String EMPLOYEE_FILE_PATH = "/Users/karen/Data/lessons/java2023-24/javaCore/javaCore/src/homework/employeemanagement/data/employeeStorage.dat";

    public static void serializeCompanyStorage(CompanyStorage companyStorage) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(COMPANY_FILE_PATH))) {
            outputStream.writeObject(companyStorage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CompanyStorage deserializeCompanyStorage() {
        File file = new File(COMPANY_FILE_PATH);
        if (!file.exists()) {
            return new CompanyStorage();
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(COMPANY_FILE_PATH))) {
            Object o = inputStream.readObject();
            if (o instanceof CompanyStorage companyStorage) {
                return companyStorage;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new CompanyStorage();
    }

    public static void serializeEmployeeStorage(EmployeeStorage employeeStorage) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(EMPLOYEE_FILE_PATH))) {
            outputStream.writeObject(employeeStorage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static EmployeeStorage deserializeEmployeeStorage() {
        File file = new File(EMPLOYEE_FILE_PATH);
        if (!file.exists()) {
            return new EmployeeStorage();
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(EMPLOYEE_FILE_PATH))) {
            Object object = inputStream.readObject();
            if (object instanceof EmployeeStorage employeeStorage) {
                return employeeStorage;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new EmployeeStorage();
    }

}
