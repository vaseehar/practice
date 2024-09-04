package recursion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance_690 {

    public static void main(String[] args) {
    }

    Map<Integer, Employee> employeeMap;

    public int getImportance(List<Employee> employees, int id) {
        if (employeeMap == null) {
            employeeMap = new HashMap<>();
            for (Employee emp : employees) {
                employeeMap.put(emp.id, emp);
            }
        }
        int imp = 0;
        Employee emp = employeeMap.get(id);
        imp += emp.importance;
        if (emp.subordinates.size() > 0) {
            for (int subId : emp.subordinates) {
                imp += getImportance(employees, subId);
            }
        }
        return imp;
    }

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    ;

}
