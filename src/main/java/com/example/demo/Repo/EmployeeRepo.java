package com.example.demo.Repo;

import com.example.demo.Entity.Employee;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EntityScan
@EnableJpaRepositories
@Repository


    public interface EmployeeRepo extends JpaRepository<Employee,Integer>
    {

        @Query// (value="select * from Employee",nativeQuery=true)
        Employee findByPersonID(@Param("id")  int PersonID);
    }

