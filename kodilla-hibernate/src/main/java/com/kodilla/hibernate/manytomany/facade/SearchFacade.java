package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    private Company company;
    private Employee employee;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;


    public List<Company> searchCompaniesWithNameLike(String name) {
        return companyDao.retrieveExactCompany(name);
    }
    public List<Employee> searchEmployeesWithLastnameLike(String lastname) {
        return employeeDao.retrieveExactName(lastname);
    }
}

