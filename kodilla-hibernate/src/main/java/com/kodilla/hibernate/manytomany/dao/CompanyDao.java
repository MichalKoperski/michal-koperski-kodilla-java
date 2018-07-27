package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;
import javax.transaction.Transactional;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retrieveExactCompany",
        query = "SELECT * FROM Companies WHERE company_name LIKE '%A%'",
        resultClass = Company.class
)

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {
    @Query(nativeQuery = true)
    List<Company> retrieveExactCompany (@Param("NAME") String name);


    // @Query(nativeQuery = true)
    // List<Company> retrieveCompanyWithA (@Param("NAME") String name);
}
