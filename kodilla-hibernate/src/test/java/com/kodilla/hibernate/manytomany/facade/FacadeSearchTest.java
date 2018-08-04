package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
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
    SearchFacade searchFacade;

    @Test
    @Transactional
    public void testFacadeSearchQueries() {

        List<Employee> employeeBBB = new ArrayList<>();
        try {
            employeeBBB = searchFacade.searchEmployeesWithLastnameLike("A");
        } catch (NoEmployeesException e) {}
        List<String> companySuperfirma = searchFacade.searchCompaniesWithNameLike("A");

        //Then
        Assert.assertEquals("Kovalsky", employeeBBB.get(0).getLastname());
        Assert.assertEquals("Software Machine", companySuperfirma.get(0));
    }
}
