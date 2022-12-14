package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends  JpaRepository<Employee, Long>{

}
