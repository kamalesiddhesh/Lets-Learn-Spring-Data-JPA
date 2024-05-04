package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Transactional
	@Modifying( /* clearAutomatically = true */)
	@Query(value="UPDATE Employee e SET e.empName=:name,e.empGender=:gender WHERE e.empId=:id ",nativeQuery = false)
	public int updateRecord(@Param("name") String name,@Param("gender") String gender,@Param("id") int id);
	
	@Transactional
	@Modifying
	@Query(value="Insert into Employee (empId,empName,empSalary,empGender,dept) VALUES (:id,:name,:salary,:gender,:dept)")
	public int insertRecord(@Param("id") int id, @Param("name") String name,@Param("salary") double salary,@Param("gender") String gender,@Param("dept") String dept);
	
	

}
