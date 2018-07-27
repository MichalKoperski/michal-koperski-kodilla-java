package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedQuery;
import javax.transaction.Transactional;
import java.util.List;

@NamedQuery(
        name = "Employee.retrieveExactName",
        query = "FROM Employees WHERE lastname LIKE '%A%'"
)

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query
    List<Employee> retrieveExactName (@Param("LASTNAME") String lastname);


    //   @Query(nativeQuery = true)
    //  List<Employee> retrieveNameWithA (@Param("LASTNAME") String lastname);
}
