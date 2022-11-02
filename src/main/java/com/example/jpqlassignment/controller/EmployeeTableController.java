package com.example.jpqlassignment.controller;

import com.example.jpqlassignment.model.EmployeeTable;
import com.example.jpqlassignment.service.EmployeeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employeetable")
public class EmployeeTableController {

    @Autowired
    private EmployeeTableService employeeTableService;
//
    @GetMapping("/all")
    public ResponseEntity<List<EmployeeTable>> getAllEmployee(){
            List<EmployeeTable> employeeList = employeeTableService.findAllEmployee();
            return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @GetMapping("/partialData")
    public List<String> getPartialData(){
           List<String> partialData = employeeTableService.findEmployeePartialData();
           return partialData;
    }
//
    @PutMapping(value="/updateSalary/{newsalary}")
    public void updateEmployeeTable(@PathVariable Long newsalary){
        employeeTableService.updateEmployeeDetail(newsalary);
    }

    @DeleteMapping ("/deleteData")
    public void deleteData(){
        employeeTableService.deleteEmployeeDetail();
    }


}
