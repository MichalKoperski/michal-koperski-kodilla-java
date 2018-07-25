package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.stereotype.Service;

import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

//@NamedNativeQueries({

        @NamedNativeQuery(
                name = "Company.retrieveExactCompany",
                query = "SELECT * FROM Companies WHERE company_name LIKE '%A%'",
                resultClass = Company.class
        )
   /*     @NamedNativeQuery(
                name = "Employee.retrieveNameWithA",
                query = "SELECT * FROM Employees WHERE lastname LIKE '%A%'",
                resultClass = Employee.class
        )
        */
        @NamedQuery(
                name = "Employee.retrieveExactName",
                query = "FROM Employees WHERE lastname LIKE '%A%'"
        )
//})
@Service
public class SearchFacade {
    private Company company;
    private Employee employee;

    public Company getCompanyName() {
        return new Company(company.getName());
    }
    public Employee getEmployeeLastname() {
        return new Employee(employee.getFirstname(), employee.getLastname());
    }
}
