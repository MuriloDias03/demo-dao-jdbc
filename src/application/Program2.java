package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Program para fazer os testes CRUD do objeto Department
        DepartmentDao sellerDao = DaoFactory.createDepartmentDao();

        System.out.println("===== TEST 1: department findById =====");


        System.out.println("\n===== TEST 2: department findAll =====");


        System.out.println("\n===== TEST 3: department insert =====");


        System.out.println("\n===== TEST 4: department update =====");


        System.out.println("\n===== TEST 5: department delete =====");


        sc.close();
    }
}