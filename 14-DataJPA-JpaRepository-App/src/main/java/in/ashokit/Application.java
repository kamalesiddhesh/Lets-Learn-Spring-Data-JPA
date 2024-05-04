package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import ch.qos.logback.core.status.StatusUtil;
import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt= SpringApplication.run(Application.class, args);
		EmployeeRepository repo= ctxt.getBean(EmployeeRepository.class);
		System.out.println("14-DataJpa-JpaRepository-App");
		System.out.println(repo.getClass().getName());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
//---------------------------------------------------------------------------------------
		
//		Employee e2 = new Employee( null, "Orlen", 5000.00, "Male", "Sales", null, null);
//		Employee e3 = new Employee( null, "Charles", 15000.00, "Male", "Admin", null, null);
//		Employee e4 = new Employee( null, "Smith", 25000.00, "Male", "Marketing", null, null);
//		Employee e5 = new Employee( null, "Cathy", 35000.00, "Fe-Male", "Account", null, null);
//		Employee e6 = new Employee( null, "Robert", 45000.00, "Male", "HR", null, null);
//		Employee e7 = new Employee( null, "David", 55000.00, "Male", "Manager", null, null);
//		Employee e8 = new Employee( null, "Thomas", 58000.00, "Male", "Tech Lead", null, null);
//
////		repo.save(e1);
//		repo.saveAll(Arrays.asList(e2,e3,e4,e5,e6,e7,e8));
//		System.out.println("records saved..........");
// -------------------------------------------------------------------------------------------
//		Sort sort = Sort.by("empName").ascending();
//		Sort sort = Sort.by("empName","empSalary").descending();
//		List<Employee> emps = repo.findAll(sort);
//		emps.forEach(System.out :: println);

// --------------------------Pagination in findAll Method -----------------------------------------------------------------
		
//		int pageNo = 1;		
//		
//		PageRequest page = PageRequest.of(pageNo-1,4); // IMP
//		//PageRequest page = PageRequest.of(pageNo-1,3,sort);
//		Page<Employee> findAll =  repo.findAll(page);
//		List<Employee> emps = findAll.getContent();
//		
//		emps.forEach(System.out :: println);
//		System.out.println();
// --------------------------- Query By Example (Dynamic Query)---------------------------------------------------------------------------
		
//		Employee emp =  new Employee();
//		emp.setEmpGender("Male");
//		
//		Example<Employee> exmp = Example.of(emp);
//		
//		List<Employee> emps = repo.findAll(exmp); 
//		emps.forEach(System.out :: println);	
		
// -----------------------------Assignment : Updation by Custom query---------------------------------------------------
		
//		int updateCount =  repo.updateRecord("Dove","Fe-Male",7);
//	
//		if(updateCount>0) {
//			System.out.println("Record Updated........");
//		}
//		else {
//			System.out.println("Record Not Updated..........");
//		}
// ---------------------------- Assignment : Insert using custom query ---------------------------------
//		int insertCount =  repo.insertRecord(8,"Sansa",400.00,"Fe-Male","IT");
//		
//		if(insertCount>0) {
//			System.out.println("Record inserted........");
//		}
//		else {
//			System.out.println("Record Not Inserted..........");
//		}

// --------------------------------------------------------------------------------------------------------

// =========================== TimeStamps in JPARepository ==============================================
		System.out.println("====================================TimeStamps In JPARepository=========================================================");
//		Employee emp = new Employee();
//		
//		emp.setEmpName("Mohak");
//		emp.setDept("Sales");
//		emp.setEmpGender("Male");
//		
//		Employee  e = repo.save(emp);
//		System.out.println("Record Inserted.......");
//		System.out.println(e);
		
	}

}
