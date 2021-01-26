package io.hel.base.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * author: hel
 * date: 2020/12/27 20:25
 * description:
 */
public class Demeter {
    public static void main(String[] args) {
        CollegeManager collegeManager = new CollegeManager();
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployees(collegeManager);
    }
}

class CollegeEmployee {
    private int id;
    private int cid;

    public int getId() {
        return id;
    }

    public int getCid() {
        return cid;
    }

    public CollegeEmployee(int id, int cid) {
        this.id = id;
        this.cid = cid;
    }
}

class CollegeManager {
    private List<CollegeEmployee> employees = new ArrayList<>(10);

    public void init() {
        CollegeEmployee e;
        for (int i = 1; i <= 10; i++) {
            e = new CollegeEmployee(i, 0);
            employees.add(e);
        }
    }

    public CollegeManager() {
        init();
    }

    public List<CollegeEmployee> getEmployees() {
        return employees;
    }
}

class SchoolEmployee {
    private int id;

    public int getId() {
        return id;
    }

    public SchoolEmployee(int id) {
        this.id = id;
    }
}

class SchoolManager {
    // 直接朋友之成员变量（SchoolEmployee）
    List<SchoolEmployee> employees = new ArrayList<>(5);

    private void init() {
        for (int i = 1; i <= 5; i++) {
            employees.add(new SchoolEmployee(i));
        }
    }

    public SchoolManager() {
        init();
    }

    // 直接朋友之方法返回值（SchoolEmployee）
    public List<SchoolEmployee> getAllEmployees() {
        return employees;
    }

    // 直接朋友之方法参数（CollegeManager）
    public void printAllEmployees(CollegeManager college) {
        // CollegeEmployee对于SchoolManager来说是非直接朋友，违反迪米特法则
        List<CollegeEmployee> employees = college.getEmployees();
        for (CollegeEmployee employee : employees) {
            System.out.println("college employee No: " + employee.getId());
        }
        System.out.println();
        List<SchoolEmployee> schoolEmployees = getAllEmployees();
        for (SchoolEmployee employee : schoolEmployees) {
            System.out.println("school employee No: " + employee.getId());
        }
    }
}