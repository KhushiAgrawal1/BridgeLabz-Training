package com.objectmodeling;

public class CompanyTest {
    public static void main(String[] args) {

        Company company = new Company("Tech Corp");

        Department d1 = new Department("IT");
        d1.addEmployee("Aman");
        d1.addEmployee("Riya");

        company.addDepartment(d1);
        company.showCompanyDetails();

        company = null; // all departments & employees destroyed
    }
}

