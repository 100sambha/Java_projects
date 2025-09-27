package com.student.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.student.model.Student;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	String query1 = "select * from student where roll_number = :rollNumber && department = :department";
	@Query(nativeQuery = true, value = query1)
	public Optional<Student> getStudentByRollNumber(@Param("rollNumber") int rollNumber, @Param("department") int department);
	
	String query2 = "UPDATE Student s SET s.year = :year WHERE s.roll_Number = :rollNumber AND s.department = :department";
	@Modifying
	@Query(nativeQuery = true, value = query2)
	public int updatestudYear(@Param("rollNumber") int rollnumber,@Param("department") int dept,@Param("year") int year);
	
	
}