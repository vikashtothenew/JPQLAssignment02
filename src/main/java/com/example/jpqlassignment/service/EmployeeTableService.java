package com.example.jpqlassignment.service;

import com.example.jpqlassignment.model.EmployeeTable;
import com.example.jpqlassignment.repository.EmployeeTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service

public class EmployeeTableService {
    @Autowired
    private EmployeeTableRepository repository;


    public List<EmployeeTable> findAllEmployee(){
        return repository.findAllEmployees();
    }
//
    public List<String> findEmployeePartialData(){
        List<String> partialData = new ArrayList<>();

        List<Object[]> repoData = repository.findPartialData();

        for(Object[] object : repoData){
            partialData.add("FirstName : "+object[0]+" LastName : "+object[1]+" Age :"+object[2]);
        }

        return partialData;
    }

    @Transactional
    public void deleteEmployeeDetail(){
        repository.deleteFromEmployeeTable();
    }

    @Transactional
    public void updateEmployeeDetail(Long newsalary){
        repository.updateSomeData(newsalary);
    }

//    public void deleteByEmployeeId(Integer id){
//        repository.deleteById();
//    }

}
