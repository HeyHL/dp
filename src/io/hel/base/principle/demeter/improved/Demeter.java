package io.hel.base.principle.demeter.improved;

import java.util.ArrayList;
import java.util.List;

/**
 * author: hel
 * date: 2020/12/27 20:25
 * description: 迪米特法则
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

    private void init() {
        CollegeEmployee e;
        for (int i = 1; i <= 10; i++) {
            e = new CollegeEmployee(i, 0);
            employees.add(e);
        }
    }

    public CollegeManager() {
        init();
    }

    public void printAllEmployees() {
        for (CollegeEmployee employee : employees) {
            System.out.println("college employee No: " + employee.getId());
        }
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
    public List<SchoolEmployee> getAllEmployees() {
        List<SchoolEmployee> employees = new ArrayList<>(5);
        for (int i = 1; i <= 5; i++) {
            employees.add(new SchoolEmployee(i));
        }
        return employees;
    }

    public void printAllEmployees(CollegeManager college) {
        // 消除SchoolManager的非直接朋友，将处理逻辑内聚到CollegeManager自身中
        college.printAllEmployees();
        System.out.println();
        List<SchoolEmployee> schoolEmployees = getAllEmployees();
        for (SchoolEmployee employee : schoolEmployees) {
            System.out.println("school employee No: " + employee.getId());
        }
    }
}