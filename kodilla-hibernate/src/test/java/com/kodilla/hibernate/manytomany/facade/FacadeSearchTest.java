package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeSearchTest {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    SearchFacade searchFacade;

    @Test
    @Transactional
    public void testFacadeSearchQueries() {
        //Given

        Employee employee1 = new Employee("j","bbbA");

        Company company1 = new Company("superfirmA");

        //When
        List<Employee> employeeBBB = new ArrayList<>();
        try {
            employeeBBB = searchFacade.searchEmployeesWithLastnameLike("A");
        } catch (NoEmployeesException e) {}
        List<String> companySuperfirma = searchFacade.searchCompaniesWithNameLike("A");

        //Then
        Assert.assertEquals("bbbA", employeeBBB.get(0).getLastname());
        Assert.assertEquals("superfirmA", companySuperfirma.get(0));
    }
}
