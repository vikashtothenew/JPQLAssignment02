package com.example.jpqlassignment.repository;

import com.example.jpqlassignment.model.EmployeeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeTableRepository extends JpaRepository<EmployeeTable,Long> {

    @Query("from EmployeeTable")
    List<EmployeeTable> findAllEmployees();
    @Query("SELECT empFirstName, empLastName, empAge from EmployeeTable " +
            "WHERE empSalary > (SELECT avg(empSalary) from EmployeeTable) " +
            "ORDER BY empAge ASC, empSalary DESC")
    List<Object[]> findPartialData();

    @Modifying
    @Query(value="UPDATE employee_table SET emp_salary=:salary" +
            " WHERE emp_salary > (SELECT * FROM (SELECT avg(emp_salary) " +
            "FROM employee_table) as x)", nativeQuery = true)
    void updateSomeData(@Param("salary") Long salary);

    @Modifying
    @Query(value="DELETE FROM employee_table WHERE emp_salary = (SELECT * FROM (SELECT min(emp_salary) " +
            "FROM employee_table) as x)",nativeQuery = true)
    void deleteFromEmployeeTable();


    @Query(value="select emp_first_name,emp_age from employee_table " +
            "where emp_last_name=:lastName",nativeQuery = true)
    List<Object []> findAllEmployeeByLastName(@Param("lastName") String lastName);

//    @Modifying
//    @Query(value="delete from employee_table where emp_age>:age",nativeQuery = true)
//    void deleteByAge(@Param("age") int age);

    //    @Query("from EmployeeTable")
//    List<EmployeeTable> findAllEmployees();
//
//    @Query("select empFirstName, empLastName from EmployeeTable")
//    List<Object[]> findPartial();

//    @Query("from EmployeeTable where empFirstName=:firstName")
//    List<EmployeeTable> findAllEmployeeByFirstName(@Param("firstName") String firstName);

    //    @Query(value = "select * from employee_table where emp_salary > (select avg(emp_salary) from employee_table) order by emp_salary DESC",nativeQuery = true)
//    List<EmployeeTable> findSortedData();

//    @Query(value="select * from employee_table",nativeQuery = true)
//    List<EmployeeTable> findAllNativeEmployees();
}
