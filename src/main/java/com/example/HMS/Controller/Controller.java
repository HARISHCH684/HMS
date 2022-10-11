package com.example.HMS.Controller;


	import java.util.List;
	import java.util.stream.Stream;
	import java.util.stream.Collectors; 

	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.example.HMS.Entity.PatientDetails;

	@RestController
	@CrossOrigin(origins="*")
	public class Controller {
		
		
		@GetMapping("PatientDetails")
		public List<PatientDetails> getPatients(){
			
			return Stream.of(new PatientDetails("12345", "ch","North",22,1234567890),
					new PatientDetails("12346", "chh","South",23,1234567891),
					new PatientDetails("12347", "chhh","West",24,1234567892)).collect(Collectors.toList());
			
		}

	

	

}
