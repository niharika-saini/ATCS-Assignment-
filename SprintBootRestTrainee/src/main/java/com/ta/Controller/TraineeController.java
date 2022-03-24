package com.ta.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ta.Entity.Trainee;
import com.ta.Service.TraineeService;

@RestController
@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired
	TraineeService service;
	
	
	@PostMapping("/addTrainee")
	public Trainee addTrainee(@RequestBody Trainee  trainee) {
		return service.addTrainee(trainee);
	}
	
	@PutMapping("/updateTrainee")
	public Trainee updateTrainee(@RequestBody Trainee trainee) {
		return service.updateTrainee(trainee);
	}
	
	
	@GetMapping("/getTrainee/{id}")
	public Trainee getTrainee(@PathVariable("id") int  tid) {
		return service.getTrainee(tid);
	}
	
	@GetMapping("/getAllTrainee")
	public List<Trainee> getAllTrainee() {
		return service.getAllTrainee();
	}
	
	
	@DeleteMapping("/deleteTrainee/{id}")
	public String deleteTrainee(@PathVariable("id") int tid) {
		return service.deleteTrainee(tid);
	}
	
	
	
	
	
	

}
