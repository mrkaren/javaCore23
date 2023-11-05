package homework.employeemanagement;

public interface Command {

    String EXIT = "0";
    String LOGOUT = "0";
    String ADD_COMPANY = "1";
    String ADD_EMPLOYEE = "2";
    String PRINT_COMPANIES = "3";
    String PRINT_EMPLOYEES = "4";
    String SEARCH_EMPLOYEE_BY_ID = "5";
    String SEARCH_EMPLOYEE_BY_COMPANY = "6";
    String DELETE_COMPANY = "7";
    String DELETE_EMPLOYEE = "8";
    String CHANGE_COMPANY = "9";
    String CHANGE_EMPLOYEE = "10";

    String LOGIN = "1";
    String REGISTER = "2";

    static void printCommands() {
        System.out.println("Please input " + LOGOUT + " for LOGOUT");
        System.out.println("Please input " + ADD_COMPANY + " for ADD_COMPANY");
        System.out.println("Please input " + ADD_EMPLOYEE + " for ADD_EMPLOYEE");
        System.out.println("Please input " + PRINT_COMPANIES + " for PRINT_ALL_COMPANIES");
        System.out.println("Please input " + PRINT_EMPLOYEES + " for PRINT_ALL_EMPLOYEES");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_ID + " for SEARCH_EMPLOYEE_BY_ID");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY + " for SEARCH_EMPLOYEE_BY_COMPANY");
        System.out.println("Please input " + DELETE_COMPANY + " for DELETE_COMPANY");
        System.out.println("Please input " + DELETE_EMPLOYEE + " for DELETE_EMPLOYEE");
        System.out.println("Please input " + CHANGE_COMPANY + " for CHANGE_COMPANY");
        System.out.println("Please input " + CHANGE_EMPLOYEE + " for CHANGE_EMPLOYEE");
    }

    static void printLoginCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + LOGIN + " for LOGIN");
        System.out.println("Please input " + REGISTER + " for REGISTER");

    }
}
