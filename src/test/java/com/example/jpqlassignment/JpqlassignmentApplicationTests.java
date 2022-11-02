package com.example.jpqlassignment;

import com.example.jpqlassignment.model.*;
import com.example.jpqlassignment.repository.EmployeeTableRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class JpqlassignmentApplicationTests {
//	@Autowired
//	EmployeeRepository repository;
//
//	@Test
//	public void testComponentMapping(){
//		Employee employee = new Employee();
//		employee.setId(1443);
//		employee.setName("Vikash Rai");
//
//		Address address = new Address();
//		address.setCity("Varanasi");
//		address.getStreetaddress("Assi-ghat");
//		address.setCountry("India");
//		address.setState("UP");
//		address.setZipcode("221010");
//
//		employee.setAddress(address);
//
//		repository.save(employee);
//	}
//	@Autowired
//	PaymentRepository repository;
//
//	@Test
//	public void testCredit(){
//		CreditCard cc = new CreditCard();
//		cc.setId(123);
//		cc.setAmount(5000);
//		cc.setCardNumber("124567");
//		repository.save(cc);
//	}
//
//	@Test
//	public void testCheque(){
//		Cheque cq = new Cheque();
//		cq.setId(4123);
//		cq.setAmount(7000);
//		cq.setChequeNumber("82824567");
//		repository.save(cq);
//	}


	@Autowired
	EmployeeTableRepository repository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void testCreate(){
//		EmployeeTable emp1 = new EmployeeTable();
//		EmployeeTable emp2 = new EmployeeTable();
//		EmployeeTable emp3 = new EmployeeTable();
//		EmployeeTable emp4 = new EmployeeTable();
//
//		emp1.setEmpFirstName("Vikash");
//		emp1.setEmpLastName("Rai");
//		emp1.setEmpAge(22);
//		emp1.setEmpSalary(45000);
//
//		emp2.setEmpFirstName("Prakash");
//		emp2.setEmpLastName("Singh");
//		emp2.setEmpAge(21);
//		emp2.setEmpSalary(42000);
//
//		emp3.setEmpFirstName("Mainuddin");
//		emp3.setEmpLastName("Rizvi");
//		emp3.setEmpAge(23);
//		emp3.setEmpSalary(45000);
//
//		emp4.setEmpFirstName("Srijan");
//		emp4.setEmpLastName("Singh");
//		emp4.setEmpAge(21);
//		emp4.setEmpSalary(35000);
//
//		repository.save(emp1);
//		repository.save(emp2);
//		repository.save(emp3);
//		repository.save(emp4);
//	}
//
//	@Test
//	public void testFindAllEmployees(){
//		System.out.println(repository.findAllEmployees());
//	}
//


//	Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
//	@Test
//	public void testFindPartialData(){
//		List<EmployeeTable> partialData = repository.findPartialData();
////		for(Object [] objects : partialData){
////			System.out.println(objects[0]+" "+objects[1]);
////		}
//
//	}


	// Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
//	@Test
//	public void testUpdate(){
//		repository.updateSomeData(newsalary);
//	}

	// Delete all employees with minimum salary.
	@Test
	public void testDelete(){
		repository.deleteFromEmployeeTable();
	}
//
//	@Test
//	public void testAllEmployeeByFirstName(){
//		System.out.println(repository.findAllEmployeeByFirstName("Prakash"));
//	}
//	@Test
//	public void testFindAllNativeEmployee(){
//		System.out.println(repository.findAllNativeEmployees());
//	}
//
//	@Test
//	public void testFindSortedData(){
//		System.out.println(repository.findSortedData());
//	}
//


//Display the id, first name, age of all employees where last name ends with "singh"
//	@Test
//	public void testFindByLastName(){
//		List<Object []> partialData=repository.findAllEmployeeByLastName("Singh");
//		for(Object [] objects : partialData){
//			System.out.println(objects[0]);
//			System.out.println(objects[1]);
//		}
//	}
//

//Delete all employees with age greater than 45(Should be passed as a parameter)
//	@Test
//	@Transactional
//	public void testDeleteByAge(){
//		repository.deleteByAge(45);
//	}
}
