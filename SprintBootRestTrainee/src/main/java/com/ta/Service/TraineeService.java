package com.ta.Service;

import java.util.List;

import com.ta.Entity.Trainee;

public interface TraineeService {
	
	Trainee addTrainee(Trainee trainee);
	
	Trainee updateTrainee(Trainee trainee);
	
	String  deleteTrainee(int tid);
	
	Trainee getTrainee(int tid);
   
	List<Trainee> getAllTrainee();


}
