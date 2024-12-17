package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Program para fazer os testes CRUD do objeto Department
        DepartmentDao departmentDaoDao = DaoFactory.createDepartmentDao();

        System.out.println("===== TEST 1: department findById =====");
        Department department = departmentDaoDao.findById(7);
        System.out.println(department);

        System.out.println("\n===== TEST 2: department findAll =====");


        System.out.println("\n===== TEST 3: department insert =====");
        Department newDepartment = new Department(null, "Music");
        departmentDaoDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n===== TEST 4: department update =====");
        department = departmentDaoDao.findById(1);
        department.setName("Collectibles");
        departmentDaoDao.update(department);
        System.out.println("Updated completed!");

        System.out.println("\n===== TEST 5: department delete =====");


        sc.close();
    }
}