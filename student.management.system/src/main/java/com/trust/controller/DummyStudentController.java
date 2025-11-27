//package com.trust.controller;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.trust.dto.StudentRequest;
//
//@RestController
//@RequestMapping("/d-student")
//public class DummyStudentController {
//	
//	
//	List<StudentRequest> studentRequests = new ArrayList<>(List.of(
//		    new StudentRequest(1, "Aarav", "Sharma", LocalDate.parse("2005-03-15"), 25000.0f, "9765498763", LocalDate.parse("2020-06-10")),
//		    new StudentRequest(2, "Vivaan", "Patel", LocalDate.parse("2004-07-20"), 26000.0f, "9876543210", LocalDate.parse("2020-06-12")),
//		    new StudentRequest(3, "Aditya", "Verma", LocalDate.parse("2006-01-10"), 24000.0f, "9753124680", LocalDate.parse("2020-06-15")),
//		    new StudentRequest(4, "Krishna", "Mehta", LocalDate.parse("2005-11-05"), 23000.0f, "9988776655", LocalDate.parse("2020-06-18")),
//		    new StudentRequest(5, "Ishaan", "Singh", LocalDate.parse("2004-09-25"), 27000.0f, "9898989898", LocalDate.parse("2020-06-20")),
//		    new StudentRequest(6, "Rohan", "Gupta", LocalDate.parse("2005-04-30"), 25500.0f, "9123456789", LocalDate.parse("2020-06-22"))
//		));
//
//	
//	@PostMapping("/create")
//	public String createStudent(@RequestBody StudentRequest newstudent) {
//		studentRequests.add(newstudent);
//		return "Student saved succesfuuly";
//	}
//	
//	@GetMapping("/get-all")
//	public List<StudentRequest> getAllStudent() {
//		
//		return studentRequests;
//	}
//	
//	@PutMapping("/update")
//	public String update(@RequestBody StudentRequest request) {
//		StudentRequest stdReq= studentRequests.stream().filter(std->std.getId()==request.getId()).findFirst().get();
//		  if(request!=null) {
//			  studentRequests.set(studentRequests.indexOf(stdReq), request);
//			  return "Student update succesfully";
//		  }
//		return "failed Student not found";
//	}
//	@DeleteMapping("/delete/{id}")
//	public String deleteStudent(@PathVariable int id ) {
//		boolean b=studentRequests.removeIf(std->std.getId()==id);
//		 return b?"student deleted succesfully":"failed student not found";
//	}
//
//}
