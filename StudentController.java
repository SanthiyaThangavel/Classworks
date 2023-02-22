package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
	@Value("${value.Name}")
	private String newnameString;
	@GetMapping("/")
	public String homepage() {
		return newnameString+" to student list";
	}
	
	@GetMapping("/List")
	public List<Student> getList(){
		List<Student> detailsList = new ArrayList<>();
		detailsList.add(new Student(1,"Riya",2));
		detailsList.add(new Student(2,"Aakash",5));
		detailsList.add(new Student(3,"keerthi",1));
		return detailsList;
	}
}
